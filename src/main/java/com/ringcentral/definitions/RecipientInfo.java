package com.ringcentral.definitions;


public class RecipientInfo {
    /**
     * Link to a recipient extension resource
     */
    public String uri;
    /**
     * Internal identifier of a recipient extension
     */
    public Long id;

    public RecipientInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RecipientInfo id(Long id) {
        this.id = id;
        return this;
    }

}
