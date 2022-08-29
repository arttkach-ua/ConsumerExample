package com.epam.tkach.SuplierImpl;

import com.epam.tkach.Messages;
import com.epam.tkach.PrintType;
import com.epam.tkach.SupplierSolution;
import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.function.Supplier;

public class SupplierSolutionMapImpl implements SupplierSolution {

    private Map<PrintType, Supplier<String>> operations = new ImmutableMap.Builder<PrintType, Supplier<String>>()
            .put(PrintType.LOWER,SupplierStorage.getLowerCaseSupplier())
            .put(PrintType.UPPER,SupplierStorage.getUpperCaseSupplier())
            .put(PrintType.DEFAULT, SupplierStorage.getDefaultCaseSupplier())
            .build();

    @Override
    public void process(PrintType printType) throws UnsupportedOperationException {
        Supplier<String> operation = operations.get(printType);
        if (operation==null){
            throw new UnsupportedOperationException(Messages.UNSUPPORTED_OPERATION);
        }
    }
}
