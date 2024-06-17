public class Customer {
    //properties
    private String customerName;
    private String customerID;
    private String location;

    //Constructor
    public Customer(String customerIDName, String customerIDID, String location) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.location = location;
    }
    //getters and setters
    public String getCustomerID() {return this.customerID;}
    public String getCustomerName() {return this.customerName;}
    public String getLocation() {return this.location;}

}
