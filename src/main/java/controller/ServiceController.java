
package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bot.Watson;
import sms.twilio;

@RestController
public class ServiceController {


    @RequestMapping(path = "/smssent",method = RequestMethod.POST)
    public String greeting(@RequestParam(value="From") String From,@RequestParam(value="To") String To,@RequestParam(value="Body") String Body) {   
    	System.out.println("Received from "+From + " to "+To +" Body->  " +Body);
    	new twilio().twilioSend(To, From, new Watson().sendToBot(Body));
    	return  "";
    }
    @RequestMapping(path = "/smssent",method = RequestMethod.GET)
    public String gotSms(@RequestParam(value="From") String From,@RequestParam(value="To") String To,@RequestParam(value="Body") String Body) {   
    	System.out.println("Received from "+From + " to "+To +" Body->  " +Body);
    	new twilio().twilioSend(To, From, new Watson().sendToBot(Body));
    	return  "";
    }
}