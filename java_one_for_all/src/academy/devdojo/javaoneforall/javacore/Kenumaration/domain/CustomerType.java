package academy.devdojo.javaoneforall.javacore.Kenumaration.domain;

// create a file enumeration adding 'enum' instead of 'class'
// is a special type of class that has some sort of things very usefull
// like where you can specifically work with a problem where you have to choose a selection between
// a limited amount of options
public enum CustomerType {
    // inside enumeration everything is final, CONSTANT and Static
    // THE TYPE OF THIS ATTRIBUTES IS CustumerType
    // imagine that you will have a datebase in which number 1 represents the
    // individual
    // number 2 represents the company
    // and number 3 represents the Start-up
    INDIVIDUAL(1, "Individual"), // call the constructor for fulfill this attribute/object
    COMPANY(2, "Company"), // call the constructor for fulfill this attribute/object
    START_UP(3, "Start-Up");// call the constructor for fulfill this attribute/object
    // with this 3 objects(attributes) of CustumerType anything else will not be able to create anything different
    // than this 3 allowed types inside CustumerType
    // each one of the enumerations that you have inside your enumaration class is a
    // object
    // and each one of this object(INDIVIDUAL, COMPANY, START-UP) they can have
    // their own
    // attributes, and your attributes are created by the constructor(manually
    // typed, not passing through the program)

    private int db_value;
    private String reportValue;

    // this constructor is always private, then you never call it from outside this
    // Enumeration class
    private CustomerType(int dbValue, String reportValue) {
        this.db_value = dbValue;
        this.reportValue = reportValue;
    }

    // here i create a method which return the object enumeration that contain this
    // reportValues
    // it's like valuesOf()
    public static CustomerType getByReportValue(String reportValue) {
        for (CustomerType customerType : CustomerType.values()) {
            if (customerType.getReportValue().equalsIgnoreCase(reportValue)) {
                return customerType;
            }
        }
        return null;
    }

    public int getDb_value() {
        return this.db_value;
    }

    public String getReportValue() {
        return this.reportValue;
    }
}

