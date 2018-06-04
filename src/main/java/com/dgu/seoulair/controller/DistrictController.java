package com.dgu.seoulair.controller;

import com.dgu.seoulair.model.District;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class DistrictController {

    private String baseUrl = "http://openapi.seoul.go.kr:8088";
    private String authKey = "535a7357446f6a32373762486c4c6c";
    private String requestFileType = "json";
    private String serviceName = "ListAirQualityByDistrictService";
    private String resourceUrl = baseUrl + '/' + authKey + '/' + requestFileType + '/' + serviceName + "/1/25";


    @GetMapping("/")
    public ModelAndView getAirInfo() throws IOException {

        ArrayList<District> districts = new ArrayList<>();

        // get data from open api
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(resourceUrl, String.class);

        // get district info from json
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(response);

        if (jsonNode.isObject()) {
            ObjectNode obj = (ObjectNode) jsonNode;
            Iterator itr = obj.get("ListAirQualityByDistrictService").get("row").elements();


            // get a district in json array
            while (itr.hasNext()) {
                JsonNode districtJsonNode = (JsonNode) itr.next();

                District district = new District(
                        districtJsonNode.get("MSRDATE").textValue(),
                        districtJsonNode.get("MSRADMCODE").textValue(),
                        districtJsonNode.get("MSRSTENAME").textValue(),
                        districtJsonNode.get("MAXINDEX").textValue(),
                        districtJsonNode.get("GRADE").textValue(),
                        districtJsonNode.get("POLLUTANT").textValue(),
                        districtJsonNode.get("NITROGEN").textValue(),
                        districtJsonNode.get("OZONE").textValue(),
                        districtJsonNode.get("CARBON").textValue(),
                        districtJsonNode.get("SULFUROUS").textValue(),
                        districtJsonNode.get("PM10").textValue(),
                        districtJsonNode.get("PM25").textValue()
                );

                // put into array list
                districts.add(district);
            }
        }


        // pass open api data list to view
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("districts", districts);
        return modelAndView;

    }
}
