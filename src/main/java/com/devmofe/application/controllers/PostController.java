package com.devmofe.application.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;

@RestController
public class PostController {

    @ApiIgnore
    @RequestMapping("/")
    public void pageRedirect(HttpServletResponse response){
        try{
            response.sendRedirect("/swagger-ui.html");
            System.out.println("SWAGGER page loaded succesfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
