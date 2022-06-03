public class Messageproducer
{
    public static abstractfactory create(String message)
    {
        if (message=="Email")
        {
            return new EmailFactory();
        }
        if (message=="Sms")
        {
            return new SMSFactory();
        }
        return null;
    }
}
