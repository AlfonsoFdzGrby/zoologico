

public class Visitante extends Usuario {
    int numVisitas;
    String fechaDeRegistro;
    
    public Visitante(String nombre, String apellidos, String diaDeNacimiento, String mesDeNacimiento,
            String añoDeNacimiento, String curp, String fechaDeRegistro) {
        super(nombre, apellidos, diaDeNacimiento, mesDeNacimiento, añoDeNacimiento, curp);
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public void añadirVisita(){
        numVisitas++;
    }
}