package com.example.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service",url = "localhost:8000")
public interface CurrencyExchnageServiceProxy {

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retriveExchnageValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
