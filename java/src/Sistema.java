import java.time.LocalDate;
import java.util.Scanner;
public class Sistema {
    private Scanner scanner = new Scanner(System.in);
    private Zoo zoo = new Zoo();

    public void printHeader(String header){
        System.out.println("==================================================");
        System.out.println(header);
        System.out.println("==================================================");
    }

    public void runProgram(){
        zoo.setToEmpList(new Empleado("Jorge", "Ochoa", LocalDate.of(2000, 2, 23), "PBJ000223HMNXXXXXX", 123456, 12000, "7:00 AM", "2:00 PM", LocalDate.of(2020, 2, 25), "Guide"));
        zoo.setToEmpList(new Empleado("Jose", "Perez", LocalDate.of(2000, 2, 23), "PBJ000223HMNXXXXXX", 123456, 12000, "7:00 AM", "2:00 PM", LocalDate.of(2020, 2, 25), "Maintenance"));
        zoo.setToVisitorList(new Visitante("Paquito", "El Chato", LocalDate.of(2010, 02, 15), "CURPCHINGONAXD", LocalDate.of(2020, 12, 15)));
        zoo.setToAnimalList(new Animal("Monkey", LocalDate.of(2010, 5, 25), LocalDate.of(2020, 2, 23), 25, null, "2 hours", "Vegetables and raw meat", false));

        int option=0;

        do {
            printHeader("WELCOME TO THE ZOO");
            System.out.println("1. Register employee");
            System.out.println("2. Register visitor");
            System.out.println("3. Register visit");
            System.out.println("4. Register animal");
            System.out.println("5. Register maintenance");
            System.out.println("6. Modify (Employee, visitor, animal, visit or maintenance)");
            System.out.println("7. Delete (Employee, visitor, animal, visit or maintenance)");
            System.out.println("8. Consult (Employee, visitor, animal, visit or maintenance)");
            System.out.println("9. Exit");
            System.out.print(">> ");
            option=scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                        printHeader("REGISTER EMPLOYEE");
                        zoo.registerEmployee();
                        break;

                case 2:
                        printHeader("REGISTER A VISITOR");
                        zoo.registerVisitor();
                        break;
                case 3:
                        printHeader("REGISTER VISIT");
                        zoo.registerVisit();
                        break;

                case 4:
                        printHeader("REGISTER ANIMAL");
                        zoo.registerAnimal();
                        break;

                case 5:
                        printHeader("REGISTER MAINTENANCE");
                        zoo.registerMaintenance();
                        break;

                case 6:
                        printHeader("MODIFY (Employee, visitor, animal or visit)");
                        System.out.println("Please enter the element to modify: ");
                        System.out.println("1. Employee");
                        System.out.println("2. Visitor");
                        System.out.println("3. Animal");
                        System.out.println("4. Visit");
                        System.out.println("5. Maintenance");
                        System.out.println("6. Return to main menu");
                        int subOption = scanner.nextInt();
                        scanner.nextLine();

                        switch (subOption) {
                                case 1:
                                        zoo.modifyEmployee();
                                        break;

                                case 2:
                                        zoo.modifyVisitor();
                                        break;

                                case 3:
                                        zoo.modifyAnimal();
                                        break;

                                case 4:
                                        zoo.modifyVisit();
                                        break;
                                
                                case 5:
                                        zoo.modifyMaintenance();
                                        break;
                        
                                default:
                                        break;
                        }
                        break;
                
                case 7:
                        printHeader("DELETE (Employee, visitor, animal or visit)");
                        System.out.println("Please enter the element to delete");
                        System.out.println("1. Employee");
                        System.out.println("2. Visitor");
                        System.out.println("3. Animal");
                        System.out.println("4. Visit");
                        System.out.println("5. Maintenance");
                        System.out.println("6. Return to main menu");
                        int subOption3 = scanner.nextInt();
                        scanner.nextLine();

                        switch (subOption3) {
                                case 1:
                                        zoo.deleteEmployee();
                                        break;
                        
                                case 2:
                                        zoo.deleteVisitor();
                                        break;
                        
                                case 3:
                                        zoo.deleteAnimal();
                                        break;
                                
                                case 4:
                                        zoo.deleteVisit();
                                        break;

                                case 5:
                                        zoo.deleteMaintenance();
                                        break;
                        
                                default:
                                        break;
                        }
                        break;
                
                case 8:
                        printHeader("CONSULT (Employee, visitor, animal or visit)");
                        System.out.println("Please enter the element to consult: ");
                        System.out.println("1. Employee");
                        System.out.println("2. Visitor");
                        System.out.println("3. Animal");
                        System.out.println("4. Visit");
                        System.out.println("5. Maintenance");
                        System.out.println("6. Return to main menu");
                        int subOption2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (subOption2) {
                                case 1:
                                        zoo.consultEmployee();
                                        break;
                                
                                case 2:
                                        zoo.consultVisitor();
                                        break;

                                case 3:
                                        zoo.consultAnimal();
                                        break;
                                
                                case 4:
                                        zoo.consultVisit();
                                        break;
                                
                                case 5:
                                        zoo.consultMaintenance();
                                        break;
                        
                                default:
                                        break;
                        }

                        break;
            }

        }while (option<9);

    }

}