package com.crm.autodesk.genericUtility;

import java.io.IOException;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class SlackIntegrationTest {
	//pgm

		private static String urlSlackWebHook = "https://hooks.slack.com/services/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";
		private static String channelName = "sdet";
		private static String botUserOAuthAccessToken = "xoxb-3157509432128-3168329804580-boygrjvDwnl2sCebEJVpGENx";
		
		
			public void sendTestExecutionStatusToSlack(String message) throws Exception {
				try {
				StringBuilder messageBuider = new StringBuilder();
				messageBuider.append(message);
				Payload payload = Payload.builder().channel(channelName).text(messageBuider.toString()).build();

				WebhookResponse webhookResponse = Slack.getInstance().send(urlSlackWebHook, payload);
				webhookResponse.getMessage();
				} catch (IOException e) {
				System.out.println("Unexpected Error! WebHook:" + urlSlackWebHook);
				}
				}		
}