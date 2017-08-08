import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamStart {
    public static void main(String[] args) {
        //1
        PersonSteam s = new PersonSteam();
        List<Person> people = new ArrayList<>();
        try {
            people = s.CreatePeople();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2
        PersonLog log = new PersonLog();
        List<Person> NamePeople = new ArrayList<>();
        log.add(people.stream().filter(p -> p.getLastName().toUpperCase().charAt(0) == 'S' || p.getLastName().toUpperCase().charAt(0) == 'C'));
        log.add(people.stream().filter(p -> p.getFirstName().toUpperCase().charAt(0) == 'A' || p.getFirstName().toUpperCase().charAt(0) == 'R' || p.getFirstName().toUpperCase().charAt(0) == 'Q'));

        System.out.println(NamePeople);
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
    }
}
