package com.example.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyExchnageController {

    @Autowired
    ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    private  ExchangeValue getExchnageValue(@PathVariable String from, @PathVariable("to") String to){
            return exchangeValueRepository.findByFromAndTo(from,to);
    }

    @GetMapping
    public List<ExchangeValue> getAll(){
        return exchangeValueRepository.findAll();
    }
}
