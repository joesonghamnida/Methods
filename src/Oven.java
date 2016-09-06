/**
 * Created by joe on 8/29/16.
 */
//this class is to model an oven
public class Oven {
    public String ovenBrand;
    public int numOfRacks;
    public int currTemp;
    public boolean powerOn;
    public boolean underWarranty;
    public boolean recallIssued;

    //constructor
    Oven(String ovenBrand,int numOfRacks,int currTemp,boolean powerOn,boolean underWarranty,
         boolean recallIssued){
       this.ovenBrand=ovenBrand;
        this.numOfRacks=numOfRacks;
        this.currTemp=currTemp;
        this.powerOn=powerOn;
        this.underWarranty=underWarranty;
    }

    //setters
    public void setOvenBrand(String ovenBrand) {
        this.ovenBrand = ovenBrand;
    }

    public void setNumOfRacks(int numOfRacks) {
        rackCheck(numOfRacks);
        this.numOfRacks = numOfRacks;
    }

    public int rackCheck(int numOfRacks){
        if (numOfRacks<0 || numOfRacks>31) {
            System.out.println("That model is not available");
            numOfRacks = 0;
        }
            return numOfRacks;
    }

    public void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void setUnderWarranty(boolean underWarranty) {
        this.underWarranty = underWarranty;
    }

    public void setRecallIssued(boolean recallIssued) {
        this.recallIssued = recallIssued;
    }
//getters
    public String getOvenBrand(){
        return ovenBrand;
    }
    public int getNumOfRacks(){
        return numOfRacks;
    }
    public int getCurrTemp(){
        return currTemp;
    }
    public boolean getPowerOn(){
        return powerOn;
    }
    public boolean getUnderWarranty(){
        return underWarranty;
    }
    public boolean getRecallIssued(){
        return recallIssued;
    }

}