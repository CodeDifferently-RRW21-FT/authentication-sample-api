package com.codedifferently.firebaseauthenticationstarter.domain.info;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public/about")
public class InfoController {
    @GetMapping("")
    public ResponseEntity<String> getPublic() {
        return ResponseEntity.ok("OK");
    }
}
