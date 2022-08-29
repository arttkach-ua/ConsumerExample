package com.epam.tkach.SuplierImpl;

import java.util.function.Supplier;

public class SupplierStorage {
    private static String message = "Supplier message";

    public static Supplier<String> getLowerCaseSupplier(){
        Supplier<String> supplier = () -> message.toLowerCase();
        return supplier;
    }

    public static Supplier<String> getUpperCaseSupplier(){
        Supplier<String> supplier = () -> message.toUpperCase();
        return supplier;
    }

    public static Supplier<String> getDefaultCaseSupplier(){
        Supplier<String> supplier = () -> message;
        return supplier;
    }
}
