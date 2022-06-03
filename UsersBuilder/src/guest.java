public class guest
{
    builder userbuilder;
    public guest(builder userbuilder)
    {
        this.userbuilder=userbuilder;
    }
    public user getuser()
    {
        return this.userbuilder.getuser();
    }
    public void builduser()
    {
        this.userbuilder.builddepartment();
        this.userbuilder.buildemail();
        this.userbuilder.buildID();
        this.userbuilder.buildname();
        this.userbuilder.buildphoneNumber();
        this.userbuilder.buildPhDTopic();

    }

}
