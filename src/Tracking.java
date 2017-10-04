public class Tracking {

    private final Integer id;
    private final Service service;
    private final Long latitude;
    private final Long longitude;

    public Tracking(Integer id, Service service, Long latitude, Long longitude) {
        this.id = id;
        this.service = service;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public Service getService() {
        return service;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
        return longitude;
    }
}
