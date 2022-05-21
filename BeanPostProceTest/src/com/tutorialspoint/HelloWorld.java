package com.tutorialspoint;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("your message: " + message);
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destory(){
        System.out.println("Bean will destory now");
    }
}
