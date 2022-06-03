public class postAnnouncement extends processor{
        public postAnnouncement(processor nextProcessor)
        {
            super(nextProcessor);

        }
        public void process(handler request)
        {
            if (request.gethandler()=="postAnnouncement")
            {
                if((request.getuser() instanceof Professor||request.getuser() instanceof TA))
                {
                    System.out.println(request.gethandler()+" by "+request.getuser());
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

