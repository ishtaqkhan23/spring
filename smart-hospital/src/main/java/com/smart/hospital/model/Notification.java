package com.smart.hospital.model;

public class Notification {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void postContructConfig() {
        System.out.println("post construct called");
    }

    public void preDestroyConfig(){
        System.out.println("pre destroy config");
    }
}
