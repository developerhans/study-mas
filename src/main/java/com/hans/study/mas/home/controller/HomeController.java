package com.hans.study.mas.home.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class HomeController {
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("hello");
    }
}