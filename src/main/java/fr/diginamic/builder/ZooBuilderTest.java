package fr.diginamic.builder;

public class ZooBuilderTest {
    public static void main(String[] args) {

        Animal animal1 = new Lion("King");
        Animal animal2 = new Dauphin("KingD");
        Animal animal3 = new Lion("King2");


        ZoneBuilder builder = new ZoneBuilder("zooTest");
        builder.appendZone("test",60);
        builder.appendAnimal("test",animal1);
        builder.appendAnimal("test",animal2);
        builder.appendAnimal("test",animal3);


        System.out.println(builder.getZoo());

    }
}
