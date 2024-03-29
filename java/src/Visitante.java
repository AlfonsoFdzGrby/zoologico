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

    public String getLastName(){
        return lastName;
    }

    public LocalDate getbirthDate(){
        return birthDate;
    }

    public void setNames(String first, String last){
        this.name = first;
        this.lastName = last;
    }

    public void setBirthDate(LocalDate date){
        this.birthDate = date;
    }

    public void setCURP(String curp){
        this.CURP = curp;
    }

    public void getInfo(){
        System.out.println(" * Name: " + name + " " + lastName);
        System.out.println(" * Birth Date: " + birthDate.toString());
        System.out.println(" * CURP: " + CURP);
        System.out.println(" * Registration date: " + fechaDeRegistro.toString());
    }

}