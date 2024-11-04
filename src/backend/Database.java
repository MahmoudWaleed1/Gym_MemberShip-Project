/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mahmoud Waleed
 */
abstract public class Database {
    private ArrayList<General> records;
    private String fileName;

    public Database(String fileName){
        this.fileName = fileName;
        records = new ArrayList<>();
    }    
    
    public void readFromFile() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();
            if (!line.isEmpty()) {
                General g = createRecordFrom(line);
                records.add(g);
            }
        }
    }
    
   abstract public General createRecordFrom(String line); 
  
    public ArrayList<General> returnAllRecords() {
        return records;
    }
    
    public boolean contains(String key) {
        for (General g : records) {
            if (g.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
    
    public General getRecord(String key) {
        for (General g : records) {
            if (g.getSearchKey().equals(key)) {
                return g;
            }
        }
        return null;
    }
    
    public boolean insertRecord(General record) {
        if (contains(record.getSearchKey())) {
            System.out.println("Id already exists.");
            return false;
        } else {
            records.add(record);
            return true;
        }
    }
    
     public boolean deleteRecord(String key) {
        General c = getRecord(key);
        if(c!= null){
        records.remove(c);
        return true;}
        else
        return false;
    }
     
    public void saveToFile() throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (General g : records) {
            writer.write(g.lineRepresentation());
        }
         writer.flush();
}
}