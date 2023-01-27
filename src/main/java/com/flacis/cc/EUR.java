package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class EUR {
    public static double USD(double amount) {
        return ConverterCurrency(new URLCurrency().EURvsUSD, new URLCurrency().search) * amount;
    }

    public static double RUB(double amount) {
        return ConverterCurrency(new URLCurrency().EURvsRUB, new URLCurrency().search) * amount;
    }
}
