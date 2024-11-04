/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() throws FileNotFoundException {
        memberDatabase = new MemberDatabase(constants.FileNames.MEMBER_FILENAME);
        classDatabase = new ClassDatabase(constants.FileNames.CLASS_FILENAME);
        registrationDatabase = new MemberClassRegistrationDatabase(constants.FileNames.REGISTRATION_FILENAME);
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    public boolean addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member m = new Member(memberID, name, membershipType, email, phoneNumber, status);
        return memberDatabase.insertRecord(m);
    }

    public ArrayList<General> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public boolean addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        Class c = new Class(classID, className, trainerID, duration, maxParticipants);
        return classDatabase.insertRecord(c);
    }

    public ArrayList<General> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        if (!classDatabase.contains(classID)) {
            return false;
        }
        Class c = (Class) classDatabase.getRecord(classID);
        int maxParticipants = c.getAvailableSeats();
        if (maxParticipants > 0 && memberDatabase.contains(memberID)) {
            MemberClassRegistration m = new MemberClassRegistration(memberID, classID, "active", registrationDate);
            if (registrationDatabase.insertRecord(m)) {
                c.setAvailableSeats(maxParticipants - 1);
                return true;
            }
        }
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        MemberClassRegistration m = (MemberClassRegistration) registrationDatabase.getRecord(memberID + "-" + classID);
        if (m == null) {
            return false;
        }
        LocalDate date = m.getRegistrationDate();
        LocalDate currentDate = LocalDate.now();
        if (date.plusDays(3).isBefore(currentDate)) {
            return false;
        }
        Class c = (Class) classDatabase.getRecord(classID);
        c.setAvailableSeats(c.getAvailableSeats() + 1);
        m.setRegistrationStatus("cancelled");
        return true;
    }

    public ArrayList<General> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() throws IOException {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }

}
