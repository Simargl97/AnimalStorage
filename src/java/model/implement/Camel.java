package model.implement;

import model.APAnimal;
import model.AGenius;

import java.time.LocalDate;

public class Camel extends APAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.CAMEL);
    }
}
