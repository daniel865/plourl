import java.math.BigDecimal;
import java.util.Collection;

public class Offer {

    private final Integer id;
    private final STATUS status;
    private final BigDecimal value;
    private final Collection<Request>  requests;
    private final User user;

    public Offer(Integer id, STATUS status, BigDecimal value, Collection<Request> requests, User user) {
        this.id = id;
        this.status = status;
        this.value = value;
        this.requests = requests;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public STATUS getStatus() {
        return status;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Collection<Request> getRequests() {
        return requests;
    }

    public User getUser() {
        return user;
    }

    public enum STATUS {
        EN_PROGRESO,
        FINALIZADA
    }

}
