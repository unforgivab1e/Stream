import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int number;
    private String name;
   // SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    private Date brith;


    private String gender;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public Student(int number, String name, String brith, String gender) throws ParseException {
        this.number = number;
        this.name = name;
        this.brith=new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(brith));
        this.gender = gender;
    }


}
