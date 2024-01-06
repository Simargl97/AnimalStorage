package model.implement;

import model.APAnimal;
import model.AGenius;

import java.time.LocalDate;

public class Donkey extends APAnimal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.DONKEY);
    }
}
