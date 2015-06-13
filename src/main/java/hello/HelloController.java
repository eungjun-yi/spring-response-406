package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@RestController
public class HelloController {

    // This responds 406 Not Acceptable even if the client requests with "Accept: */*" header.
    @RequestMapping("/test/{a}")
    public OutputStream test(@PathVariable String a) {
        return new ByteArrayOutputStream();
    }
}
