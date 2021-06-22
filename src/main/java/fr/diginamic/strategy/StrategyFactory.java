package fr.diginamic.strategy;

public class StrategyFactory {

    private EnumTri type;

    public StrategyFactory(EnumTri type) {
        this.type = type;
    }

    public StrategyFactory() {
    }

    /**
     * get field
     *
     * @return type
     */
    public EnumTri getType() {
        return this.type;
    }

    /**
     * set field
     *
     * @param type
     */
    public Strategy setType(EnumTri type) {
        switch (type) {
            case SELECT:
                return new SelectStrategy();
            case BUBBLE:
                return new BubbleStrategy();
            case INSERTION:
                return new InsertionStrategy();
            default:
                return null;
        }
    }
}
