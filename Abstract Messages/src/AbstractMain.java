public class AbstractMain
{
    public static void main(String[] args) {
        abstractfactory emailFactory = Messageproducer.create("Email");
        message msg1 = emailFactory.createmsg("NewsEmail");
        msg1.prepareMessage("msg");
        message msg2 = emailFactory.createmsg("GradesEmail");
        msg2.prepareMessage("msg");
        message msg3 = emailFactory.createmsg("TaskEmail");
        msg3.prepareMessage("msg");
        abstractfactory SmsFactory = Messageproducer.create("Sms");
        message msg4 = SmsFactory.createmsg("NewsSms");
        msg4.prepareMessage("msg");
        message msg5 = SmsFactory.createmsg("GradesSms");
        msg5.prepareMessage("msg");
        message msg6 = SmsFactory.createmsg("TaskSms");
        msg6.prepareMessage("msg");

    }
}
