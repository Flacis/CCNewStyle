package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class RUB {
    public static String RUBvsUSD() {
        return ConverterCurrency(new URLCurrency().RUBvsUSD, new URLCurrency().search);
    }

    public static String RUBvsEUR() {
        return ConverterCurrency(new URLCurrency().RUBvsEUR, new URLCurrency().search);
    }
}