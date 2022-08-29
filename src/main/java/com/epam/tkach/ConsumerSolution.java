package com.epam.tkach;

public interface ConsumerSolution {
    void process(String arg, PrintType printType) throws IllegalArgumentException, UnsupportedOperationException;
}
