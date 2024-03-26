package Zoologico;

public class Usuario {
    String nombre;
    String apellidos;
    String diaDeNacimiento;
    String mesDeNacimiento;
    String añoDeNacimiento;
    String curp;
    
    public Usuario(String nombre, String apellidos, String diaDeNacimiento, String mesDeNacimiento,
            String añoDeNacimiento, String curp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.diaDeNacimiento = diaDeNacimiento;
        this.mesDeNacimiento = mesDeNacimiento;
        this.añoDeNacimiento = añoDeNacimiento;
        this.curp = curp;
    }

    
}
