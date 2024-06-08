package br.com.vanar;

import br.com.vanar.Entity.*;
import br.com.vanar.configuration.ConnectionFactory;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        UserModel user = getUser();

        try {

            user = salvar(user);
            System.out.println(user);

        }catch (SQLException ex){
            System.out.println("Erro no banco  de dados: " + ex.getMessage());
        }

        ProductModel product = getProduct();

        product.setUser(user.id);

        try {

            product = salvar(product);
            System.out.println(product);

        }catch (SQLException ex){
            System.out.println("Erro no banco  de dados: " + ex.getMessage());
        }


        EventModel event = getEvent();
        event.setUser(user.id);

        try {

            event = salvar(event);
            System.out.println(event);

        }catch (SQLException ex){
            System.out.println("Erro no banco  de dados: " + ex.getMessage());
        }

    }

    private static UserModel getUser(){


        String nm_nome = JOptionPane.showInputDialog("Nome do usuario");
        Integer id_gender = Integer.parseInt(JOptionPane.showInputDialog("Genero do usuario:"));
        String nm_country = JOptionPane.showInputDialog("Pais de origem");
        String nm_state = JOptionPane.showInputDialog("Estado");
        String nm_city = JOptionPane.showInputDialog("Cidade");
        String nm_email = JOptionPane.showInputDialog("E-mail");
        String nm_password = JOptionPane.showInputDialog("Senha");

        return new UserModel(nm_nome, id_gender, nm_country, nm_state, nm_city, nm_email, nm_password);
    }

    private static UserModel salvar(UserModel user) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        var con = factory.connect();

        var sql = "INSERT INTO T_SIP_USER(id, id_user_type, nm_nome, id_gender, nm_country, nm_state, nm_city, nm_email, nm_password) VALUES (T_SIP_USER_ID_SEQ.nextval, 1, ?, ?, ?, ?, ?, ?, ?)" ;

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            ps = con.prepareStatement(sql, new String[]{"id"});
            ps.setString(1, user.getNm_nome());
            ps.setString(2, user.getId_gender().toString());
            ps.setString(3, user.getNm_country());
            ps.setString(4, user.getNm_state());
            ps.setString(5, user.getNm_city());
            ps.setString(6, user.getNm_email());
            ps.setString(7, user.getNm_password());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if(rs.next()){
                Integer id = rs.getInt(1);
                user.setId(id);
            }


        }catch (SQLException ex){

            System.err.println("Não foi possível salvar o telefone no banco de dados: " + ex.getMessage());

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return user;
    }

    private static ProductModel getProduct(){


        String nm_name = JOptionPane.showInputDialog("Nome do produto");
        String nm_description = JOptionPane.showInputDialog("Descricao do produto");
        Float vl_blue_price = Float.parseFloat(JOptionPane.showInputDialog("Custo do produto em blue coins")) ;

        return new ProductModel(nm_name, nm_description, vl_blue_price);
    }

    private static ProductModel salvar(ProductModel product) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        var con = factory.connect();

        var sql = "INSERT INTO T_SIP_PRODUCT(id_user, nm_name, nm_description, vl_blue_price) VALUES (?, ?, ?, 10)" ;

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, product.getUser().toString());
            ps.setString(2, product.getNm_name());
            ps.setString(3, product.getNm_description());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if(rs.next()){
                Integer id = rs.getInt(1);
                product.setId(id);
            }


        }catch (SQLException ex){

            System.err.println("Não foi possível salvar o telefone no banco de dados: " + ex.getMessage());

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return product;
    }

    private static EventModel getEvent(){

        String nm_name = JOptionPane.showInputDialog("Nome do Evento");
        String nm_address = JOptionPane.showInputDialog("Endereço do evento");
        String nm_description = JOptionPane.showInputDialog("Descriçao do evento");
        Float vl_blue_reward = Float.parseFloat(JOptionPane.showInputDialog("recompensa em blue coins:"));

        return new EventModel(nm_name, nm_address, nm_description, vl_blue_reward);
    }

    private static EventModel salvar(EventModel event) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        var con = factory.connect();

        var sql = "INSERT INTO T_SIP_EVENT(id_user, nm_name, nm_address, nm_description, vl_blue_reward) VALUES (?, ?, ?, ?, 10)" ;

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, event.getUser().toString());
            ps.setString(2, event.getNm_name());
            ps.setString(3, event.getNm_address());
            ps.setString(4, event.getNm_description());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if(rs.next()){
                Integer id = rs.getInt(1);
                event.setId(id);
            }


        }catch (SQLException ex){

            System.err.println("Não foi possível salvar o telefone no banco de dados: " + ex.getMessage());

        } finally {
            rs.close();
            ps.close();
            con.close();
        }

        return event;
    }
}