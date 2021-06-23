package fr.diginamic.strategy;

import fr.diginamic.strategy.exceptions.NotExistStrategyException;

import java.util.List;

public class DemoTri {

    private static StrategyFactory strategy = StrategyFactory.getSingle();

    public static void main(String[] args) throws NotExistStrategyException {
        System.out.println("Avec le Bubble Sort:");

        Strategy strategy1 = strategy.getType(EnumTri.BUBBLE);
        Integer[] array1 = {12, -5, 7, 0, 8, 4, -3, 9, 15};

        List.of(strategy1.trier(array1)).forEach(i -> System.out.print(i + " "));


        System.out.println("\nAvec l'insertion Sort:");
        Strategy strategy2 = strategy.getType(EnumTri.INSERTION);

        Integer[] array2 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
        List.of(strategy2.trier(array2)).forEach(i -> System.out.print(i + " "));

        System.out.println("\nAvec le selection Sort:");

        Strategy strategy3 = strategy.getType(EnumTri.SELECT);

        Integer[] array3 = {12, -5, 7, 0, 8, 4, -3, 9, 15};

        List.of(strategy3.trier(array3)).forEach(i -> System.out.print(i + " "));


    }

}
