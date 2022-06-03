public class SMSFactory extends abstractfactory{
    @Override
    message createmsg(String messagetype)
    {
        if(messagetype.equalsIgnoreCase("NewsSMS"))
        {
            return new DailyNewsMobileMessage();
        }
        if(messagetype.equalsIgnoreCase("TaskSMS"))
        {
            return new TaskAddedMobileMessage();
        }
        if(messagetype.equalsIgnoreCase("GradesSMS"))
        {
            return new GradesAnnouncementMobileMessage();
        }
        return null;
    }
}
