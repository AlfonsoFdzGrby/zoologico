import java.time.LocalDate;

public class Visitante extends Usuario {
    int numVisitas = 0;
    LocalDate fechaDeRegistro;
    
    public Visitante(String name, String lastName, LocalDate birthDate, String cURP,
            LocalDate fechaDeRegistro) {
        super(name, lastName, birthDate, cURP);
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public void añadirVisita(){
        numVisitas++;
    }

    public String getName(){
        return name;
    }

    public LocalDate getbirthDate(){
        return birthDate;
    }

}