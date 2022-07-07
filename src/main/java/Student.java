import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int number;



    private String name;
    private String brith;
    private String gender;


    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }



    public String getBrith() {
        return brith;
    }



    public String getGender() {
        return gender;
    }




    public Student(int number, String name, String brith, String gender) throws ParseException {
        this.number = number;
        this.name = name;
       //this.brith=new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(brith));
        this.brith=brith;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", brith='" + brith + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
