public class Notification {

    private final Integer id;
    private final User from;
    private final User to;
    private final TYPE type;
    private final String description;
    private final String linkDetails;

    public Notification(Integer id, User from, User to, TYPE type, String description, String linkDetails) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.type = type;
        this.description = description;
        this.linkDetails = linkDetails;
    }

    public Integer getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public TYPE getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkDetails() {
        return linkDetails;
    }

    public enum TYPE {
        OFERTA_ACEPTADA,
        OFERTA_NOTIFICADA
    }

}
