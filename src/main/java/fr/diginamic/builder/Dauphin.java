package fr.diginamic.builder;

public class Dauphin extends Animal{
    private String name;

    public Dauphin() {
    }

    public Dauphin(String name) {
        this.name = name;
    }

    public Dauphin(String name, String name1) {
        super(name);
        this.name = name1;
    }
}
