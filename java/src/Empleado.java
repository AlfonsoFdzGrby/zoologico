

public class Empleado extends Usuario{
    long RFC;
    float salary;
    String startTime;
    String endTime;
    String entryMonth;
    String entryDay;
    String entryYear;

    String role;

    public Empleado(String name, String lastName, String birthDay, String birthMonth,String birthYear,
                    String entryMonth,
                    String entryDay, String entryYear,long RFC, String CURP,float salary,
                    String startTime,String endTime,String role) {

        super(name, lastName, birthDay, birthMonth, birthYear, CURP);
        this.RFC = RFC;
        this.salary = salary;
        this.startTime=startTime;
        this.endTime=endTime;
        this.role = role;
    }

}