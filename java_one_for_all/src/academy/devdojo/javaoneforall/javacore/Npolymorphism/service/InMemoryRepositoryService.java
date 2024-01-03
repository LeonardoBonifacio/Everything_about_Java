package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository{
    @Override
    public void save() {
        System.out.println("Saving in the memory");
    }
}
