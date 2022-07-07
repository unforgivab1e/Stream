import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"赵雷","1990-01-01","男"));
        students.add(new Student(2,"钱电","1990-12-21","男"));
        students.add(new Student(3,"孙凤","1990-05-20","男"));
        students.add(new Student(4,"李云","1990-08-06","男"));
        students.add(new Student(5,"周梅","1990-12-01","女"));
        students.add(new Student(6,"吴兰","1990-07-01","女"));
        students.add(new Student(7,"郑竹","1990-05-21","男"));
        students.add(new Student(8,"王菊","1990-02-18","女"));
        students.add(new Student(9,"冯三","1990-08-31","男"));
        students.add(new Student(10,"陈风","1990-06-17","女"));
        students.add(new Student(11,"储五","1990-07-09","男"));
        students.add(new Student(12,"卫六","1990-12-11","女"));
    }
}
