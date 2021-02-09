package com.mymendian.mymendian.error;

public class BussinessException extends RuntimeException {
    public BussinessException(){}
    public  BussinessException(String message){
        super(message);
    }
}