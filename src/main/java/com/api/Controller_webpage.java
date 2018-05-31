package com.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Controller
public class Controller_webpage {

    String baseUrl = "http://openapi.seoul.go.kr:8088";
    String authKey = "535a7357446f6a32373762486c4c6c";
    String requestFileType = "json";
    String serviceName = "ListAirQualityByDistrictService";
    String url = baseUrl + '/' + authKey + '/' + requestFileType + '/' + serviceName + "/1/25";

    //home
    @GetMapping("/")
    public String index() {
        BufferedReader in = null;

        try {
            //request to open API
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return "homepage.html";
    }


    //indirect
    @GetMapping("/api")
    public ModelAndView method() {
        return new ModelAndView("redirect:" + url);
    }
}
