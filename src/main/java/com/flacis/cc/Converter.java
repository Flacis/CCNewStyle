package com.flacis.cc;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class Converter {
    public static String ConverterCurrency(String URL, String search) {
        double total = 0;
        try {
            var currency = Jsoup.connect(URL).get();
            var result = (currency.select(search));
            total = converter(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String fs = String.valueOf(total);
        return fs;
    }

    public static double converter(Elements n) {
        String N = n.text();
        String nNew = N.replace(",", ".");
        double nFinal = Double.parseDouble(nNew);
        return nFinal;
    }
}
