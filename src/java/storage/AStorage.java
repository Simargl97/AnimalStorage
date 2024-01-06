package storage;

import model.AAnimal;
import model.APAnimal;
import model.APet;
import model.implement.*;
import model.Skill;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AStorage implements Storage{
    Map<Integer, AAnimal> dbAnimals = new HashMap<>();

    public AStorage() {
        init();
    }

    private void init(){
        APet cat = new Cat("Дама", LocalDate.of(2022, 7, 12));

        int per = cat.getAge();

        cat.learnSkill(new Skill("Обувь ко мне"));
        dbAnimals.put(cat.getId(), cat);

        APet dog = new Dog("Пес", LocalDate.of(2023, 1, 24));
        dog.learnSkill(new Skill("Обувь ко мне"));
        dog.learnSkill(new Skill("Thanks"));
        dbAnimals.put(dog.getId(), dog);

        APet hamster = new Hamster("Хомяк", LocalDate.of(2022, 12, 20));
        hamster.learnSkill(new Skill("Ест"));
        dbAnimals.put(hamster.getId(), hamster);

        APAnimal horse = new Horse("Чаппи", LocalDate.of(2021, 2, 4));
        horse.setLoadCapacity(300);
        horse.learnSkill(new Skill("Хей!"));
        dbAnimals.put(horse.getId(), horse);

        APAnimal horse2 = new Horse("Чаппи_2_0", LocalDate.of(2022, 12, 1));
        horse2.setLoadCapacity(400);
        horse2.learnSkill(new Skill("Хей"));
        horse2.learnSkill(new Skill("Thanks"));
        dbAnimals.put(horse2.getId(), horse2);

        APAnimal donkey = new Donkey("Ярость", LocalDate.of(2020, 8, 24));
        donkey.setLoadCapacity(500);
        donkey.learnSkill(new Skill("Thanks"));
        dbAnimals.put(donkey.getId(), donkey);

        APAnimal camel = new Camel("Дракон", LocalDate.of(2020, 5, 20));
        camel.setLoadCapacity(1000);
        camel.learnSkill(new Skill("Ррррррррр"));
        dbAnimals.put(camel.getId(), camel);
    }
    @Override
    public List<AAnimal> getAllAnimals() {
        List<AAnimal> result = new ArrayList<>();
        for (AAnimal animal: dbAnimals.values()) {
            result.add(animal);
        }
        return result;
    }

    @Override
    public AAnimal getAnimalById(int animalId) {
        return dbAnimals.getOrDefault(animalId, null);
    }

    @Override
    public boolean addAnimal(AbstractAnimal animal) {
        if (dbAnimals.containsKey(animal.getId())) {return false;}
        dbAnimals.put(animal.getId(), animal);
        return true;
    }

    @Override
    public int removeAnimal(AbstractAnimal animal) {
        if (!dbAnimals.containsKey(animal.getId())) {
            return -1;
        }
        AAnimal removed = dbAnimals.remove(animal.getId());
        return removed.getId();
    }
}
