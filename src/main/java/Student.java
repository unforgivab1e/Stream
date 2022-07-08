import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private int number;



    private String name;
    private LocalDate brith;
    private String gender;


    public String getName() {
        return name;
    }



    public LocalDate getBrith() {
        return brith;
    }



    public String getGender() {
        return gender;
    }



    //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public Student(int number, String name, String brith, String gender) throws ParseException {
        this.number = number;
        this.name = name;
       //this.brith=new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(brith));
        this.gender = gender;
       /* Calendar date = Calendar.getInstance();
        date.setTime(dateFormat.parse(brith));*/
        this.brith=LocalDate.parse(brith, DateTimeFormatter.ofPattern("yyyy-MM-dd"));;
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
