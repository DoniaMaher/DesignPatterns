public class TA implements builder{
    String name;
    String department;
    String email;
    String phoneNumber;
    private user userr;

    public TA(String name, String department, String email, String phoneNumber) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userr = new user();
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
    public user getuser() {
        System.out.println("Welcome TA. "+this.name);
        return this.userr;
    }
}
