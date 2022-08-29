package com.epam.tkach.SuplierImpl;

import com.epam.tkach.Messages;
import com.epam.tkach.PrintType;
import com.epam.tkach.SupplierSolution;

public class SupplierSolutionSwitchImpl implements SupplierSolution {
    @Override
    public void process(PrintType printType) throws UnsupportedOperationException {
        switch (printType) {
            case LOWER: {
                System.out.println(SupplierStorage.getLowerCaseSupplier().get());
                break;
            }
            case UPPER: {
                System.out.println(SupplierStorage.getUpperCaseSupplier().get());
                break;
            }
            case DEFAULT: {
                System.out.println(SupplierStorage.getDefaultCaseSupplier().get());
                break;
            }
            default: {
                throw new UnsupportedOperationException(Messages.UNSUPPORTED_OPERATION);
            }
        }
    }
}
