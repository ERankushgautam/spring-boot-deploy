package in.spring.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TextController {

<<<<<<< HEAD
	@GetMapping("/send")
=======
	@GetMapping("/txt")
>>>>>>> 1f70e8a2bfb405bd03de323739ee38bb59c80b39
	public ResponseEntity<?> text(){
		return ResponseEntity.ok("hey.. i'm here after deploy");
	}
}
