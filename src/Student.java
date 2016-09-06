/**
 * Created by joe on 8/29/16.
 */
//this class is to represent a student at the iron yard
public class Student {
    public String firstName;
    public String lastName;
    public char gender;
    public String dateOfBirth;
    public char grade;

    //student constructor
    Student(String firstName,String lastName,char gender,String dateOfBirth,char grade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.grade=grade;
    }

    //setters
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getGender(){
        return gender;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public char getGrade(){
        return grade;
    }

}
