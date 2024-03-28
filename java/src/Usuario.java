import java.time.LocalDate;

public class Usuario {
    String name;
    String lastName;
    LocalDate birthDate;
    String CURP;

    public Usuario(String name, String lastName, LocalDate birthDate, String cURP) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        CURP = cURP;
    }
    
}
