import java.time.LocalDate;
import java.util.*;

public class Animal {
    static int nextId = 0;
    int id;
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
        id = nextId;
        nextId++;
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
        if(this.diseases!=null){
            this.diseases.addAll(diseases);
        }else{
            this.diseases = diseases;
        }
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

    public void getInfo(){
        System.out.println(" * ID: " + id);
        System.out.println(" * Kind: " + kind);
        System.out.println(" * Birth Date: " + birthDate.toString());
        System.out.println(" * Arrival Date: " + arrivalDate.toString());
        System.out.println(" * Weight: " + weight);

        if(diseases==null){
            System.out.println(" * No diseases");
        }else{
            System.out.println(" * Diseases:");
            for (int i = 0; i < diseases.size(); i++) {
                System.out.println("    * " + diseases.get(i));
            }
            System.out.println(" * Feeding Frequency: " + feedingFreq);
            System.out.println(" * Feeding Type: " + feedingType);
            if(isVaccinated){
                System.out.println(" * Vaccinated: Yes");
            }else{
                System.out.println(" * Vaccinated: No");
            }
        }
        
    }

}
