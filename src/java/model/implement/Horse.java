package model.implement;

import model.APAnimal;
import model.AGenius;

import java.time.LocalDate;

public class Horse extends APAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.HORSE);
    }
}
