public class Chain
{
    processor chain;
    public Chain()
    {
        buildchain();
    }
    private void buildchain()
    {
        chain = new Addtask(new Addassigment(new postGrades(new postAnnouncement(null))));

}
    public void process(handler request) {
        chain.process(request);
    }
}
