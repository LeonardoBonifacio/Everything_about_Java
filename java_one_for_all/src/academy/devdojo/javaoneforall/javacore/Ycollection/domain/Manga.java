package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

import java.util.Objects;
import java.lang.Double;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String title;
    private double price;
    private int quantity;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(title, "Title cannot be null");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Manga(Long id, String title, double price, int quantity) {
        this(id, title, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Manga {ID: " + this.id + " Title: " + this.title + " Price R$" + this.price + " Quantity: "
                + this.quantity + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Manga othermanga = (Manga) obj;
        return this.id.equals(othermanga.getId()) && this.title.equals(othermanga.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title);
    }

    @Override
    public int compareTo(Manga other) {
        // this | other are the two objects which are using for comparison
        // -1 if this < other
        // 0 if this == other
        // 1 if this > other
        // if (this.id < other.id) {
        // return -1;
        // }else if (this.id.equals(other.id)) {
        // return 0;
        // }else{
        // return 1;
        // }
        // instead of providing our own implementation of the method compareTo, since we
        // are working with Wrapper of long
        // all we have to do is use the compareTo of the Class Long
        // return this.id.compareTo(other.id);
        // or we can also let the String class do your job with the already ready method
        // compareTo of the Class String
        return this.title.compareToIgnoreCase(other.getTitle());
        // or yet we can also give the responsability for the Class Double for doing the
        // same comparation(with the same returns -1,0 or 1)
        //return Double.compare(this.price, other.getPrice());

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

}
