import abstractFactory.company.DailyNewsMobileMessage;
import abstractFactory.company. GradesAnnouncementMobileMessage;
import abstractFactory.company. TaskAddedMobileMessage;
public class SMS implements SMSGateway{
    @Override
    public void sendSMSMessage(String user) {
       String message="hellosms";
        System.out.print(message+""+user);

//        String[] placeHolders = new String[] {}; // set some place holders here
//
//        if(message instanceof DailyNewsMobileMessage) {
//            DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;
//
//            msg.prepareMessage(placeHolders);
//
//            // some code to send message
//        }
//
//        else if(message instanceof GradesAnnouncementMobileMessage) {
//            GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;
//
//            msg.prepareMessage(placeHolders);
//
//            // some code to send message
//        }
//
//        else if(message instanceof TaskAddedMobileMessage) {
//            TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;
//
//            msg.prepareMessage(placeHolders);
//
//            // some code to send message to user
//        }

    }

    }
