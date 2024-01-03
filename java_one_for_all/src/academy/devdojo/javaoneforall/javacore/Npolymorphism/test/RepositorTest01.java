package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.DataBaseRepositoryService;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.FileRepositoryService;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

public class RepositorTest01 {
    public static void main(String[] args) {
        // this Test file is going to use Interface oriented Programing
        // in which One interface(Repository) is going to be implemented by 3
        // services(DataBaseRepositoryService, InMemoryRepositoryService,
        // and FileRepositoryService)

        // this way is the way to do without interface oriented programing
        // DataBaseRepositoryService dbService = new DataBaseRepositoryService();
        // dbService.save();

        // this way is way to do with interface oriented programing
        // where your reference variables should be interfaces, and the object which
        // they hold is the objects from the class who implements this interface
        // it doesn't matter the type which we are sending this reference variable will
        // always be able to call the save method(inside the interface repository and
        // which is implemented by different ways for each Service class)
        Repository repository = new InMemoryRepositoryService();
        // Repository repository = new DataBaseRepositoryService();
        // Repository repository = new InMemoryRepositoryService();
        // this is only possible because all services is point to the same
        // interface(which have the method save() that are being implemented by each
        // Class service), it is well like polymorphism
        repository.save();

        List<String> list = new LinkedList<>();
        list.add("Leonardo");
        list.add("Bonifácio");
        list.add("Vieira");
        list.add("Santos");
        System.out.println(list);
        for (String name : list) {
            System.out.print(name + " ");
        }
        // small example
        // List is a interface and there are several classes that are providing
        // implementation for the list, so you can have
        // different types of list(arrayList, linkedList, etc)
    }

}
