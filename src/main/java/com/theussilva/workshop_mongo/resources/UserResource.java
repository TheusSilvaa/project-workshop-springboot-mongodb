package com.theussilva.workshop_mongo.resources;

import com.theussilva.workshop_mongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User matheus = new User("1", "Matheus Silva", "matheus@gmail.com");
        User alex = new User("2", "Alex Brown", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(matheus, alex));
        return ResponseEntity.ok().body(list);
    }


}
