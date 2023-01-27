package com.flacis.cc;

import static com.flacis.cc.Converter.ConverterCurrency;

public class EUR {
    public static String EURvsUSD() {
        return ConverterCurrency(new URLCurrency().EURvsUSD, new URLCurrency().search);
    }
    public static String EURvsRUB(){
        return ConverterCurrency(new URLCurrency().EURvsRUB, new URLCurrency().search);
    }
}
