import java.util.*;
import java.time.LocalDate;

public class Visita {
    static int nextID = 0;
    int id;
    Empleado guide;
    ArrayList<Visitante> visitorList = new ArrayList<>();
    float total;
    LocalDate visitDate;
    int children;
    int adults;

    public Visita(Empleado guide, ArrayList<Visitante> visitorList, LocalDate visitDate) {
        this.guide = guide;
        this.visitorList = visitorList;
        this.visitDate = visitDate;
        for (int i = 0; i < visitorList.size(); i++) {
            if(visitorList.get(i).getBirthDate().getYear()<2006){
                adults++;
                total+=100;
            }else{
                children++;
                total+=50;
            }
        }
        this.id = nextID;
        nextID++;
    }

    public int getID(){
        return this.id;
    }

    public void setGuide(Empleado guide){
        this.guide = guide;
    }

    public ArrayList<Visitante> getVisitorList(){
        return visitorList;
    }

    public void printVisitorList(){
        for (int i = 0; i < visitorList.size(); i++) {
            System.out.println("  * " + visitorList.get(i).getFullName());
        }
    }

    public void addVisitors(ArrayList<Visitante> visitors){
        if(this.visitorList!=null){
            this.visitorList.addAll(visitors);
        }else{
            this.visitorList = visitors;
        }
    }

    public LocalDate getVisitDate(){
        return visitDate;
    }

    public void setVisitDate(LocalDate date){
        this.visitDate = date;
    }

    public void getVisitInfo(){
        System.out.println("   * ID: " + id);
        System.out.println("   * Guide in charge: " + this.guide.getFullName());
        System.out.println("   * Visitors:");
        for (int i = 0; i < visitorList.size(); i++) {
            System.out.println("     * " + visitorList.get(i).getFullName());
        }
        System.out.println("   * Tickets:");
        System.out.println("     * Children ($50 MXN):");
        for (int i = 0; i < visitorList.size(); i++) {
            if(visitorList.get(i).getBirthDate().getYear()>2006){
                System.out.println("       * " + visitorList.get(i).getFullName());
            }
        }
        System.out.println("     * Number of children: " + children);
        System.out.println("     * Adults ($100 MXN)");
        for (int i = 0; i < visitorList.size(); i++) {
            if(visitorList.get(i).getBirthDate().getYear()<2006){
                System.out.println("       * " + visitorList.get(i).getFullName());
            }
        }
        System.out.println("     * Number of adults: " + adults);
        System.out.println("   * Total: " + total);
    }

}