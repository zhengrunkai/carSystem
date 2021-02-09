package com.mymendian.mymendian.service;

public interface SendMailService {
    boolean sendMail(String toMail,String subject,String content);
}