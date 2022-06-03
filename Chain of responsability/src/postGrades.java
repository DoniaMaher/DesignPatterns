public class postGrades extends processor{

        public postGrades(processor nextProcessor)
        {
            super(nextProcessor);

        }
        public void process(handler request)
        {
            if (request.gethandler()=="postGrades")
            {
                if((request.getuser() instanceof Professor||request.getuser() instanceof TA))
                {
                    System.out.println(request.gethandler()+" by "+request.getuser());
                }
                else
                {
                    System.out.println("Access Dnied for "+request.gethandler());
                }

            }
            else
            {
                super.process(request);
            }
        }
    }



