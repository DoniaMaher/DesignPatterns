
public class Professor implements builder{
   private user userr;
    String name;
    String department;
    String PhDTopic;
    String email;
    String phoneNumber;
public Professor(String name, String department, String phDTopic, String email,
                 String phoneNumber){
    this.userr=new user();
    this.name=name;
    this.department=department;
    this.PhDTopic=phDTopic;
    this.email=email;
    this.phoneNumber=phoneNumber;

}
    @Override
    public void buildname() {
      userr.name(this.name);
    }

    @Override
    public void builddepartment() {
        userr.department(this.department);
    }

    @Override
    public void buildPhDTopic() {
       userr.PhDTopic(this.PhDTopic);
    }

    @Override
    public void buildemail() {
       userr.email(this.email);
    }

    @Override
    public void buildphoneNumber() {
         userr.phoneNumber(this.phoneNumber);
    }

    @Override
    public void buildID() {

    }

    @Override
    public user getuser()
    {
        System.out.println("Welcome Dr. "+this.name);
        return this.userr;
    }

}
