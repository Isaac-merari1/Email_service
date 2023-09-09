package com.merari.emailservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class htmlService {
    @GetMapping("/home")
    public String home(){
        return "<html><body><font color=\"green\">"
        + "<h1>WELCOME To Merari Home</h1>"
        + "</font></body></html>";
    }

    @GetMapping("/info")
    public String info(){
        return "<html><body><font color=\"green\">"
                + "<h2>GeeksForGeeks is a Computer"
                + " Science portal for Geeks. "
                + "This portal has been "
                + "created to provide well written, "
                + "well thought and well explained "
                + "solutions for selected questions."
                + "</h2></font></body></html>";
    }

}
