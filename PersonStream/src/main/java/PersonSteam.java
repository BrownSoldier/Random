import java.util.ArrayList;
import java.util.List;

public class PersonSteam {
   private String firstname;
   private String lastname;
   private int age;
   private String ssn;
    public List<Person> people = new ArrayList<>();
    public void CreatePeople(){

        for(int i = 0; i<9999; i++){
            new Person(firstname,lastname,age,ssn);
        }
    }


}
