package fpt.edu.microserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	@RequestMapping("/productFallback")
	public Mono<String> productServiceFallback(){
		return Mono.just("Product service is taking too long to respond or is down. Please try again later");
	}
}
