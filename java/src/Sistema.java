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
            printHeader("WELCOME TO THE ZOO");
            System.out.println("1. Register employee");
            System.out.println("2. Register visitor");
            System.out.println("3. Register visit");
            System.out.println("4. Register animal");
            System.out.println("5. Modify (Employee, visitor, or animal)");
            System.out.println("6. Delete (Employee, visitor, or animal)");
            System.out.println("7. Consult (Employee, visitor or animal)");
            System.out.println("8.  Exit\n");
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
                        // TODO: registerAnimal 
                        // zoo.registerAnimal();
                        break;

                case 5:
                        printHeader("MODIFY (Employee, Visitor or Animal)");
                        break;

            }
        }while (option!=8);

    }
}
