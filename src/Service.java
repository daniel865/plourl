import java.util.Collection;

public class Service {

    private final Integer id;
    private final User driver;
    private final Offer offer;
    private final STATUS status;
    private final Collection<Availability> availabilities;

    public Service(Integer id, User driver, Offer offer, STATUS status, Collection<Availability> availabilities) {
        this.id = id;
        this.driver = driver;
        this.offer = offer;
        this.status = status;
        this.availabilities = availabilities;
    }

    public Integer getId() {
        return id;
    }

    public User getDriver() {
        return driver;
    }

    public Offer getOffer() {
        return offer;
    }

    public STATUS getStatus() {
        return status;
    }

    public Collection<Availability> getAvailabilities() {
        return availabilities;
    }

    public enum STATUS {
        ABIERTA,
        EN_PROCESO,
        FINALIZADA
    }

}
