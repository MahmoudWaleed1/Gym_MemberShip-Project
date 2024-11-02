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
 * @author Mahmoud Waleed
 */
public class MemberDatabase extends Database{

    private ArrayList<Member> records;
    private String fileName;

    public MemberDatabase(String fileName) {
        super(fileName);
        
    }

  
    

    public Member createRecordFrom(String line) {
        String[] lineSeperate = line.split(",");
        String memberID = lineSeperate[0];
        String name = lineSeperate[1];
        String memberShipType = lineSeperate[2];
        String email = lineSeperate[3];
        String phoneNumber = lineSeperate[4];
        String status = lineSeperate[5];
        Member m = new Member(memberID, name, memberShipType, email, phoneNumber, status);
        return m;
    }

    
}
