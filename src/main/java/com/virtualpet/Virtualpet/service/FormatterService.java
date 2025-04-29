package com.virtualpet.Virtualpet.service;

import org.springframework.stereotype.Service;
import java.text.NumberFormat;

@Service
public class FormatterService {

    private final NumberFormat currencyFormatter;

    public FormatterService(NumberFormat currencyFormatter) {
        this.currencyFormatter = currencyFormatter;
    }

    public String formatCurrency(double amount) {
        return currencyFormatter.format(amount);
    }
}