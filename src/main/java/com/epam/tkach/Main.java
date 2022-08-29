package com.epam.tkach;

import com.epam.tkach.ConsumerImpl.ConsumerSolutionIfElseImpl;
import com.epam.tkach.ConsumerImpl.ConsumerSolutionMapImpl;
import com.epam.tkach.ConsumerImpl.ConsumerSolutionSwitchImpl;
import com.epam.tkach.SuplierImpl.SupplierSolutionIfElseImpl;
import com.epam.tkach.SuplierImpl.SupplierSolutionSwitchImpl;

public class Main {
    public static void main(String[] args) {
        //Consumer
        String message = "Hello World";
        ConsumerSolution solution = new ConsumerSolutionSwitchImpl();

        System.out.println("Switch:");
        solution.process(message,PrintType.UPPER);
        solution.process(message,PrintType.LOWER);
        solution.process(message,PrintType.DEFAULT);

        System.out.println("If/Else:");
        solution = new ConsumerSolutionIfElseImpl();
        solution.process(message,PrintType.UPPER);
        solution.process(message,PrintType.LOWER);
        solution.process(message,PrintType.DEFAULT);

        System.out.println("Map:");
        solution = new ConsumerSolutionMapImpl();
        solution.process(message,PrintType.UPPER);
        solution.process(message,PrintType.LOWER);
        solution.process(message,PrintType.DEFAULT);


        //Supplier
        System.out.println("======SUPPLIER==========");
        System.out.println("If/Else:");
        SupplierSolution supplierSolution = new SupplierSolutionIfElseImpl();
        supplierSolution.process(PrintType.UPPER);
        supplierSolution.process(PrintType.LOWER);
        supplierSolution.process(PrintType.DEFAULT);

        System.out.println("Switch:");
        supplierSolution = new SupplierSolutionSwitchImpl();
        supplierSolution.process(PrintType.UPPER);
        supplierSolution.process(PrintType.LOWER);
        supplierSolution.process(PrintType.DEFAULT);
        System.out.println("Map:");
        supplierSolution = new SupplierSolutionSwitchImpl();
        supplierSolution.process(PrintType.UPPER);
        supplierSolution.process(PrintType.LOWER);
        supplierSolution.process(PrintType.DEFAULT);

    }
}
