package com.example.Resgistration.Controller;

import com.example.Resgistration.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mail")
public class MailController {

    @Autowired
    MailService mailService;

    @PutMapping("send")
    public ResponseEntity<String> sendMail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        return mailService.sendMail(to, subject, body);
    }
}
