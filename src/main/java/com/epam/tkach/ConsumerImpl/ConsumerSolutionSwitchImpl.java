package com.epam.tkach.ConsumerImpl;

import com.epam.tkach.ConsumerSolution;
import com.epam.tkach.Messages;
import com.epam.tkach.PrintType;
import com.epam.tkach.Validator;

import java.util.function.Consumer;

public class ConsumerSolutionSwitchImpl implements ConsumerSolution {
    @Override
    public void process(String arg, PrintType printType) throws IllegalArgumentException {
        Validator.validateStringArg(arg);
        Consumer<String> consumer = System.out::println;

        switch (printType){
            case LOWER:{
                consumer.accept(arg.toLowerCase());
                break;
            }
            case UPPER:{
                consumer.accept(arg.toUpperCase());
                break;
            }
            case DEFAULT:{
                consumer.accept(arg);
                break;
            }
            default:{
                throw new UnsupportedOperationException(Messages.UNSUPPORTED_OPERATION);
            }
        }
    }
}
