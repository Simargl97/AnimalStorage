package model;

import java.time.LocalDate;

public abstract class APet extends AAnimal {
    public APet(String name, LocalDate birthDate) {
        super(name, birthDate);
    }
}
