package com.hendisantika.springbootemail.service;

import jakarta.mail.MessagingException;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-email
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/01/20
 * Time: 06.28
 */
public interface EmailService {

    void sendSimpleEmail(final String toAddress, final String subject, final String message);

    void sendEmailWithAttachment(final String toAddress, final String subject, final String message, final String
            attachment) throws MessagingException, FileNotFoundException, UnsupportedEncodingException;
}
