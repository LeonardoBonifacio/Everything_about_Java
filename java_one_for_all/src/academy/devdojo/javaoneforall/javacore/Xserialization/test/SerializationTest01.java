package academy.devdojo.javaoneforall.javacore.Xserialization.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import academy.devdojo.javaoneforall.javacore.Xserialization.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.Xserialization.domain.Student;


public class SerializationTest01 {
    //Basicaly serialization is put one object inside a file
    public static void main(String[] args) {
        Student student = new Student(1L, "William Suane", "121212");
        Seminar seminar = new Seminar("Special Seminar");
        student.setSeminar(seminar);
        serialize(student);
        dserialize();
    }


    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void dserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
