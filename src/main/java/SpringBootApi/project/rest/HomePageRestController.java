package SpringBootApi.project.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageRestController {
	
	@GetMapping("/")
	public String homePage() {
		return "Home Page ! Let's look at the time ! "+ LocalDateTime.now();
	}
	

}
