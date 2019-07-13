package com.example.currencyconversionservice;

public class ExchangeValue {

    private int id;

    private String from;

    private String to;

    private long conversionMultiple;

    public ExchangeValue(int id, String from, String to, long conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public ExchangeValue() {
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
}
