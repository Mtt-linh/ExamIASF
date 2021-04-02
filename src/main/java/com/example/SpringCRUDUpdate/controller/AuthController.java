package com.example.SpringCRUDUpdate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AuthController {
@RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(){return "login";}
}
