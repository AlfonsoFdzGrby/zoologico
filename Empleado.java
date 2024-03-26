package Zoologico;

public class Empleado extends Usuario{
    long rfc;
    float salario;
    String horario;
    String rol;

    public Empleado(String nombre, String apellidos, String diaDeNacimiento, String mesDeNacimiento,
            String añoDeNacimiento, String curp, long rfc, float salario, String horario, String rol) {
        super(nombre, apellidos, diaDeNacimiento, mesDeNacimiento, añoDeNacimiento, curp);
        this.rfc = rfc;
        this.salario = salario;
        this.horario = horario;
        this.rol = rol;
    }

}