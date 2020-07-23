package ro.ibm.summerschool.myfantasticuniversity.chat;

import java.util.Date;

public class MessageModel {

    public String message;
    public int messageType;
    Contact sender;
    public Date messageTime = new Date();
    // Constructor
    public MessageModel(String message, int messageType, Contact sender) {
        this.message = message;
        this.messageType = messageType;
        this.sender=sender;
    }




    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public Contact getSender() {
        return sender;
    }

    public void setSender(Contact sender) {
        this.sender = sender;
    }

}