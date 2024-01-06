package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public abstract class AAnimal {
    private static int counter;
    private final int id = ++counter;

    private AGenius aGenius;

    private String name;

    private LocalDate birthDate;

    private List<Skill> aSkills;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public AGenius getAGenius() {
        return aGenius;
    }

    public void setAGenius(AGenius aGenius) {
        this.aGenius = aGenius;
    }

    public List<Skill> getASkills() {
        return aSkills;
    }

    public AAnimal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        aSkills = new ArrayList<>();
    }

    public String getBurthDateAsString() {
        return String.format("%02d-%02d-%4d", birthDate.getDayOfMonth(), birthDate.getMonthValue(),
                birthDate.getYear());
    }

    public int getAge() {
        int years = Period.between(birthDate, LocalDate.now()).getYears();
        int months = Period.between(birthDate, LocalDate.now()).getMonths();
        return years * 12 + months;
    }


    public boolean learnSkill(Skill newSkill) {
        if (aSkills.contains(newSkill)){
            return false;
        }
        aSkills.add(newSkill);
        return true;
    }

    @Override
    public String toString() {
        return "AAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
