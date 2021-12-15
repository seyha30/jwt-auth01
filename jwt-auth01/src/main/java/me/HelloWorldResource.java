package me;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	@GetMapping("/api/")
  public String index() {
	  return"Hello";
  }
}
