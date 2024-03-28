import java.time.LocalDate;
import java.util.*;

public class Zoo {
    private static Scanner scanner=new Scanner(System.in);
    private ArrayList<Empleado> employeeList = new ArrayList<>();
    private ArrayList<Visitante> visitorList = new ArrayList<>();
    private ArrayList<Visita> visitList = new ArrayList<>();
    private ArrayList<Animal> animalList = new ArrayList<>();

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
    
    public LocalDate askForDate(){
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        LocalDate date = LocalDate.of(year, month, day);

        return date;
    }

    public void registerEmployee(){
        System.out.println("Please enter your personal data");
        System.out.print("Name: ");
        String name=scanner.next();
        System.out.print("Last name: ");
        String lastName=scanner.next();

        System.out.println("Please enter your birth date (ONLY WITH NUMBERS)");
        LocalDate birthDate = askForDate();

        System.out.println("Please enter your registration date (ONLY WITH NUMBERS)");
        LocalDate entryDate = askForDate();

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
        LocalDate birthDate = askForDate();

        System.out.println("Please enter your legal data:");
        System.out.print("CURP: ");
        String CURP=scanner.next();

        System.out.println("Please enter your registration date (ONLY WITH NUMBERS)");
        LocalDate registerDate = askForDate();

        visitorList.add(new Visitante(name, lastName, birthDate, CURP, registerDate));
        System.out.println("The visitor has been successfully registered!");
        returnToMainMenu();
    }

