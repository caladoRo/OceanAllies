package br.com.vanar.Entity;

public class ProductModel {
    private Integer id;
    private Integer user;
    private String nm_name;
    private String nm_description;
    private Float vl_blue_price;

    public ProductModel() {
    }

    public ProductModel(Integer id, Integer user, String nm_name, String nm_description, Float vl_blue_price) {
        this.id = id;
        this.user = user;
        this.nm_name = nm_name;
        this.nm_description = nm_description;
        this.vl_blue_price = vl_blue_price;
    }

    public ProductModel(String nm_name, String nm_description, Float vl_blue_price) {
        this.nm_name = nm_name;
        this.nm_description = nm_description;
        this.vl_blue_price = vl_blue_price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getNm_name() {
        return nm_name;
    }

    public void setNm_name(String nm_name) {
        this.nm_name = nm_name;
    }

    public String getNm_description() {
        return nm_description;
    }

    public void setNm_description(String nm_description) {
        this.nm_description = nm_description;
    }

    public Float getVl_blue_price() {
        return vl_blue_price;
    }

    public void setVl_blue_price(Float vl_blue_price) {
        this.vl_blue_price = vl_blue_price;
    }
}
