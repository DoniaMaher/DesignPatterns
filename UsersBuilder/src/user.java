public class user implements info {

    String name;
    String department;
    String PhDTopic;
    String email;
    String phoneNumber;
    int ID;


    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    public void department(String Depatment) {
      this.department=Depatment;
    }

    @Override
    public void PhDTopic(String PhDTopic) {
      this.PhDTopic=PhDTopic;
    }

    @Override
    public void email(String email) {
          this.email=email;
    }

    @Override
    public void phoneNumber(String phoneNumber) {
         this.phoneNumber=phoneNumber;
    }

    @Override
    public void ID(int Id) {
      this.ID=Id;
    }
}