    public void registerVisit(){
        ArrayList<Visitante> visitorsInVisit = new ArrayList<>();

        System.out.println("Please enter the date of the visit: ");
        LocalDate visitDate = askForDate();

        System.out.println("Please enter the name of guide in charge: ");
        String guideFirstName, guideLastName;

        Empleado guide = null;

        while(guide==null){
            System.out.print("First Name: ");
            guideFirstName = scanner.nextLine();
            System.out.print("Last Name: ");
            guideLastName = scanner.nextLine();
            for (int i = 0; i < employeeList.size(); i++) {
                if(guideFirstName.equalsIgnoreCase(employeeList.get(i).getName()) && guideLastName.equalsIgnoreCase(employeeList.get(i).getLastName())){
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

        System.out.println("Please enter the visitors that will participate:");
        System.out.println("Type and enter 'exit' when every user has been registered");
        Visitante visitor = null;
        String visitorFirstName = "", visitorLastName = "";
        int visitNum = 1;

        while(!visitorFirstName.equalsIgnoreCase("exit")){
            System.out.println("Visitor #" + visitNum);
            boolean found = false;
            System.out.print("First Name: ");
            visitorFirstName = scanner.nextLine();
            if(visitorFirstName.equalsIgnoreCase("exit") || visitorLastName.equalsIgnoreCase("exit")){
                System.out.println("All the visitors have been registered!");
                break;
            }
            System.out.print("Last Name: ");
            visitorLastName = scanner.nextLine();
            for (int i = 0; i < visitorList.size(); i++) {
                if(visitorFirstName.equalsIgnoreCase(visitorList.get(i).getName()) && visitorLastName.equalsIgnoreCase(visitorList.get(i).getLastName())){
                    visitor = visitorList.get(i);
                    System.out.println("User found! User registered!");
                    visitorsInVisit.add(visitor);
                    found = true;
                    visitNum++;
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

    public void registerAnimal(){
        ArrayList<String> diseaseList = new ArrayList<>();
        System.out.println("Please enter the kind of animal: ");
        System.out.print("Kind: ");
        String kind = scanner.nextLine();

        System.out.println("Please enter the animal's birth date: (ONLY WITH NUMBERS)");
        LocalDate birthDate = askForDate();

        System.out.println("Please enter the animal's arrival date: ");
        LocalDate arrivDate = askForDate();

        System.out.println("Please enter the animal's weight: ");
        System.out.print("Weight: ");
        float weight = scanner.nextFloat();
        scanner.nextLine(); //esto es solo para q java no se coma el enter (fokin objeto String está todo mal hecho)
        
        System.out.println("Please enter the animal's deseases (Type 'exit' when finished):");
        String disease = "";
        int diseaseNum = 0;

        while(true){
            System.out.println(String.format("Disease #%d:", diseaseNum));
            disease = scanner.nextLine();
            if(disease.equalsIgnoreCase("exit")){
                break;
            }else{
                diseaseList.add(disease);
            }
        }

        System.out.println("Please enter the feeding frequency of the animal (# hours): ");
        System.out.print("Must be fed every: ");
        String feedingFreq = scanner.nextLine();
        System.out.println("Please enter the type of feeding the animal needs: ");
        System.out.print("Feeding Type: ");
        String feedingType = scanner.nextLine();

        System.out.println("Please enter if the animal is vaccinated (y/n)");
        boolean isVaccinated = false;
        char option = ' ';

        while(true){
            option = scanner.nextLine().charAt(0);
    
            switch (Character.toLowerCase(option)) {
                case 'y':
                    isVaccinated = true;
                    break;
                
                case 'n':
                    isVaccinated = false;
                    break;
            
                default:
                    System.out.println("Please enter a valid option (y/n)");
                    break;
            }
            
            if(Character.toLowerCase(option)=='y' || Character.toLowerCase(option)=='n'){
                break;
            }
        }

        animalList.add(new Animal(kind, birthDate, arrivDate, weight, diseaseList, feedingFreq, feedingType, isVaccinated));
        System.out.println("The animal has been succesfully registered!");
        returnToMainMenu();
    }

    /* IMPORTANTE 
     * La forma en la que este método funciona (modifyEmployee) es que cuando el
     * empleado es encontrado en la employeeList se guarda en una nueva variable
     * (employee) y el empleado de la lista SE ELIMINA TEMPORALMENTE de la employeeList,
     * por lo que es necesario que cada vez que se le modifique un atributo al empleado
     * se vuelva a agregar a la employeeList
     * 
     * En el primer caso del switch hay un ejemplo...
    */

    public void modifyEmployee(){
        System.out.println("Please enter the name of the employee to modify: ");
        String name, lastName;
        Empleado employee = null;

        while(employee==null){
            System.out.println("First Name: ");
            name = scanner.next();
            System.out.println("Last Name: ");
            lastName = scanner.next();
            for (int i = 0; i < employeeList.size(); i++) {
                if(name.equalsIgnoreCase(employeeList.get(i).getName()) && lastName.equalsIgnoreCase(employeeList.get(i).getLastName())){
                    employee = employeeList.get(i); // Guarda al empleado en UNA VARIABLE NUEVA
                    employeeList.remove(i); // ELIMINA al empleado de la employeeList
                    System.out.println("Employee found!");
                    break;
                }else{
                    System.out.println("The entered employee was not found. Please enter a valid employee...");
                }
            }
        }

        System.out.println("What would you like to modify?");
        System.out.println("1. First and Last Name");
        System.out.println("2. Birth date");
        System.out.println("3. CURP");
        System.out.println("4. RFC");
        System.out.println("5. Salary");
        System.out.println("6. Schedule");
        System.out.println("7. Role");
        System.out.println("8. Nothing (return to main menu)");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                // Se modifican los atributos del empleado
                System.out.println("Please enter the employee's new name: ");
                System.out.print("First Name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("Last Name: ");
                String newLastName = scanner.nextLine();
                employee.setNames(newFirstName, newLastName);
                System.out.println("The employee's names have been succesfully changed!");
                employeeList.add(employee); // Y SE VUELVE a ANEXAR a la employeeList
                returnToMainMenu();
                break;
            case 2:
                System.out.println("Please enter the new birth date (ONLY WITH NUMBERS)");
                LocalDate birthDate = askForDate();
                employee.setBirthDate(birthDate);
                employeeList.add(employee);
                break;
            case 3: //CURP
                System.out.println("Please enter the new CURP");
                break;
            case 4: //RFC
                
                break;
            case 5: //Salary
                
                break;
            case 6: //Schedule
                
                break;
            case 7: //Role
                
                break;
        
            default: //Return to main menu
                /* Como en este caso no se le modifica nada al empleado no hay ninguna acción,
                 * PERO la employeeList no tiene al empleado porque fue eliminado desde el
                 * while(employee==null) (línea 301), así que se tiene que volver a anexar a la
                 * employeeList
                 */
                employeeList.add(employee);
                break;
        }

    }
}
