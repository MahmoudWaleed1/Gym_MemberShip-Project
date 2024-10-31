
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AdminRole {
     private TrainerDatabase database;

    public AdminRole() throws FileNotFoundException {
        database = new TrainerDatabase("Trainers.txt");
        database.readFromFile();
    }
    
    public void addTrainer(String trainerId, String name, String email, String speciality, String phoneNumber){
        Trainer record = new Trainer(trainerId, name, email, speciality, phoneNumber);
        database.insertRecord((General)record);
    }
    
    public ArrayList getListOfTrainers(){
        return database.returnAllRecords();
    }
    
    public void removeTrainer(String key){
        database.deleteRecord(key);
    }
    
    public void logout() throws IOException{
        database.saveToFile();
    }
}
