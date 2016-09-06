/**
 * Created by joe on 8/29/16.
 */

//this class is to represent an off-the-shelf thermos container
public class Thermos {
    private String brand;
    private String thermosType;
    private String contents;
    //temperature is measured in farenheit
    private int contentsTemp;
    //price is USD
    private double price;
    //date of manufacture
    private String dOfM;
    private String[] colorsAvailable;//={"Green","Pink","Blue","Grey","Purple"};


    //constructor
    Thermos(String brand,String thermosType, String contents,
            int contentsTemp, double price,
            String dOfM,String[] colorsAvailable){
        this.brand=brand;
        this.thermosType=thermosType;
        this.contents=contents;
        this.contentsTemp=contentsTemp;
        this.price=price;
        this.dOfM=dOfM;
        this.colorsAvailable=colorsAvailable;
    }
    //setters
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setThermosType(String thermosType){
        this.thermosType=thermosType;
    }

    public void setContents(String contents){
        this.contents=contents;
    }

    public void setContentsTemp(int contentsTemp) {
        if (contentsTemp < 32 || contentsTemp > 212) {
            System.out.println("This beverage is undrinkable");
            this.contentsTemp = 32;
        } else {
            this.contentsTemp = contentsTemp;
        }
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("A tip is appreciated in " +
                    "lieu of your five finger discount");
            this.price=5000;
        }
        else{
        this.price = price;
        }
    }

    public void setdOfM(String dOfM){
        this.dOfM=dOfM;
    }

    public void setColorsAvailable(String[] colorsAvailable){
        this.colorsAvailable=colorsAvailable;
    }

    //getters
    public String getBrand(){
        return brand;
    }

    public String getThermosType(){
        return thermosType;
    }

    public String getContents() {
        return contents;
    }

    public int getContentsTemp() {
        return contentsTemp;
    }

    public double getPrice() {
        return price;
    }

    public String getdOfM() {
        return dOfM;
    }

}

