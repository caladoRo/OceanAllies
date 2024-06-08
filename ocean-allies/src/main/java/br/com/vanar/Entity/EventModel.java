package br.com.vanar.Entity;

import java.time.LocalDateTime;

public class EventModel {

    private Integer id;
    private Integer user;
    private String nm_name;
    private String nm_address;
    private LocalDateTime dt_event_date;
    private String nm_description;
    private Float vl_blue_reward;

    public EventModel() {
    }

    public EventModel(Integer id, Integer user, String nm_name, String nm_address, LocalDateTime dt_event_date, String nm_description, Float vl_blue_reward) {
        this.id = id;
        this.user = user;
        this.nm_name = nm_name;
        this.nm_address = nm_address;
        this.dt_event_date = dt_event_date;
        this.nm_description = nm_description;
        this.vl_blue_reward = vl_blue_reward;
    }

    public EventModel(String nm_name, String nm_address, String nm_description, Float vl_blue_reward) {
        this.nm_name = nm_name;
        this.nm_address = nm_address;
        this.nm_description = nm_description;
        this.vl_blue_reward = vl_blue_reward;
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

    public String getNm_address() {
        return nm_address;
    }

    public void setNm_address(String nm_address) {
        this.nm_address = nm_address;
    }

    public LocalDateTime getDt_event_date() {
        return dt_event_date;
    }

    public void setDt_event_date(LocalDateTime dt_event_date) {
        this.dt_event_date = dt_event_date;
    }

    public String getNm_description() {
        return nm_description;
    }

    public void setNm_description(String nm_description) {
        this.nm_description = nm_description;
    }

    public Float getVl_blue_reward() {
        return vl_blue_reward;
    }

    public void setVl_blue_reward(Float vl_blue_reward) {
        this.vl_blue_reward = vl_blue_reward;
    }
}


