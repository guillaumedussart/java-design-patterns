package fr.diginamic.builder;

import java.util.HashSet;

public class ZoneBuilder {

    private String name;
    private Zoo zoo;

    public ZoneBuilder() {
    }

    public ZoneBuilder(String name) {
        this.zoo = new Zoo(name);
    }

    public ZoneBuilder appendZone(String name, int capacity) {
        Zone zone = new Zone(name, capacity);
        this.zoo.getZones().add(zone);
        return this;
    }

    public ZoneBuilder appendAnimal(String nameZone, Animal animal) {

        for (Zone zone : this.zoo.getZones()) {
            if (zone.getName().equals(nameZone)) {
                zone.getAnimals().add(animal);
            }
        }
        return this;
    }

    public Zoo getZoo() {


        return zoo;
    }

}
