package com.example.Resgistration.Service;

import com.example.Resgistration.Model.User;
import com.example.Resgistration.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResgistrationService {

    @Autowired
    UserDao userDao;

    public boolean register(User user) {
        try{
            userDao.save(user);
             return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}
