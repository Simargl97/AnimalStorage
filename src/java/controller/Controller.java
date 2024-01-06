package controller;

import model.AAnimal;
import model.AGenius;
import model.implement.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.List;

public class Controller {

    private Storage dbAnim;

    public Controller(Storage dbAnim) {
        this.dbAnim = dbAnim;
    }

    public List<AAnimal> getAnimals() {
        return dbAnim.getAllAnimals();
    }

    public boolean createAnimal(String name, LocalDate birthDay, AGenius aGenius) {
        AAnimal animal = switch (aGenius) {
            case CAT -> new Cat(name, birthDay);
            case DOG -> new Dog(name, birthDay);
            case HAMSTER -> new Hamster(name, birthDay);
            case HORSE -> new Horse(name, birthDay);
            case CAMEL -> new Camel(name, birthDay);
            case DONKEY -> new Donkey(name, birthDay);
        };

        return dbAnim.addAnimal(animal);
    }

    public int removeAnimal(AAnimal animal) {
        if (animal == null) return -1;
        return  dbAnim.removeAnimal(animal);
    }
}
