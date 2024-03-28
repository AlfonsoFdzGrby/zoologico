
import java.util.Scanner;
public class Sistema {
    private Scanner scanner = new Scanner(System.in);
    private Zoo zoo=new Zoo();
    public void runProgram(){
        System.out.println("\n*****WELCOME TO THE ZOO*****");
        int option=0;

        do {
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
                        System.out.println("\nYou selected register an employee");
                        zoo.registerEmployee();
                        break;

                case 2:
                        System.out.println("\nYou selected register a visitor");
                        zoo.registerVisitor();
                        break;
                case 3:
                        System.out.println("\nYou selected register a visit");
                        zoo.registerVisit();
                        break;

                case 4:
                        System.out.println("\nYou selected register an animal");
                        // TODO: registerAnimal 
                        // zoo.registerAnimal();
                        break;

                case 5:
                        System.out.println("\nYou selected modify (Employee, visitor, or animal)");

                        break;

            }
        }while (option!=8);

    }
}
