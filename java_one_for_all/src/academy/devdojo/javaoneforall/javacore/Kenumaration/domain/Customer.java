package academy.devdojo.javaoneforall.javacore.Kenumaration.domain;

public class Customer {
    // we can also create an enumeration class type inside our own class like this
    // but we still have to create an association with this enum type
    // public enum PaymentType {
    //     // if we don't have any access modifier , everything in the same
    //     // package can access the attributes directly without passing through getter or
    //     // setter
    //     DEBIT, 
    //     CREDIT
    // }

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;
    // when you add a type of enumeration you are adding by association(each object
    // has only one enumeration type)

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Custumer name: " + this.name + 
              "\nCustomer Type " + this.customerType.getReportValue()
             + "\nPayment Type " + this.paymentType +
                "\nCustomer Type DataBase value: " + this.customerType.getDb_value() +
                "\n--------------------------";
    }

    // private String type;
    // public static final String INDIVIDUAL = "INDIVIDUAL";
    // public static final String COMPANY = "COMPANY";
    // // creating two constant for validation of data when i create an object

    // public Customer(String name, String type) {
    // if (!type.equals(INDIVIDUAL) && !type.equals(COMPANY)) {
    // return;
    // }
    // this.name = name;
    // this.type = type;
    // }

    // @Override
    // public String toString() {
    // return "Customer name: " + this.name + "\nCustomer Type: " + this.type +
    // "\n--------------------";
    // }
}
