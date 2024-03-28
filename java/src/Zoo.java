

import java.util.ArrayList;
import java.util.Scanner;
public class Zoo {
    Scanner scanner=new Scanner(System.in);
    private ArrayList<Empleado> employeeList=new ArrayList<>();
    private ArrayList<Visitante> visitorList=new ArrayList<>();

    public void registerEmployee(){
        System.out.println("Name: ");
        String name=scanner.next();
        System.out.println("Last name: ");
        String lastName=scanner.next();

        System.out.println("Birthday...");
        System.out.println("Month: ");
        String birthMonth=scanner.next();
        System.out.println("Day: ");
        String birthDay=scanner.next();
        System.out.println("Year: ");
        String birthYear=scanner.next();

        System.out.println("Date of entry as a worker...");
        System.out.println("Month: ");
        String entryMonth=scanner.next();
        System.out.println("Day: ");
        String entryDay=scanner.next();
        System.out.println("Year: ");
        String entryYear=scanner.next();

        System.out.println("RFC: ");
        long RFC=scanner.nextLong();
        System.out.println("CURP: ");
        String CURP=scanner.next();
        System.out.println("Salary: ");
        float salary=scanner.nextFloat();

        System.out.println("Schedule...");
        System.out.print("Enter your start time (e.g., 7:00 AM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter your end time (e.g., 2:00 PM): ");
        String endTime = scanner.nextLine();

        System.out.print("Enter your role (Veterinarian, Guide, Maintenance, Administration): ");
        String role = scanner.nextLine();

        employeeList.add(new Empleado(name,lastName,birthDay,birthMonth,birthYear,
                        entryDay,entryMonth,entryYear,RFC,CURP,salary,startTime,endTime,role));

        System.out.println("An employee has been successfully registered!");
    }

    public void registerVisitor(){
        System.out.println("Name: ");
        String name=scanner.next();
        System.out.println("Last name: ");
        String lastName=scanner.next();

        System.out.println("Birthday...");
        System.out.println("Month: ");
        String month=scanner.next();
        System.out.println("Day: ");
        String day=scanner.next();
        System.out.println("Year: ");
        String year=scanner.next();

        System.out.println("CURP: ");
        String CURP=scanner.next();

        System.out.println("Number of visits: ");
        String numberOfVisits=scanner.next();

        System.out.println("Date of register...");
        System.out.println("Month: ");
        String registerMonth=scanner.next();
        System.out.println("Day: ");
        String registerDay=scanner.next();
        System.out.println("Year: ");
        String registerYear=scanner.next();

        Visitante visitante = new Visitante(day, year, numberOfVisits, registerMonth, registerDay, CURP, registerYear);
        visitorList.add(visitante);
        System.out.println("A visitor has been successfully registered!");
    }

    public void registerVisit(){
        System.out.println("name of guide in charge: ");
        String name=scanner.next();

        System.out.println("How many visitors are going to visit?");
        int numberVisitors=scanner.nextInt();

        for (int i = 0; i < numberVisitors; i++) {

        }


        System.out.println("A visit has been successfully registered!");
    }

}
