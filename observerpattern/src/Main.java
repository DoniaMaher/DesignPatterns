
public class Main {

    public static void main(String[] args)  {
        Course course = new Course();
        new Professor("Ahmed Farouk", "Bioinformatics", "2020-09-29", "Biophysics", "fakemail.fci.gov@gmail.com", "01122334455", course);
        new TA("Yossef Ali", "Bioinformatics", "fakemail@gmail.com", "01122334455", course);
        new Student("mena", 0, "fakemail@gmail", "01122334455", course);

        course.setNotification("task");
        course.setNotification("assignment");
        course.setNotification("Grades");
    }
}