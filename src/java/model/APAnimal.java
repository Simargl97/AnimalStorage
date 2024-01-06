package model;

import java.time.LocalDate;



public abstract class APAnimal extends AAnimal {
    public static final int DEFAULT_LOAD_CAPACITY = 100;

    private  int loadCapacity;


    public APAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.loadCapacity = DEFAULT_LOAD_CAPACITY;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
