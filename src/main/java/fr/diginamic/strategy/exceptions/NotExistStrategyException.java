package fr.diginamic.strategy.exceptions;

import fr.diginamic.strategy.Strategy;

public class NotExistStrategyException extends Exception  {

    public NotExistStrategyException(String message){
        super(message);
    }
}
