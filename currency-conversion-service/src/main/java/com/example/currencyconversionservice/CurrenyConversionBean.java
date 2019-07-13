package com.example.currencyconversionservice;

public class CurrenyConversionBean {

    private int id;
    private String from;
    private String to;
    private long conversionMultiple;
    private int quantity;
    private long calculatedAmount;


    public CurrenyConversionBean(int id, String from, String to, long conversionMultiple, int quantity, long calculatedAmount) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.calculatedAmount = calculatedAmount;
    }

    public CurrenyConversionBean() {
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public long getConversionMultiple() {
        return conversionMultiple;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionMultiple(long conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCalculatedAmount(long calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }
}
