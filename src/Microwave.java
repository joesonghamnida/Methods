import java.lang.reflect.Array;

/**
 * Created by joe on 8/29/16.
 */
//subset of oven class
public class Microwave extends Oven {
    //this is for the for loop
    private int i;

    //variables
    private int timerSeconds;
    private String[] cookSettings;
    //revolutions per minute
    private int trayRotationSpeed;

    //constructor
    Microwave(int timerSeconds,String cookSettings,int trayRotationSpeed){
        this.timerSeconds=timerSeconds;
        this.cookSettings=cookSettings;
        this.trayRotationSpeed=trayRotationSpeed;
    }

    //setters
    public void setCookTime(int timerSeconds){
        this.timerSeconds=timerSeconds;
    }
    public void setCookSettings(String[] cookSettings){

        for(i=0;i<cookSettings.length;i++){
            if(cookSettings[i].equals("well done")){
                cookSettings[i]="microwave breaks";
            }
            this.cookSettings=cookSettings;
        }
    }
    public void setTrayRotation(int trayRotationSpeed){
        if (trayRotationSpeed<60){
            this.trayRotationSpeed=60;
        }
        else{
            this.trayRotationSpeed=trayRotationSpeed;
        }
    }
    //getters
    public int getCookTime(){
        return setTimerSeconds;
    }
    public String getCookSettings(){
        for(i=0;i<cookSettings.length;i++)
        return cookSettings[i];
        return null;
    }
    public int getTrayRotationSpeed(){
        return trayRotationSpeed;
    }
}

