package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class APSInfo {
    /**
     * If the value is '1' then notification is turned on even if the application is in background
     * Default: 1
     */
    @SerializedName("content-available")
    public Long contentAvailable;

    public APSInfo contentAvailable(Long contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }

}
