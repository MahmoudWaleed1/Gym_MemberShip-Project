/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author DELL
 */
public class Trainer implements General{
    private String trainerId;
    private String name;
    private String email;
    private String speciality;
    private String phoneNumber;

    public Trainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    
    public String lineRepresentation(){
        return trainerId + ',' + name + ',' + email + ',' + speciality + ',' + phoneNumber + '\n';
    }
    
    public String getSearchKey(){
        return trainerId;
    }
     public int getAvailableSeats(){
        System.out.println("not used here");
        return 0;
    }
}
