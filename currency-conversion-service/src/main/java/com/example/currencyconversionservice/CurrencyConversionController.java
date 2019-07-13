package com.example.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    CurrencyExchnageServiceProxy currencyExchnageServiceProxy;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrenyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable int quantity){

        String url = loadBalancerClient.choose("currency-exchange-service").getUri().toString();
        System.out.println("server is:"+url);
        ExchangeValue exchangeValue =  getRestTemplate().getForObject(url+"/currency-exchange/from/"+from+"/to/"+to,ExchangeValue.class);

        return new CurrenyConversionBean(1,from,to,exchangeValue.getConversionMultiple(),quantity,exchangeValue.getConversionMultiple()*quantity);
    }
    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrenyConversionBean convertCurrencyFeign(@PathVariable String from,@PathVariable String to,@PathVariable int quantity){

        ExchangeValue exchangeValue =  currencyExchnageServiceProxy.retriveExchnageValue(from,to);
        return new CurrenyConversionBean(1,from,to,exchangeValue.getConversionMultiple(),quantity,exchangeValue.getConversionMultiple()*quantity);
    }
}
