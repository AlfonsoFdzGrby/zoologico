import java.util.*;
import java.time.LocalDate;

public class Mantenimiento {
    static int nextID=0;
    int id;
    Empleado empInCharge;
    Animal animal;
    String processMade;
    LocalDate processDate;
    ArrayList<String> observations = new ArrayList<>();

    public Mantenimiento(Empleado empInCharge, Animal animal, String processMade, LocalDate processDate,
            ArrayList<String> observations) {
        this.empInCharge = empInCharge;
        this.animal = animal;
        this.processMade = processMade;
        this.processDate = processDate;
        this.observations = observations;
        this.id = nextID;
        nextID++;
    }

    // Getters

    public int getID(){
        return id;
    }

    public String getEmployeeNames(){
        return empInCharge.getFullName();
    }

    public String getAnimalKind(){
        return animal.getKind();
    }

    public String getProcessMade(){
        return processMade;
    }

    public LocalDate getProcessDate(){
        return processDate;
    }

    // Setters

    public void setEmployee(Empleado emp){
        this.empInCharge = emp;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public void setProcess(String process){
        this.processMade = process;
    }

    public void setDate(LocalDate date){
        this.processDate = date;
    }

    public void addToObservations(ArrayList<String> observations){
        if(this.observations!=null){
            this.observations.addAll(observations);
        }else{
            this.observations = observations;
        }
    }

    // Others

    public void printObservationList(){
        System.out.println("CURRENT OBSERVATIONS: ");
        for (int i = 0; i < observations.size(); i++) {
            System.out.println("   * Observation #" + i + ": " + observations.get(i)); 
        }
    }

    public void removeFromObservationList(int id){
        observations.remove(id);
    }

    public void printInfo(){
        System.out.println("MAINTENANCE RECORD INFO:");
        System.out.println("   * Record ID: " + id);
        System.out.println("   * Employee in charge: " + empInCharge.getFullName());
        System.out.println("   * Animal treated: " + animal.getKind());
        System.out.println("   * Process made: " + processMade);
        System.out.println("   * Process date: " + processDate.toString());
        printObservationList();
    }
}