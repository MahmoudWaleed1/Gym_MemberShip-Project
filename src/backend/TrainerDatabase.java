/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TrainerDatabase extends Database{

    private ArrayList<Trainer> records;
    private String fileName;

    public TrainerDatabase(String fileName) {
        super(fileName);
    }


    public Trainer createRecordFrom(String line) {
        String[] lineSeparate = line.split(",");
        String trainerId = lineSeparate[0];
        String name = lineSeparate[1];
        String email = lineSeparate[2];
        String speciality = lineSeparate[3];
        String phoneNumber = lineSeparate[4];
        Trainer t = new Trainer(trainerId, name, email, speciality, phoneNumber);
        return t;
    }

}
