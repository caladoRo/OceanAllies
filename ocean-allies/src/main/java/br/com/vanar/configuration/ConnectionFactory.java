package br.com.vanar.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory implements Connectable {

    @Override
    public Connection connect() {

        var config = new HikariConfig();
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");

        config.setUsername("system");
        config.setPassword("CarolCaca12!");
        config.setMaximumPoolSize(3);

        var dataSource = new HikariDataSource(config);

        try {
            return dataSource.getConnection();

        }catch (SQLException ex){
            System.err.println("Não foi possível realizar a conexão com o Banco de Dados:" + ex.getMessage());
        }

        return null;
    }
}
