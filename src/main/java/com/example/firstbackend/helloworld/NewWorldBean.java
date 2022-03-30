package com.example.firstbackend.helloworld;

public class NewWorldBean {

    private String message;

    public NewWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NewWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
