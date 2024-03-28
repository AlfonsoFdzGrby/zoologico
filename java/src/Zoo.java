import java.time.LocalDate;
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
        int birthMonth=scanner.nextInt();
        System.out.println("Day: ");
        int birthDay=scanner.nextInt();
        System.out.println("Year: ");
        int birthYear=scanner.nextInt();
        scanner.nextLine();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        System.out.println("Date of entry as a worker...");
        System.out.println("Month: ");
        int entryMonth=scanner.nextInt();
        System.out.println("Day: ");
        int entryDay=scanner.nextInt();
        System.out.println("Year: ");
        int entryYear=scanner.nextInt();

        LocalDate entryDate = LocalDate.of(entryYear, entryMonth, entryDay);

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
        String role;

        while(true){
            role = scanner.nextLine();
            if(role.equalsIgnoreCase("veterinarian") || role.equalsIgnoreCase("guide") || role.equalsIgnoreCase("administration")){
                break;
            }else{
                System.out.println("The specified role is not valid. Please enter a valid role:");
            }
        }
        
        employeeList.add(new Empleado(name, lastName, birthDate, CURP, RFC, salary, startTime, endTime, entryDate, role));

        System.out.println("The employee has been successfully registered!");
    }

    public void registerVisitor(){
        System.out.println("Name: ");
        String name=scanner.next();
        System.out.println("Last name: ");
        String lastName=scanner.next();

        System.out.println("Birthday...");
        System.out.println("Month: ");
        int birthMonth = scanner.nextInt();
        System.out.println("Day: ");
        int birthDay = scanner.nextInt();
        System.out.println("Year: ");
        int birthYear = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        System.out.println("CURP: ");
        String CURP=scanner.next();

        System.out.println("Date of register...");
        System.out.println("Month: ");
        int registerMonth=scanner.nextInt();
        System.out.println("Day: ");
        int registerDay=scanner.nextInt();
        System.out.println("Year: ");
        int registerYear=scanner.nextInt();

        LocalDate registerDate = LocalDate.of(registerYear, registerMonth, registerDay);

        visitorList.add(new Visitante(name, lastName, birthDate, CURP, registerDate));
        System.out.println("The visitor has been successfully registered!");
    }

    public void registerVisit(){
        System.out.println("Name of guide in charge: ");
        String name = scanner.next();

        System.out.println("How many visitors are going to visit?");
        int numberVisitors=scanner.nextInt();

        for (int i = 0; i < numberVisitors; i++) {

        }


        System.out.println("A visit has been successfully registered!");
    }

}
