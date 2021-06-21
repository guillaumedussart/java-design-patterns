package fr.diginamic.builder;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

    public String name;
    public Set<Zone> zones;
    {
        this.zones = new HashSet<>();

    }
    public Zoo() {

    }

    public Zoo(String name) {
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
     * @return zones
     */
    public Set<Zone> getZones() {
        return this.zones;
    }

    /**
     * set field
     *
     * @param zones
     */
    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zoo{");
        sb.append("name='").append(name).append('\'');
        sb.append(", zones=").append(zones.toString());
        sb.append('}');
        return sb.toString();
    }
}
