import java.time.LocalDate;

public class Empleado extends Usuario{
    long RFC;
    float salary;
    String startTime;
    String endTime;
    LocalDate entryDate;
    String role;
    
    public Empleado(String name, String lastName, LocalDate birthDate, String cURP, long rFC, float salary,
            String startTime, String endTime, LocalDate entryDate, String role) {
        super(name, lastName, birthDate, cURP);
        RFC = rFC;
        this.salary = salary;
        this.startTime = startTime;
        this.endTime = endTime;
        this.entryDate = entryDate;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public void setNames(String first, String last){
        this.name = first;
        this.lastName = last;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    
}