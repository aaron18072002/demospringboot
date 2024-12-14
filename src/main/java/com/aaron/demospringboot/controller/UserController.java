package com.aaron.demospringboot.controller;

import com.aaron.demospringboot.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/getAllUser", "/"})
    public String getAllUsers() {
        return "Hello World";
    }

    @GetMapping("/add")
    public String addUser(@RequestParam("id")Integer id, @RequestParam("username")String username) {
        if(id != null && username != null) {
            return String.format("Hello [id = %d, name = %s]",id,username);
        }
        return null;
    }

    @GetMapping("/getDetails/{id}/{username}")
    public String getDetails(@PathVariable("id")Integer id, @PathVariable("username")String username) {
        if(id != null && username != null) {
            return String.format("Hello [id = %d, name = %s]",id,username);
        }
        return null;
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User user) {
        return String.format("Hello [id = %d, username = %s, password = %s]",
                user.getId(),user.getUsername(),user.getPassword());
    }

}
