package in.spring.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("txt")
public class TextController {

	@GetMapping("txt")
	public ResponseEntity<?> text(){
		return ResponseEntity.ok("hey.. i'm here after deploy");
	}
}
