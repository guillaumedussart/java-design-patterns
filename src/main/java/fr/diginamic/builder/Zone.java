package fr.diginamic.builder;

import java.util.HashSet;
import java.util.Set;

public class Zone {


    public String name;
    public int capacity;
    public Zoo zoo;
    private Set<Animal> animals;

    {
        this.animals = new HashSet<>();
    }

    public Zone() {
    }

    public Zone(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * set field
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * get field
     *
     * @return zoo
     */
    public Zoo getZoo() {
        return this.zoo;
    }

    /**
     * set field
     *
     * @param zoo
     */
    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    /**
     * get field
     *
     * @return animals
     */
    public Set<Animal> getAnimals() {
        return this.animals;
    }

    /**
     * set field
     *
     * @param animals
     */
    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }


}
