package com.example.email_integrations.controller;

import com.example.email_integrations.dto.EmailDTO;
import com.example.email_integrations.services.EmailService;
import com.example.email_integrations.services.SendGridEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        emailService.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }
}
