package com.epam.tkach;

import java.util.function.Consumer;

public class Validator {
    public static void validateStringArg(String arg) throws IllegalArgumentException{
        if (null == arg)
            throw new IllegalArgumentException(Messages.NULL_ARG);
    }
    public static void validateOperation(Object o){
        if (null==o)
            throw new IllegalArgumentException(Messages.UNSUPPORTED_OPERATION);
    }
}
