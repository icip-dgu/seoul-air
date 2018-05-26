package main;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
	public class Controller_webpage {


	MongoClientURI uri = new MongoClientURI(
			"mongodb+srv://erply:passwoord@mongodb1-jfgqu.mongodb.net/test?retryWrites=true");
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase database = mongoClient.getDatabase("airdata");

	Map<String, Integer> dictionary = new HashMap<String, Integer>();

	@RequestMapping("/")
	public String index() {
	    return "homepage.html";
	}



    @RequestMapping(value = "/{name}",  method = RequestMethod.GET)
    public ModelAndView method(@PathVariable String name) {
        dictionary.put("jongro", 111123);
        System.out.println(dictionary.get(name));
        return new ModelAndView("redirect:" + String.format("http://openapi.seoul.go.kr:8088/535a7357446f6a32373762486c4c6c/json/ListAirQualityByDistrictService/1/5/%s/", dictionary.get(name)));

    }
	
	///hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public BeanExample helloWorldPathVariable(@PathVariable String name) {
		return new BeanExample(String.format("Hello World, %s", name));
	}


}
