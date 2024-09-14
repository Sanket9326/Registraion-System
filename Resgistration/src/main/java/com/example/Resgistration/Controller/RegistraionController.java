package com.example.Resgistration.Controller;

import com.example.Resgistration.Model.User;
import com.example.Resgistration.Service.ResgistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("register")
@CrossOrigin(origins = "http://localhost:63342")
public class RegistraionController {

    @Autowired
    ResgistrationService resgistrationService;

    @PostMapping("new")
    public ResponseEntity<Map<String,String>> register(@Valid @RequestBody User u, BindingResult result) {
        Map <String,String> response = new HashMap<>();
        if (result.hasErrors()) {
            response.put("status", "error");
            response.put("message", result.getAllErrors().get(0).getDefaultMessage());
            return ResponseEntity.badRequest().body(response);
        }
        if (!resgistrationService.register(u)){
            response.put("status", "error");
            return ResponseEntity.badRequest().body(response);
        }
        response.put("status", "success");
        return ResponseEntity.ok().body(response);
    }

}
