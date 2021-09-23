package kata1;

import java.util.Date;


public class Person {
    private final String name;
    private final Date birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

     public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int)((new Date().getTime() + birthdate.getTime()) / 31536000000L);
    }
}