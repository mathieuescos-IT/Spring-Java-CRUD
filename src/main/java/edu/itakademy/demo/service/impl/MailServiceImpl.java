package edu.itakademy.demo.service.impl;

import edu.itakademy.demo.entity.Book;
import edu.itakademy.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

    @Autowired
    JavaMailSender emailSender;

    public void sendSimpleMessage(Book book) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo("");
        message.setSubject("Nouveau livre ajouté : " + book.getName());
        message.setText("Un nouveau livre à été ajouté benks");
        emailSender.send(message);
    }
}
