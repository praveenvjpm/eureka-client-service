package in.praveen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client-service")
public class HomeController {
	@Autowired
	private RestTemplate template;
	@GetMapping("/hello")
	public String getMessage() {
		String url = "http://EUREKA-CLIENT/client/get";
		return template.getForObject(url, String.class);
	}

}
