package fr.diginamic.strategy;


import fr.diginamic.strategy.exceptions.NotExistStrategyException;

public class StrategyFactory {


    public StrategyFactory() {
    }
    /**
     *  strategy factory holder
     *
     */
    private static class StrategyFactoryHolder {
        private static StrategyFactory single;

        static {
            single = new StrategyFactory();
        }
    }

    /**
     * get single
     *
     * @return {@link StrategyFactory}
     * @see StrategyFactory
     */
    public static StrategyFactory getSingle() {

        return StrategyFactoryHolder.single;
    }

    /**
     * set field
     *
     * @param type
     */
    public Strategy getType(EnumTri type) throws NotExistStrategyException {
        switch (type) {
            case SELECT:
                return new SelectStrategy();
            case BUBBLE:
                return new BubbleStrategy();
            case INSERTION:
                return new InsertionStrategy();
            default:
                throw  new NotExistStrategyException("La strategy choisie n'existe pas !");
        }
    }
}
