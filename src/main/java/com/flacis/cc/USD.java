package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class USD {
    public static String USDvsEUR() {
        return ConverterCurrency(new URLCurrency().USDvsEUR, new URLCurrency().search);
    }
    public static String USDvsRUB(){
        return ConverterCurrency(new URLCurrency().USDvsRUB, new URLCurrency().search);
    }
}
