package model;

public enum AGenius {
    DOG ("Собака"),
    CAT ("Кошка"),
    HAMSTER ("Хомяк"),
    HORSE ("Лошадь"),
    CAMEL ("Верблюд"),
    DONKEY ("Осёл");

    private String title;
    AGenius(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
