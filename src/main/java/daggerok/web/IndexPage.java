package daggerok.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mak on 9/10/16.
 */
@Controller
public class IndexPage {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
