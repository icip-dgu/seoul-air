package com.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;


@Controller
public class Controller_webpage {

    Map<String, Integer> dictionary = new HashMap<String, Integer>();
    String baseUrl = "http://openapi.seoul.go.kr:8088";
    String authKey = "535a7357446f6a32373762486c4c6c";
    String requestFileType = "json";
    String serviceName = "ListAirQualityByDistrictService";

    @GetMapping("/")
    public String index() {
        return "homepage.html";
    }

    //indirect
    @GetMapping("/api/{name}")
    public ModelAndView method(@PathVariable String name) {
        return new ModelAndView("redirect:" + baseUrl+'/'+authKey+'/'+requestFileType+'/'+serviceName +"1/5/" );
    }

}