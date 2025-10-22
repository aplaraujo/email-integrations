package com.example.email_integrations.config;

import com.example.email_integrations.services.EmailService;
import com.example.email_integrations.services.MockEmailService;
import com.example.email_integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // Configuração específica para o perfil de testes
public class TestConfig {
    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
