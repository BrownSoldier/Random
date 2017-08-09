import java.util.List;
import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    public Person(String firstName, String lastName, int age, String ssn){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSsn(ssn);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (getSsn() != person.getSsn()) return false;
        if (!getFirstName().equals(person.getFirstName())) return false;
        return getLastName().equals(person.getLastName());
    }

    public boolean isValidSSN(String ssn) {
        String regex = "^(?!000)(?!666)(?<SSN3>[0-6]\\d{2}|7(?:[0-6]\\d|7[012]))([- ]?)(?!00)(?<SSN2>\\d\\d)\\1(?!0000)(?<SSN4>\\d{4})$";
        return Pattern.matches(regex,ssn);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
    public Person lastStartsWith(Person person){
        if ( person.getLastName().toUpperCase().charAt(0) == 'S' && person.getLastName().toUpperCase().charAt(0) == 'C' ) {
            return person;
        }
        return null;
    }
    public Person firstStartsWith(Person person){
        if ( person.getFirstName().toUpperCase().charAt(0) == 'A' && person.getFirstName().toUpperCase().charAt(0) == 'R' && person.getFirstName().toUpperCase().charAt(0) == 'Q') {
            return person;
        }
        return null;
    }
    public void RemoveNull(List<Person> people){
        for(int i =0; i < people.size();i++){
            if(people.get(i) == null){
                people.remove(i);
            }
        }
    }
}
