package ro.trc.service.demo.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResource {

    @GetMapping("/status")
    public ResponseEntity<String> getList() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
