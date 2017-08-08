import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonSteam {
    private Random random = new Random();
   private String[] firstname = new String[9999];
   private String[] lastname = new String[9999];
   private int age;
   private String ssn;
    public List<Person> people = new ArrayList<>();

    public List<Person> CreatePeople() throws IOException {
        FileReader firstNameReader = new FileReader("C:\\Users\\Isaiah\\WorkSpace\\Random\\PersonStream\\src\\main\\java\\FirstNames.txt");
        BufferedReader firstNames = new BufferedReader(firstNameReader);
        FileReader lastNameReader = new FileReader("C:\\Users\\Isaiah\\WorkSpace\\Random\\PersonStream\\src\\main\\java\\LastNames.txt");
        BufferedReader lastNames = new BufferedReader(lastNameReader);
        for(int i = 0; i<9999; i++){
            firstname[i] = firstNames.readLine();
            lastname[i] = lastNames.readLine();
            age = random.nextInt(150) + 1;
            ssn = String.format("%09d", random.nextInt(1000000000));
            people.add(new Person(firstname[i],lastname[i],age,ssn));
        }
        return people;
    }


}
