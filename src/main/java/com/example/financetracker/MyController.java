package com.example.financetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

    // @Autowired
    // private UserService userService;

    @GetMapping("/")
    public String homemain() {
        return "index"; 
    }
    @GetMapping("/home")
    public String home() {
        return "home"; 
    }

    @GetMapping("/charts")
    public String charts() {
        return "chart"; 
    }
    @GetMapping("/login")
    public String login() {
        return "login"; 
    }
    @GetMapping("/register")
    public String register() {
        return "register"; 
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact"; 
    }
    @GetMapping("/budget")
    public String budget() {
        return "trakker"; 
    }

    // Register user
    // @PostMapping("/register")
    // public String register(@RequestParam String name, @RequestParam String email, 
    //                        @RequestParam String password, @RequestParam String confirmPassword) {
    //     try {
    //         userService.registerUser(name, email, password, confirmPassword);
    //         return "Registration successful!";
    //     } catch (IllegalArgumentException e) {
    //         return e.getMessage();
    //     }
    // }

    // // Login user
    // @PostMapping("/login")
    // public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
    //     try {
    //         User user = userService.loginUser(email, password);
    //         session.setAttribute("user", user); // Store user in session
    //         return "Login successful!";
    //     } catch (IllegalArgumentException e) {
    //         return e.getMessage();
    //     }
    // }

    // // Logout user
    // @GetMapping("/logout")
    // public String logout(HttpSession session) {
    //     session.invalidate(); // Invalidate session to logout
    //     return "Logged out successfully!";
    // }


}
