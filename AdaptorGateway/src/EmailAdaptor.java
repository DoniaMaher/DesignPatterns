public class EmailAdaptor implements SMSGateway
{
     EmailGateway email;
    public EmailAdaptor(EmailGateway email)
    {
        // we need reference to the object we
        // are adapting
        this.email = email;
    }
    @Override
    public void sendSMSMessage(String user)
    {
             email.sendEmailMessage(user);
    }
}
