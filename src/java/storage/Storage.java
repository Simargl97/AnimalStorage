package storage;

import model.AAnimal;

import java.util.List;

public interface Storage {

    List<AAnimal> getAllAnimals();

    AAnimal getAnimalById(int animalId);

    boolean addAnimal(AAnimal animal);

    int removeAnimal(AAnimal animal);
}
