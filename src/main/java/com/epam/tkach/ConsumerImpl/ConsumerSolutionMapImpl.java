package com.epam.tkach.ConsumerImpl;

import com.epam.tkach.ConsumerSolution;
import com.epam.tkach.PrintType;
import com.epam.tkach.Validator;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.function.Consumer;

public class ConsumerSolutionMapImpl implements ConsumerSolution {
    private final Consumer<String> consumer = System.out::println;
    private final Map<PrintType, Consumer<String>> operations = new ImmutableMap.Builder<PrintType, Consumer<String>>()
            .put(PrintType.LOWER,this::toLowerCaseConsumer)
            .put(PrintType.UPPER,this::toUpperCaseConsumer)
            .put(PrintType.DEFAULT, this::defaultConsumer)
            .build();

    @Override
    public void process(String arg, PrintType printType) throws IllegalArgumentException, UnsupportedOperationException {
        Consumer<String> operation = operations.get(printType);
        Validator.validateStringArg(arg);
        Validator.validateOperation(operation);

        operation.accept(arg);
    }
    private void toUpperCaseConsumer(String arg){
        consumer.accept(arg.toUpperCase());
    }

    private void toLowerCaseConsumer(String arg){
        consumer.accept(arg.toLowerCase());
    }

    private void defaultConsumer(String arg){
        consumer.accept(arg);
    }

    private Consumer<String> toUpperCaseConsumerNotWorking(String arg){
        Consumer<String> myConsumer = a->System.out.println(a);
        return myConsumer;
    }
}
