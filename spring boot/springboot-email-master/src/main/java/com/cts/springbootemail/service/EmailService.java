package com.cts.springbootemail.service;

import jakarta.mail.MessagingException;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface EmailService {

    void sendSimpleEmail(final String toAddress, final String subject, final String message);

    void sendEmailWithAttachment(final String toAddress, final String subject, final String message, final String
            attachment) throws MessagingException, FileNotFoundException, UnsupportedEncodingException;
}
