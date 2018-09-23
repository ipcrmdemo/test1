package test1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Test1Controller {

    @GetMapping(path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping(path = "/")
    public String root() {
        return "Hello, S1P! Add /hello/there to the URL to get a friendly reply.";
    }

}
