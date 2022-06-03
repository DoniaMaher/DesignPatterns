public class handler
{
    private String handler;
    private Object User;
    public handler(String handler,Object User)
    {
        this.handler = handler;
        this.User=User;
    }

    public String gethandler()
    {
        return handler;
    }
    public Object getuser()
    {
        return User;
    }
}
