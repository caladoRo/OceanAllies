package br.com.vanar.Entity;
import java.util.Date;

public class UserModel {

    public Integer id;
    public UserTypeEnum id_user_type;
    public String nm_nome;
    public Date dt_birthday;
    public Integer id_gender;
    public String nm_country;
    public String nm_state;
    public String nm_city;
    public String nm_cnpj;
    public String nm_email;
    public String nm_password;
    public Float vl_blue_coins;

    public UserModel() {
    }

    public UserModel(Integer id, UserTypeEnum id_user_type, String nm_nome, Date dt_birthday, Integer id_gender, String nm_country, String nm_state, String nm_city, String nm_cnpj, String nm_email, String nm_password, Float vl_blue_coins) {
        this.id = id;
        this.id_user_type = id_user_type;
        this.nm_nome = nm_nome;
        this.dt_birthday = dt_birthday;
        this.id_gender = id_gender;
        this.nm_country = nm_country;
        this.nm_state = nm_state;
        this.nm_city = nm_city;
        this.nm_cnpj = nm_cnpj;
        this.nm_email = nm_email;
        this.nm_password = nm_password;
        this.vl_blue_coins = vl_blue_coins;
    }

    public UserModel(String nm_nome, Integer id_gender, String nm_country, String nm_state, String nm_city, String nm_email, String nm_password) {
        this.nm_nome = nm_nome;
        this.id_gender = id_gender;
        this.nm_country = nm_country;
        this.nm_state = nm_state;
        this.nm_city = nm_city;
        this.nm_email = nm_email;
        this.nm_password = nm_password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserTypeEnum getId_user_type() {
        return id_user_type;
    }

    public void setId_user_type(UserTypeEnum id_user_type) {
        this.id_user_type = id_user_type;
    }

    public String getNm_nome() {
        return nm_nome;
    }

    public void setNm_nome(String nm_nome) {
        this.nm_nome = nm_nome;
    }

    public Date getDt_birthday() {
        return dt_birthday;
    }

    public void setDt_birthday(Date dt_birthday) {
        this.dt_birthday = dt_birthday;
    }

    public Integer getId_gender() {
        return id_gender;
    }

    public void setId_gender(Integer id_gender) {
        this.id_gender = id_gender;
    }

    public String getNm_country() {
        return nm_country;
    }

    public void setNm_country(String nm_country) {
        this.nm_country = nm_country;
    }

    public String getNm_state() {
        return nm_state;
    }

    public void setNm_state(String nm_state) {
        this.nm_state = nm_state;
    }

    public String getNm_city() {
        return nm_city;
    }

    public void setNm_city(String nm_city) {
        this.nm_city = nm_city;
    }

    public String getNm_cnpj() {
        return nm_cnpj;
    }

    public void setNm_cnpj(String nm_cnpj) {
        this.nm_cnpj = nm_cnpj;
    }

    public String getNm_email() {
        return nm_email;
    }

    public void setNm_email(String nm_email) {
        this.nm_email = nm_email;
    }

    public String getNm_password() {
        return nm_password;
    }

    public void setNm_password(String nm_password) {
        this.nm_password = nm_password;
    }

    public Float getVl_blue_coins() {
        return vl_blue_coins;
    }

    public void setVl_blue_coins(Float vl_blue_coins) {
        this.vl_blue_coins = vl_blue_coins;
    }
}
