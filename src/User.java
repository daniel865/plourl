public class User {

    private final Integer id;
    private final String name;
    private final String lastname;
    private final String phone;
    private final String mobile;
    private final String photoUrl;
    private final String email;
    private final String password;
    private final TIPO_USUARIO tipo;

    public User(Integer id, String name, String lastname, String phone, String mobile, String photoUrl, String email,
                String password, TIPO_USUARIO tipo) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.mobile = mobile;
        this.photoUrl = photoUrl;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public TIPO_USUARIO getTipo() {
        return tipo;
    }

    public enum TIPO_USUARIO {
        USUARIO,
        CONDUCTOR
    }

}
