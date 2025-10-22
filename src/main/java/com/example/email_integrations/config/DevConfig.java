package com.example.email_integrations.config;

import com.example.email_integrations.services.EmailService;
import com.example.email_integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev") // Configuração específica para o perfil de desenvolvimento
public class DevConfig {
    @Bean
    public EmailService emailService() {
        return new SendGridEmailService();
    }
}
