package model.implement;

import model.APet;
import model.AGenius;

import java.time.LocalDate;

public class Dog extends APet {
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.DOG);
    }
}
