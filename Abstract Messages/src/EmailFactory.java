public class EmailFactory extends abstractfactory
{
    @Override
    message createmsg(String messagetype)
    {
        if(messagetype.equalsIgnoreCase("NewsEmail"))
        {
             return new DailyNewsEmailMessage();
        }
        if(messagetype.equalsIgnoreCase("TaskEmail"))
        {
            return new TaskAddedEmailMessage();
        }
        if(messagetype.equalsIgnoreCase("GradesEmail"))
        {
            return new GradesAnnouncementEmailMessage();
        }
        return null;
    }
}
