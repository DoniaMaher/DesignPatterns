
public class Main {
    public static void main(String[] args)
    {
        builder prof=new Professor("ahmed","bio","go","gg","0100");
        guest Guest1=new guest(prof);
        Guest1.builduser();
        Guest1.getuser();
        builder TA=new TA("Haasan","Bio","gg","0100");
        guest Guest2=new guest(TA);
        Guest2.builduser();
        Guest2.getuser();
        builder Student=new Student("omar",201888037,"gg","0100");
        guest Guest3=new guest(Student);
        Guest3.builduser();
        Guest3.getuser();
    }
}
