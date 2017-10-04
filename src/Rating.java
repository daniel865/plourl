public class Rating {

    private final Integer id;
    private final User who;
    private final User whom;
    private final Service service;
    private final Integer value;
    private final String comment;

    public Rating(Integer id, User who, User whom, Service service, Integer value, String comment) {
        this.id = id;
        this.who = who;
        this.whom = whom;
        this.service = service;
        this.value = value;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public User getWho() {
        return who;
    }

    public User getWhom() {
        return whom;
    }

    public Service getService() {
        return service;
    }

    public Integer getValue() {
        return value;
    }

    public String getComment() {
        return comment;
    }
}
