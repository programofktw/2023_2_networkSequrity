package kimleeduldul.kimleeduldul_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class PishingConroller {


    @GetMapping("/test")
    @ResponseBody
    public String test(){
        String abcd = new String();
        return abcd = "1234";
    }
}
