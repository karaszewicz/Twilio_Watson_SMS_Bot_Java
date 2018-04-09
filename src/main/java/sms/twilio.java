package sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class twilio {
	private final String twilioUsername = "your twilio username";
	private final String twilioPassword = "your twilio password";
	public void twilioSend(String From, String To, String Body){
		Twilio.init(twilioUsername,twilioPassword);
	    Message message = Message
	            .creator(new PhoneNumber(To), // to
	                    new PhoneNumber(From), // from
	                    Body)
	            .create();
	    System.out.println("sending"+ " to "+ message.getTo() +" from "+ message.getFrom() +" Body->  " + message.getBody() + " msg sid "+message.getSid());
	}
}
