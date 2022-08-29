package com.epam.tkach.ConsumerImpl;

import com.epam.tkach.ConsumerSolution;
import com.epam.tkach.Messages;
import com.epam.tkach.PrintType;
import com.epam.tkach.Validator;

import java.util.function.Consumer;

public class ConsumerSolutionIfElseImpl implements ConsumerSolution {
    @Override
    public void process(String arg, PrintType printType) {
        Validator.validateStringArg(arg);
        Consumer<String> consumer = System.out::println;

        if (printType==PrintType.LOWER){
            consumer.accept(arg.toLowerCase());
        } else if (printType==PrintType.UPPER) {
            consumer.accept(arg.toUpperCase());
        } else if (printType==PrintType.DEFAULT) {
            consumer.accept(arg);
        }else {
            throw new UnsupportedOperationException(Messages.UNSUPPORTED_OPERATION);
        }
    }
}
