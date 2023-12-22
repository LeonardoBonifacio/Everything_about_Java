package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Professor02 {
    private String name;
    private String researchField;
    private Seminars[] seminars;

    public Professor02(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor02(String name, String researchField, Seminars[] seminars) {
        this(name, researchField);
        if (seminars != null && seminars.length > 0) {
            this.seminars = seminars;
        }
    }

    public void print() {
        System.out.println();
        System.out.println("     ---Professor---");
        System.out.println("  The name of this professor is: " + this.name);
        System.out.println("  The research Field of this professor is: " + this.researchField);
        if (this.seminars != null && seminars.length != 0) {
            for (Seminars seminar : this.seminars) {
                System.out.println();
                System.out.println("     ---Seminars---");
                System.out.println("  Seminar title: " + seminar.getTitle());
                System.out.println("  Seminar Place: " + seminar.getPlace().getAddress());
                if (seminar.getStudents() != null && seminar.getStudents().length != 0) {
                    System.out.println();
                    System.out.println("     ---Students---");
                    for (Student student : seminar.getStudents()) {
                        System.out.println("  Student name is: " + student.getName());
                        System.out.println("  Student age is: " + student.getAge());
                    }
                }
            }
        }
    }

    public void setSeminars(Seminars[] seminars) {
        this.seminars = seminars;
    }

    public Seminars[] getSeminars() {
        return this.seminars;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getResearchField() {
        return this.researchField;
    }

}
