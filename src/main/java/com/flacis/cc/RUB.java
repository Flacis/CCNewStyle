package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class RUB {
    public static double USD(double amount) {
        return ConverterCurrency(new URLCurrency().RUBvsUSD, new URLCurrency().search) * amount;
    }

    public static double EUR(double amount) {
        return ConverterCurrency(new URLCurrency().RUBvsEUR, new URLCurrency().search) * amount;
    }
}