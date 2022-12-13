package day49;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private static int ID_GENERATOR;

    public Contact() {
    }

    public Contact(String name, String email, String phoneNumber) {
        this.id = this.id=++ID_GENERATOR;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
