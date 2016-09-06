/**
 * Created by joe on 8/29/16.
 */
//this class is to model a generic elevator
public class Elevator {
    private boolean inService;
    private int weightLimit;
    private String doorsOpeningMelody;
    private String dateLastInspected;

    //constructor
    Elevator(boolean inService,int weightLimit,String doorsOpeningMelody,String dateLastInspected){
        this.inService=inService;
        this.weightLimit=weightLimit;
        this.doorsOpeningMelody=doorsOpeningMelody;
        this.dateLastInspected=dateLastInspected;
    }

    //setters
    public void setInService(boolean inService){
        this.inService=inService;
    }
    public void setWeightLimit(int weightLimit){
        if (weightLimit<2500){
            System.out.println("There is too much weight in the elevator");
        }
        else {
            this.weightLimit = weightLimit;
        }
    }
    public void setDoorsOpeningMelody(String doorsOpeningMelody){
        this.doorsOpeningMelody=doorsOpeningMelody;
    }
    public void setDateLastInspected(String dateLastInspected){
        this.dateLastInspected=dateLastInspected;
    }
    //getters
    public boolean getInService(){
        return inService;
    }
    public int getWeightLimit(){
        return weightLimit;
    }
    public String getDoorsOpeningMelody(){
        return doorsOpeningMelody;
    }
    public String getDateLastInspected(){
        return dateLastInspected;
    }
}
