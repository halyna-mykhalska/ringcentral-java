package com.ringcentral.definitions;


public class MessageStoreCallerInfoRequest {
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;

    public MessageStoreCallerInfoRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}
