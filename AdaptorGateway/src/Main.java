public class Main {
    public static void main(String args[])
    {
        Email email= new Email();
        SMSGateway sms = new SMS();
        SMSGateway EmailAdaptor = new EmailAdaptor(email);
        EmailGateway SmsAdapter = new SmsAdapter(sms);
        System.out.println("BYEMAIL...");
        email.sendEmailMessage("TA");
        System.out.println("...");
        System.out.println("BTSMS...");
        sms.sendSMSMessage("TA");
        System.out.println("...");
        // toy duck behaving like a bird
        System.out.println("emailAdapter...");
        EmailAdaptor.sendSMSMessage("TA");
        System.out.println("...");
        System.out.println("SmsAdapter...");
        SmsAdapter.sendEmailMessage("TA");
    }
}

