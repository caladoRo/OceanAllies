package br.com.vanar.Entity;

public class ParticipantEventModel {

    private Integer id;
    private UserModel user;
    private EventModel event;

    public ParticipantEventModel() {
    }

    public ParticipantEventModel(EventModel event, UserModel user, Integer id) {
        this.event = event;
        this.user = user;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public EventModel getEvent() {
        return event;
    }

    public void setEvent(EventModel event) {
        this.event = event;
    }
}
