package com.example.email_integrations.services;

import com.example.email_integrations.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO dto);
}
