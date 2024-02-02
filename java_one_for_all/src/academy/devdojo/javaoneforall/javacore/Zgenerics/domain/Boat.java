package academy.devdojo.javaoneforall.javacore.Zgenerics.domain;

import java.util.Objects;

public class Boat implements Comparable<Boat>{
    private String name;
    
    public Boat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boat{Name: " + this.name + "}";
    }

    @Override
    public int compareTo(Boat otherBoat) {
        return this.name.compareToIgnoreCase(otherBoat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Boat otherCustomer = (Boat) obj;
        return Objects.equals(this.name, otherCustomer.getName());
    }
    public String getName() {
        return name;
    }
}
