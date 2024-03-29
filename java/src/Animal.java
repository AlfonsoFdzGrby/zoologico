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
        id++;
    }

    public int getID(){
        return id;
    }

    public String getKind(){
        return kind;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void addDiseases(ArrayList<String> diseases){
        this.diseases.addAll(diseases);
    }
    
    public ArrayList<String> getDiseaseList(){
        return diseases;
    }

    public String getFeedingFrequency(){
        return feedingFreq;
    }

    public void setFeedingFrequency(String freq){
        this.feedingFreq = freq;
    }

    public void setFeedingType(String type){
        this.feedingType = type;
    }

    public void setVaccineStatus(boolean status){
        this.isVaccinated = status;
    }
}
