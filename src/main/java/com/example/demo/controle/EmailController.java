package com.example.demo.controle;

import com.example.demo.dtos.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailDTO emailDTO) {
        try {
            SimpleMailMessage mensagem = new SimpleMailMessage();
            mensagem.setFrom(emailDTO.getEmail());
            mensagem.setTo("joaovitordasilvapimentel0@gmail.com");
            mensagem.setSubject("Novo Email de " + emailDTO.getName());
            mensagem.setText(emailDTO.getMessage());

            javaMailSender.send(mensagem);

            return "Email enviado com sucesso!";
        } catch (MailException e) {
            return "Erro ao enviar o email: " + e.getMessage();
        }
    }
}
