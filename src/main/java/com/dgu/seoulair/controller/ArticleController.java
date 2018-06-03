package com.dgu.seoulair.controller;

import com.dgu.seoulair.model.Article;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class ArticleController {


    String baseUrl = "http://openapi.seoul.go.kr:8088";
    String authKey = "535a7357446f6a32373762486c4c6c";
    String requestFileType = "json";
    String serviceName = "ListAirQualityByDistrictService";
    String url = baseUrl + '/' + authKey + '/' + requestFileType + '/' + serviceName + "/1/25";
    List<String> listStrings = new ArrayList<String>();

    @GetMapping("/article")
    public ModelAndView displayArticle(Map<String, Object> model) {
        BufferedReader in = null;

        try {
            //request to open API
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                listStrings.add(line);
            }
        System.out.println(listStrings);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        List<Article> articles = IntStream.range(0, 2)
          .mapToObj(i -> generateArticle("Article Title " + i))
          .collect(Collectors.toList());

        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("articles", articles);

        return new ModelAndView("index", modelMap);
    }

    private Article generateArticle(String title) {
        Article article = new Article();
        DataFactory factory = new DataFactory();
        article.setTitle(title);
        article.setBody(
          "Lorem ipsum dolor sit amet,Nunc quam ex, aliquet at rutrum sed, " +
                  "vestibulum quis libero. In laoreet libero cursus maximus " +
                  "vulputate. Nullam in fermentum sem. Duis aliquam ullamcorper dui," +
                  " convallis, non blandit est tempus.");
        article.setPublishDate(factory.getBirthDate().toString());
        article.setAuthor(factory.getName());
        article.setairdata(listStrings.get(0));
        return article;
    }
}


