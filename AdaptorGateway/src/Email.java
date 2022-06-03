import abstractFactory.company.DailyNewsEmailMessage;
import abstractFactory.company. GradesAnnouncementEmailMessage;
import abstractFactory.company. TaskAddedEmailMessage;

public class Email implements EmailGateway{
    @Override
    public void sendEmailMessage(String user) {
        String message="helloemail";
        System.out.print(message+""+user);
//        if(message instanceof DailyNewsEmailMessage) {
//            DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
//
//            dailyNewsEmailMessage.prepareMessage("tmamd");
//
//            // some code to send message
//        }
//
//        else if(message instanceof GradesAnnouncementEmailMessage) {
//            GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
//
//            announcementEmailMessage.prepareMessage("tmama");
//
//            // some code to send message
//        }
//
//        else if(message instanceof TaskAddedEmailMessage) {
//            TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
//
//            addedEmailMessage.prepareMessage("tmama");
//
//            // some code to send message by email to user
//        }


    }
}

