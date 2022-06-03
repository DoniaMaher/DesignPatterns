public class Addtask  extends processor
{


        public Addtask(processor nextProcessor)
        {
            super(nextProcessor);

        }
        public void process(handler request)
        {
            if (request.gethandler()=="Addtask")
            {
                if((request.getuser() instanceof Professor||request.getuser() instanceof TA))
                {
                    System.out.println(request.gethandler()+" by "+request.getuser());
                }
                else {
                    System.out.println("Access Denied for "+request.gethandler());
                }
            }
            else
            {
                super.process(request);
            }
        }
}
