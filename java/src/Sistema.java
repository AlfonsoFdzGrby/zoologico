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
        int option=0;

        do {
            zoo.setToEmpList(new Empleado("Jorge", "Puebla", LocalDate.of(2000, 2, 23), "PBJ000223HMNXXXXXX", 123456, 12000, "7:00 AM", "2:00 PM", LocalDate.of(2020, 2, 25), "Guide"));
            zoo.setToVisitorList(new Visitante("Paquito", "El Chato", LocalDate.of(2000, 02, 15), "CURPCHINGONAXD", LocalDate.of(2020, 12, 15)));
            zoo.setToAnimalList(new Animal("Monkey", LocalDate.of(2010, 5, 25), LocalDate.of(2020, 2, 23), 25, null, "2 hours", "Vegetables and raw meat", false));
            printHeader("WELCOME TO THE ZOO");
            System.out.println("1. Register employee");
            System.out.println("2. Register visitor");
            System.out.println("3. Register visit");
            System.out.println("4. Register animal");
            System.out.println("5. Modify (Employee, visitor, or animal)");
            System.out.println("6. Delete (Employee, visitor, or animal)");
            System.out.println("7. Consult (Employee, visitor or animal)");
            System.out.println("8. Exit");
            System.out.print(">> ");
            option=scanner.nextInt();

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
                        printHeader("MODIFY (Employee, Visitor or Animal)");
                        System.out.println("Please enter the element to modify: ");
                        System.out.println("1. Employee");
                        System.out.println("2. Visitor");
                        System.out.println("3. Animal");
                        System.out.println("4. Return to main menu");
                        int subOption = scanner.nextInt();

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
                        
                                default:
                                        break;
                        }

                        //zoo.modify();
                        break;
                
                case 6:
                        break;
                
                case 7:
                        printHeader("CONSULT (Employee, Visitor or Animal)");
                        System.out.println("Please enter the element to modify: ");
                        System.out.println("1. Employee");
                        System.out.println("2. Visitor");
                        System.out.println("3. Animal");
                        System.out.println("4. Return to main menu");
                        int subOption2 = scanner.nextInt();

                        switch (subOption2) {
                                case 1:
                                        zoo.consultEmployee();
                                        break;
                        
                                default:
                                        break;
                        }

                        break;

            }
        }while (option!=8);

    }
}
