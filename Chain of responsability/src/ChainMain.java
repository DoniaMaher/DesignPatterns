public class ChainMain
{
    public static void main(String[] args) {
        Chain chain = new Chain();
        Professor prof=new Professor("AHmed","gggg","kkkk","yyy","0100");
        TA engineer=new TA("Hassan","bio","hhhh","0100");
        Student STD=new Student("donia",20188037,"SSS","0100");
        //Calling chain of responsibility
        chain.process(new handler("Addtask",prof));
        chain.process(new handler("postAnnouncement",engineer));
        chain.process(new handler("postGrades",prof));
        chain.process(new handler("addassign",STD));

    }
}
