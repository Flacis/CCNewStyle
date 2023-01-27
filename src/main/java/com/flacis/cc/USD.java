package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class USD {
    public static double EUR(double amount) {
        return ConverterCurrency(new URLCurrency().USDvsEUR, new URLCurrency().search) * amount;
    }
    public static double RUB(double amount){
        return ConverterCurrency(new URLCurrency().USDvsRUB, new URLCurrency().search) * amount;
    }
}
