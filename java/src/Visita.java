import java.util.*;
import java.time.LocalDate;

public class Visita {
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
            if(visitorList.get(i).getbirthDate().getYear()<2006){
                adults++;
                total+=100;
            }else{
                children++;
                total+=50;
            }
        }
    }

    

}
