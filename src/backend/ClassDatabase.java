/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author Mahmoud Waleed
 */
public class ClassDatabase extends Database{
    private ArrayList<Class> records;
    private String fileName;
    
    public ClassDatabase(String fileName){
        super(fileName);
    }
    
    
    public Class createRecordFrom(String line) {
        String[] lineSeperate = line.split(",");
        String classID = lineSeperate[0];
        String className = lineSeperate[1];
        String trainerID = lineSeperate[2];
        int duration =  Integer.parseInt(lineSeperate[3]);
        int availableSeats = Integer.parseInt(lineSeperate[4]);
        Class c = new Class(classID, className, trainerID, duration, availableSeats);
        return c;
    }
    
   
}
