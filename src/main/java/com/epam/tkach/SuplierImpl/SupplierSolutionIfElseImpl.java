package com.epam.tkach.SuplierImpl;

import com.epam.tkach.PrintType;
import com.epam.tkach.SupplierSolution;

public class SupplierSolutionIfElseImpl implements SupplierSolution {

    @Override
    public void process(PrintType printType) throws UnsupportedOperationException {

        if (printType== PrintType.LOWER){
            System.out.println(SupplierStorage.getLowerCaseSupplier().get());
        } else if (printType==PrintType.UPPER) {
            System.out.println(SupplierStorage.getUpperCaseSupplier().get());
        } else if (printType==PrintType.DEFAULT) {
            System.out.println(SupplierStorage.getDefaultCaseSupplier().get());
        }else {
            throw new UnsupportedOperationException("No operation specified to this Enum value");
        }



    }
}
