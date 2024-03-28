import java.time.LocalDate;
import java.util.*;

public class Animal {
    static int id = 0;
    String kind;
    LocalDate birthDate;
    LocalDate arrivalDate;
    float weight;
    ArrayList<String> diseases;
    String feedingFreq;
    String feedingType;
    boolean isVaccinated;
    
    public Animal(String kind, LocalDate birthDate, LocalDate arrivalDate, float weight, ArrayList<String> diseases,
            String feedingFreq, String feedingType, boolean isVaccinated) {
        this.kind = kind;
        this.birthDate = birthDate;
        this.arrivalDate = arrivalDate;
        this.weight = weight;
        this.diseases = diseases;
        this.feedingFreq = feedingFreq;
        this.feedingType = feedingType;
        this.isVaccinated = isVaccinated;
    }
    
}
