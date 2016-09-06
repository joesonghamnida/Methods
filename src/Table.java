/**
 * Created by joe on 8/29/16.
 */
//this class is to model a generic table
public class Table {
    public byte numOfLegs;
    public long numOfCorners;
    public String surfaceType;
    public String whereFound;
    public float price;
    public char canGetRefund;

    //constructor
    Table(byte numOfLegs,long numOfCorners, String surfaceType, String whereFound, float price,
          char canGetRefund){
        this.numOfLegs=numOfLegs;
        this.numOfCorners=numOfCorners;
        this.surfaceType=surfaceType;
        this.whereFound=whereFound;
        this.price=price;
        this.canGetRefund=canGetRefund;
    }

    //setters
    public void setNumOfLegs(byte numOfLegs){
        legCheck(numOfLegs);
        this.numOfLegs=numOfLegs;
    }

    public int legCheck(byte numOfLegs){
        if (numOfLegs!=4){
            numOfLegs=4;
        return numOfLegs;
    }

    public void setNumOfCorners(long numOfCorners){
        this.numOfCorners=numOfCorners;
    }

    public long CornerCheck(long numOfCorners){
            if (numOfCorners==0){
                numOfCorners=4;
            }
            return numOfCorners;
    }

    public void setSurfaceType(String surfaceType){
        this.surfaceType=surfaceType;
    }
    public void setWhereFound(String whereFound){
        this.whereFound=whereFound;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setCanGetRefund(char canGetRefund){
        this.canGetRefund=canGetRefund;
    }

    //getters
    public byte getNumOfLegs(){
        return numOfLegs;
    }
    public long getNumOfCorners(){
        return numOfCorners;
    }
    public String getSurfaceType(){
        return surfaceType;
    }
    public String getWhereFound(){
        return whereFound;
    }
    public float getPrice(){
        return price;
    }
    public char getCanGetRefund(){
        return canGetRefund;
    }

}
