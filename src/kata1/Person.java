package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final LocalDate fa;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
		this.fa = null;
    }
    
     public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
    	return Period.between(birthdate, fa.now()).getYears();
    	
    }
    
}

