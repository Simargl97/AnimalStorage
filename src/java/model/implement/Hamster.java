package model.implement;

import model.APet;
import model.AGenius;

import java.time.LocalDate;

public class Hamster extends APet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAGenius(AGenius.HAMSTER);
    }
}
