package model.implement;

import model.APet;
import model.AGenius;

import java.time.LocalDate;

public class Cat extends APet {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.CAT);
    }
}
