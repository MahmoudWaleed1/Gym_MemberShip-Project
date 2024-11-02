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
 * @author DELL
 */
public class MemberClassRegistrationDatabase extends Database{

    private ArrayList<MemberClassRegistration> records;
    private String fileName;

    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
        
    }

   
 

    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] lineSeperate = line.split(",");
        String memberID = lineSeperate[0];
        String classID = lineSeperate[1];
        LocalDate registrationDate = LocalDate.parse(lineSeperate[2]);
        String status = lineSeperate[3];
        MemberClassRegistration m = new MemberClassRegistration(memberID, classID, status, registrationDate);
        return m;
    }

 
}
