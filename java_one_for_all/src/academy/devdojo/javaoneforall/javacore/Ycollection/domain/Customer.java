package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private Long id;
    private String name;

    public Customer( String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000); // generate Id from this bound
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Customer otherCustomer = (Customer) obj;
        return Objects.equals(this.id, otherCustomer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        return "Customer{Id: " + this.id + ", Name: " + this.name + "}";
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    
}
