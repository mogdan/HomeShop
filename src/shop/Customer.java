package shop;

public class Customer {
    private String fullname ="";
    private String address = "";

    public String getFullname() {
        return fullname;
    }
    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Customer(String fullname, String address){
        this.fullname = fullname;
        this.address = address;

    }

}
