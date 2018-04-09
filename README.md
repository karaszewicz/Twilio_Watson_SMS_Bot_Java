# Twilio Watson SMS Bot Java
It is the Java implementation of this service.

## Data Flow
It forwards sms received by your twilio number to watson bot to have a smart response back which is sent back as response sms from the twilio number. 
It is a three layer solution: [TWILIO](https://twilio.com) + [this.Solution](https://github.com/pranavkapoorr/Twilio_Watson_SMS_Bot_Java/) + [IBM_Watson](https://www.ibm.com/watson/services/conversation-4/).

![alt text](https://github.com/pranavkapoorr/Twilio_Watson_SMS_Bot_Java/blob/master/data_flow.jpg)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

#### Twilio Account

```
* Go to [TWILIO Homepage](https://twilio.com) and register for free number.
* In settings for your phone number, put the webhook either post or get pointing at port 5000 of your system where you run this solution. It will pass the received message to this solution which will forward it to IBM WATSON CHATBOT.
* Copy the access tockens and paste it in [twilio class](https://github.com/pranavkapoorr/Twilio_Watson_SMS_Bot_Java/blob/master/src/main/java/sms/twilio.java) to make it work.
```

#### Port Forwarding

```
* For this, either port forward your local machine using settings panel of your router or,
* Just download and run [ngrok](https://ngrok.com) and run it using "ngrok http 5000" it will show forwarded port with a generated domain, which you will use as twilio webhook.
```

#### IBM WATSON BOT

```
* Go to [IBM WATSON PAGE](https://www.ibm.com/watson/services/conversation-4/) and register there.
* Once registered, create your Bot workspace and train it and deploy it.
* Copy workspace username, password and workspace id from there and paste it in [Watson class](https://github.com/pranavkapoorr/Twilio_Watson_SMS_Bot_Java/blob/master/src/main/java/bot/Watson.java) in order to make the Watson api connect to your created workspace.
```


things you need to install the software:

```
* JDK 8 and preferably an IDE of your choice.
```

### Installing

steps to use it:

```
* clone this repository
* build it using maven or can run it using any IDE of your choice
```

## Deployment

After building the project using [maven](https://maven.apache.org), the jar file generated in target folder should be run using terminal(bash or cmd) to bind the solution to.
```
java -jar twilio_watson_sms_bot.jar
```

## Authors

* **Pranav Kapoor** - *Initial work* - [pranavkapoor](https://github.com/pranavkapoorr)
