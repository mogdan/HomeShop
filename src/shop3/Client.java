package shop3;

public class Client {
    private String fullName;
    private String address;


    public Client(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getFullname() {
        return fullName;
    }
}
