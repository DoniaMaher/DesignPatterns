

public class TA extends Observer {
    String name;
    String department;
    String email;
    String phoneNumber;


    public TA(String name, String department, String email, String phoneNumber,Course course) {
        super();
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.course.addObserver(this);
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void getnotify() {
        System.out.print("TA " + this.name +" "+ "notified with " + this.course.getNotification()+ "  \n \n");
    }
}
