package fr.diginamic.strategy;

import java.util.List;

public class DemoTri {

    private static StrategyFactory strategy = new StrategyFactory();

    public static void main(String[] args) {
        System.out.println("Avec le Bubble Sort:");

        Strategy strategy1 = strategy.setType(EnumTri.BUBBLE);
        Integer[] array1 = {12, -5, 7, 0, 8, 4, -3, 9, 15};

        List.of(strategy1.trier(array1)).forEach(i -> System.out.print(i + " "));


        System.out.println("\nAvec l'insertion Sort:");
        Strategy strategy2 = strategy.setType(EnumTri.INSERTION);

        Integer[] array2 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
        List.of(strategy2.trier(array2)).forEach(i -> System.out.print(i + " "));

        System.out.println("\nAvec le selection Sort:");

        Strategy strategy3 = strategy.setType(EnumTri.SELECT);

        Integer[] array3 = {12, -5, 7, 0, 8, 4, -3, 9, 15};

        List.of(strategy3.trier(array3)).forEach(i -> System.out.print(i + " "));


    }

}
