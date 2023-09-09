package com.merari.emailservice;

public interface EmailInterface {
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
