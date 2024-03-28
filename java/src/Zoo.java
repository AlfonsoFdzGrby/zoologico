import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Zoo {
    private static Scanner scanner=new Scanner(System.in);
    private ArrayList<Empleado> employeeList = new ArrayList<>();
    private ArrayList<Visitante> visitorList = new ArrayList<>();
    private ArrayList<Visita> visitList = new ArrayList<>();

    public static void returnToMainMenu(){
        System.out.println("Press enter to return to main menu...");
        scanner.nextLine();
    }

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
        scanner.nextLine();
        System.out.print("Enter your end time (e.g., 2:00 PM): ");
        String endTime = scanner.nextLine();

        System.out.print("Enter your role (Veterinarian, Guide, Maintenance, Administration): ");
        String role;

        while(true){
            role = scanner.nextLine();
            if(role.equalsIgnoreCase("veterinarian") || role.equalsIgnoreCase("guide") || role.equalsIgnoreCase("administration") || role.equalsIgnoreCase("maintenance")){
                break;
            }else{
                System.out.println("The specified role is not valid. Please enter a valid role:");
            }
        }
        
        employeeList.add(new Empleado(name, lastName, birthDate, CURP, RFC, salary, startTime, endTime, entryDate, role));

        System.out.println("The employee has been successfully registered!");
        returnToMainMenu();
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
        returnToMainMenu();
    }

    public void registerVisit(){
        ArrayList<Visitante> visitorsInVisit = new ArrayList<>();

        System.out.println("Please enter the date of the visit: ");

        System.out.println("Month: ");
        int Month = scanner.nextInt();
        System.out.println("Day: ");
        int Day = scanner.nextInt();
        System.out.println("Year: ");
        int Year = scanner.nextInt();

        LocalDate visitDate = LocalDate.of(Year, Month, Day);

        System.out.println("Please enter the name of guide in charge: ");
        String guideName = scanner.next();

        Empleado guide = null;

        while(guide==null){
            for (int i = 0; i < employeeList.size(); i++) {
                if(guideName.equalsIgnoreCase(employeeList.get(i).getName())){
                    guide = employeeList.get(i);
                    if(guide.getRole().equalsIgnoreCase("guide")){
                        System.out.println("The employee was found and will now be guide");
                        break;
                    }else{
                        System.out.println("The employee was found but is not a guide!");
                        System.out.println("Please enter a valid guide");
                        guide = null;
                    }
                }
            }
        }

        System.out.println("Please enter the visitors that will participate:");
        System.out.println("Type and enter 'exit' when every user has been registered");
        Visitante visitor = null;
        String visitorName = "";

        while(visitorName.equalsIgnoreCase("exit")){
            boolean found = false;
            visitorName = scanner.nextLine();
            for (int i = 0; i < visitorList.size(); i++) {
                if(visitorName.equalsIgnoreCase(visitorList.get(i).getName())){
                    visitor = visitorList.get(i);
                    System.out.println("User found! User registered!");
                    visitorsInVisit.add(visitor);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("The user was not found. Please enter a valid user");
            }
        }

        visitList.add(new Visita(guide, visitorsInVisit, visitDate));

        System.out.println("A visit has been successfully booked!");
        returnToMainMenu();
    }
}
