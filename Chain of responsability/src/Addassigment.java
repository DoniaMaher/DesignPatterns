
public class Addassigment extends processor
{
    public Addassigment(processor nextProcessor)
    {
        super(nextProcessor);

    }
    public void process(handler request)
    {
        if (request.gethandler()=="addassign")
        {
            if((request.getuser() instanceof Professor||request.getuser() instanceof TA))
            {
                System.out.println(request.gethandler()+" by "+request.getuser());
//                public void AddAssignment(String assignName, String assignBody) {
//                announcements.add(assignName);
//                String[] placeholders = new String[] {assignName, assignBody};
//                // do some logic here
//
//                notifyAllUsers(placeholders);
//            }
            }
           else
            {
                System.out.println("Access Denied for "+request.gethandler());
            }
        }
        else
        {
            super.process(request);
        }
    }
}
