package study.apilogin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.apilogin.security.UserPrincipal;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserPrincipal principal) {
        return "If you see this, then you're logged in as user " + principal.getEmail()
                + " UserEntity ID : " + principal.getUserId();
    }
}
