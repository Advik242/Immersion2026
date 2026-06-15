public class Customer {
    private int customerId;
    private String customerName;
    private String mobileNumber;

    public Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Mobile Number : " + mobileNumber);
    }

    public String getCustomerName() {
        return customerName;
    }
}
