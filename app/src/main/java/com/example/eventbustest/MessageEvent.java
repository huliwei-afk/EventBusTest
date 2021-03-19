package com.example.eventbustest;

class MessageEvent {
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public MessageEvent(String message) {
        Message = message;
    }
}
