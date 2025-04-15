package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/")
    public String  index(){
        return  "index";
    }

    @GetMapping("/hello")
    public String  hello(){
        return  "hello";
    }

    @GetMapping("/test")
    public String  test(){
        return  "test";
    }

    @GetMapping("/welcome")
    public String  welcome(){
        return  "welcome";
    }
}
