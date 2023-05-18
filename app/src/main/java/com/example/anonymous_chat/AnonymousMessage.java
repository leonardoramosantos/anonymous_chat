package com.example.anonymous_chat;

import java.util.Date;

public class AnonymousMessage {

    public AnonymousMessage(String message, Date sentDate) {
        this.message = message;
        this.sentDate = sentDate;
    }

    private String message;
    private Date sentDate;

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
