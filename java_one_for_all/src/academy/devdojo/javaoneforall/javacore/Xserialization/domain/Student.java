package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 2860882953976732707L;
    private Long id;
    private String name;
    private transient String password;
    private transient Seminar seminar;
    private final static String SCHOOL_NAME = "LeoAcademy";// static attribute are serializable(even thought they has the same value for all objects that belong to the class)
    // keyword transient is used for telling to java that this attribute(password), do not store and do not read back this password
    // when you dserialize this file with this object Student

    public Student(Long id, String name, String password){
        System.out.println("Inside Constructor of Student");
        this.id = id;
        this.name = name;
        this.password = password;
    }


    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();            
            oos.writeUTF(this.seminar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject(); 
            String seminarName = ois.readUTF();     
            this.seminar = new Seminar(seminarName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    @Override
    public String toString() {
        return "Student{ " + "id = " + this.id + ", name = " + this.name + ", password = " + this.password + ", Seminar = " +this.seminar + ", School name = " + SCHOOL_NAME + "}";
    }
}
