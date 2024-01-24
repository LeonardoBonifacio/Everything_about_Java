package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

public class Seminar {
    private String name;

    public Seminar(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Seminar{Name = " +this.name + "}";
    }
}
