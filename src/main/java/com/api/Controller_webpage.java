package com.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
	public class Controller_webpage {
		
	@RequestMapping("/")
	public String index() {
	  return "homepage.html";
	}



	// @RequestMapping(value = "/api/{name}",  method = RequestMethod.GET)
 //  public ModelAndView method(@PathVariable String name) {
	//   dictionary.put("jongro", 111123);
	//   System.out.println(dictionary.get(name));
	//   return new ModelAndView("redirect:" + String.format("http://openapi.seoul.go.kr:8088/535a7357446f6a32373762486c4c6c/json/ListAirQualityByDistrictService/1/5/%s/", dictionary.get(name)));
	// }
	
	///hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public BeanExample helloWorldPathVariable(@PathVariable String name) {
		return new BeanExample(String.format("Hello World, %s", name));
	}
}
