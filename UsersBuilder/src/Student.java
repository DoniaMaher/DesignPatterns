public class Student implements builder{
    String name;
    int Id;
    String email;
    String phoneNumber;
    private user userr;

    public Student(String name, int id, String email, String phoneNumber) {
        this.name = name;
        Id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userr = new user();
    }
    @Override
    public void buildname() {
        System.out.println("Welcome Student. "+this.name+" With ID "+this.Id);
        userr.name(this.name);
    }

    @Override
    public void builddepartment() {

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
          userr.ID(this.Id);
    }

    @Override
    public user getuser() {
       return this.userr;
    }
}
