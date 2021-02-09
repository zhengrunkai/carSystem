package com.mymendian.mymendian.service;

public interface SendJunkMailService {
    boolean sendJunkMail(String toMail, String subject, String content);
}
