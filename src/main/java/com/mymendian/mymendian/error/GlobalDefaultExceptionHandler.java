package com.mymendian.mymendian.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"com.mymendian.mymendian",})
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler({BussinessException.class})
    @ResponseBody
    public  ErrorInfo defaultErrorHandler(HttpServletRequest req, Exception e)
            throws Exception {
        ErrorInfo errorInfo= new ErrorInfo();
        errorInfo.setMessage(e.getMessage());
        errorInfo.setUrl(req.getRequestURI());
        errorInfo.setCode(ErrorInfo.SUCCESS);
        return errorInfo;
    }
}