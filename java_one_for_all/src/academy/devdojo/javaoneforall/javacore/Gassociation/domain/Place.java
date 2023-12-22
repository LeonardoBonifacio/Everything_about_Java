package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Place {
    private String address;

    public Place(String address){
        this.address = address;
    }

    public void print(){
        System.out.println("Address of this place: " + this.address);
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
