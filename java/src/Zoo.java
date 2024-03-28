import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private static Scanner scanner=new Scanner(System.in);
    private ArrayList<Empleado> employeeList = new ArrayList<>();
    private ArrayList<Visitante> visitorList = new ArrayList<>();
    private ArrayList<Visita> visitList = new ArrayList<>();

    //Estos métodos sólo los usé para pruebas. Los podemos quitar cuando entreguemos el proyecto:
    public void setToEmpList(Empleado emp){
        employeeList.add(emp);
    }

    public void setToVisitorList(Visitante vis){
        visitorList.add(vis);
    }

    public static void returnToMainMenu(){
        System.out.println("Press enter to return to main menu...");
        scanner.nextLine();
    }

    public void registerEmployee(){
        System.out.println("Please enter your personal data");
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Last name: ");
        String lastName=scanner.next();

        System.out.println("Please enter your birth date (ONLY WITH NUMBERS)");
        System.out.print("Month: ");
        int birthMonth=scanner.nextInt();
        System.out.print("Day: ");
        int birthDay=scanner.nextInt();
        System.out.print("Year: ");
        int birthYear=scanner.nextInt();
        scanner.nextLine();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        System.out.println("Please enter your registration date (ONLY WITH NUMBERS)");
        System.out.print("Month: ");
        int entryMonth=scanner.nextInt();
        System.out.print("Day: ");
        int entryDay=scanner.nextInt();
        System.out.print("Year: ");
        int entryYear=scanner.nextInt();

        LocalDate entryDate = LocalDate.of(entryYear, entryMonth, entryDay);

        System.out.println("Please enter your finantial and legal data:");
        System.out.print("RFC: ");
        long RFC=scanner.nextLong();
        System.out.print("CURP: ");
        String CURP=scanner.next();
        System.out.print("Salary: ");
        float salary=scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Please enter your schedule: ");
        System.out.print("Enter your start time (e.g., 7:00 AM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter your end time (e.g., 2:00 PM): ");
        String endTime = scanner.nextLine();

        System.out.println("Please enter your role (Veterinarian, Guide, Maintenance, Administration): ");
        System.out.print("Role: ");
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
        System.out.println("Please enter your personal data");
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Last name: ");
        String lastName=scanner.next();

        System.out.println("Please enter your birth date (ONLY WITH NUMBERS)");
        System.out.print("Month: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Day: ");
        int birthDay = scanner.nextInt();
        System.out.print("Year: ");
        int birthYear = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        System.out.println("Please enter your legal data:");
        System.out.print("CURP: ");
        String CURP=scanner.next();

        System.out.println("Please enter your registration date (ONLY WITH NUMBERS)");
        System.out.print("Month: ");
        int registerMonth=scanner.nextInt();
        System.out.print("Day: ");
        int registerDay=scanner.nextInt();
        System.out.print("Year: ");
        int registerYear=scanner.nextInt();

        LocalDate registerDate = LocalDate.of(registerYear, registerMonth, registerDay);

        visitorList.add(new Visitante(name, lastName, birthDate, CURP, registerDate));
        System.out.println("The visitor has been successfully registered!");
        returnToMainMenu();
    }

    public void registerVisit(){
        ArrayList<Visitante> visitorsInVisit = new ArrayList<>();

        System.out.println("Please enter the date of the visit: ");

        System.out.print("Month: ");
        int Month = scanner.nextInt();
        System.out.print("Day: ");
        int Day = scanner.nextInt();
        System.out.print("Year: ");
        int Year = scanner.nextInt();

        LocalDate visitDate = LocalDate.of(Year, Month, Day);

        System.out.println("Please enter the name of guide in charge: ");
        String guideName;

        Empleado guide = null;

        while(guide==null){
            System.out.println("Guide: ");
            guideName = scanner.next();
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
                }else{
                    System.out.println("The entered employee was not found. Please enter a valid employee to be your guide...");
                }
            }
        }
        scanner.nextLine();

        System.out.println("Please enter the visitors that will participate:");
        System.out.println("Type and enter 'exit' when every user has been registered");
        Visitante visitor = null;
        String visitorName = "";

        while(!visitorName.equalsIgnoreCase("exit")){
            boolean found = false;
            System.out.print("Visitor: ");
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
            if(visitorName.equalsIgnoreCase("exit")){
                System.out.println("All the visitors have been registered!");
                break;
            }
            else if(!found){
                System.out.println("The user was not found. Please enter a valid user");
            }
        }

        visitList.add(new Visita(guide, visitorsInVisit, visitDate));

        System.out.println("A visit has been successfully booked!");
        returnToMainMenu();
    }

}
