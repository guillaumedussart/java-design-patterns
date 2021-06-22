package fr.diginamic.builder;

public class Animal {

    private String name;
    private Zone zone;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
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
     * @return zone
     */
    public Zone getZone() {
        return this.zone;
    }

    /**
     * set field
     *
     * @param zone
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append("type='").append(this.getClass()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
