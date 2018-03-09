package br.com.moreti.microservices.currencyexchangeservice.model;

import java.math.BigDecimal;

public class ExchangeValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal covnersionMultiple;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal covnersionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.covnersionMultiple = covnersionMultiple;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getCovnersionMultiple() {
        return covnersionMultiple;
    }
}
