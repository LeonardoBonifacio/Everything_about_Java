package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

public class Smartphone extends Object{
    private String serialnumber;
    private String name;


    public Smartphone(String serialnumber, String name) {
        this.serialnumber = serialnumber;
        this.name = name;
    }

    // keyword native in a method means that the implementation for this method was written in another language
    // rules for hashCode
    // if x.equals(y) == true , so y.hashcode() == x.hashcode()
    // another rule
    // if y.hashcode() == x.hashcode(), doens't mean that y.equals(x) == true
    // if you have x.equals(y) == false , you don't have to worry about hashcode
    // if y.hashcode() != x.hashcode() , so x.equals(y) should be false
    @Override
    public int hashCode() {
        return this.serialnumber == null ? 0 : this.serialnumber.hashCode();
        // here i'm using the hashcode provide by String Class
        // in that if the serialnumber is null, the hashcode raise one NullPointerException
        // for that which i'm going to pass 0 if the serialnumber == null
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone otherSmartphone = (Smartphone) obj;
        // our statement of objects this class are the same is if the serial number of this two objects are the same
        return this.serialnumber != null && this.serialnumber.equals(otherSmartphone.getSerialnumber());
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Smartphone's name: " + this.name + " Smartphone's serialNumber: " + this.serialnumber;
    }
}
