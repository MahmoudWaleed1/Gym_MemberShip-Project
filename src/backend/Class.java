/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mahmoud Waleed
 */
public class Class implements General{

    private String classID;
    private String className;
    private String trainerID;
    private int duration;
    private int availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String lineRepresentation() {
        return classID + "," + className + "," + trainerID + "," + duration + "," + availableSeats + "\n";
    }

    public String getSearchKey() {
        return classID;
    }
}