import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(LocalDate.now());
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"赵雷","1990-01-01","男"));
        students.add(new Student(2,"钱电","1990-12-21","男"));
        students.add(new Student(3,"孙凤","1990-05-20","男"));
        students.add(new Student(4,"李云","1990-08-06","男"));
        students.add(new Student(5,"周梅","1991-12-01","女"));
        students.add(new Student(6,"吴兰","1989-07-01","女"));
        students.add(new Student(7,"郑竹","1993-05-21","男"));
        students.add(new Student(8,"王菊","1996-02-18","女"));
        students.add(new Student(9,"冯三","2001-08-31","男"));
        students.add(new Student(10,"陈风","2002-06-17","女"));
        students.add(new Student(11,"储五","2000-07-09","男"));
        students.add(new Student(12,"卫六","1997-12-11","女"));
        long c=students.stream().filter(student -> "男".equals(student.getGender())).count();
        System.out.println("男人的数量是："+c+","+"女人的数量是："+(students.size()-c));
        System.out.println("------------------------------------");

        students.stream().filter(student -> student.getName().contains("风")).collect(Collectors.toList()).forEach(student -> System.out.println(student) );
        System.out.println("------------------------------------");

        students.stream().filter(student -> student.getBrith().getYear()==1990).collect(Collectors.toList()).forEach(student -> System.out.println(student));
        System.out.println("------------------------------------");

        students.stream().collect(Collectors.groupingBy(student -> student.getBrith().getYear(), Collectors.counting())).forEach((s, aLong) -> System.out.print(s+"数量是"+aLong+" "));
        System.out.println("");
        System.out.println("--------------------------------------");

        students.stream().filter(student -> student.getBrith().getMonthValue()==(LocalDate.now().getMonthValue()+1)).forEach(student -> System.out.println(student));
    }

}
