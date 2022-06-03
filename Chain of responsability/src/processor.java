abstract class processor
{
    private processor nextProcessor;

    public processor(processor nextProcessor){
        this.nextProcessor = nextProcessor;
    };

    public void process(handler request){
        if(nextProcessor != null)
            nextProcessor.process(request);
    };
}
