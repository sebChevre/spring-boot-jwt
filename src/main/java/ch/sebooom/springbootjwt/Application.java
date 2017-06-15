package ch.sebooom.springbootjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String hello() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }
}
