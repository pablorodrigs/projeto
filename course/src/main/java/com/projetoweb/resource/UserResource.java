package com.projetoweb.resource;

import com.projetoweb.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    //endpoint para acessar os usuarios
    @GetMapping
    public ResponseEntity<User> findAll(){


        User u = new User();
        return ResponseEntity.ok().body(u);
    }
}
