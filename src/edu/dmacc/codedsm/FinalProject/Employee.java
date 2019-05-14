package edu.dmacc.codedsm.FinalProject;

public class Employee {

    private String id;
    private String name;
    private Double hourlyRate;
    private Double numberOfHours;


    public Employee(String id, String name, Double hourlyRate, Double numberOfHours){
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public String getId(){
        return id;

    }
    public String getName(){
        return name;

    }
    public Double getHourlyRate (){
        return hourlyRate;

    }
    public Double getNumberOfHours(){
        return numberOfHours;

    }
    public void setId (String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setHourlyRate   (Double hourlyRate){
        this.hourlyRate = hourlyRate;

    }
    public void setNumberOfHours(Double numberOfHours){

        this.numberOfHours = numberOfHours;
    }

}
