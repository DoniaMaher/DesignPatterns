public class SmsAdapter implements EmailGateway{

        SMSGateway sms;
        public SmsAdapter(SMSGateway sms)
        {
            this.sms=sms;
        }

    @Override
    public void sendEmailMessage(String user) {
            sms.sendSMSMessage(user);

    }
}

