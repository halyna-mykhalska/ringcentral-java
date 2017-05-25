package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.paths.Sms;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SmsTest extends BaseTest {

    @Test
    public void sendSms() throws IOException, RestException {
        Sms.PostParameters postParameters = new Sms.PostParameters();
        postParameters.from = new CallerInfo().phoneNumber(config.get("username"));
        postParameters.to = new CallerInfo[]{new CallerInfo().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        MessageInfo messageInfo = restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters, MessageInfo.class);
        assertNotNull(messageInfo);
        assertEquals("SMS", messageInfo.type);
    }
}
