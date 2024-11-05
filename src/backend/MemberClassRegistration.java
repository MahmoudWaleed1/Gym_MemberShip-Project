/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class MemberClassRegistration implements General{

    private String memberID;
    private String classID;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberId, String classId, String status, LocalDate registrationDate) {
        this.memberID = memberId;
        this.classID = classId;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getClassID() {
        return classID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String getSearchKey() {
        return memberID + "-" + classID;
    }

    @Override
    public String lineRepresentation() {
        return memberID + "," + classID + "," + registrationDate + "," + status + "\n";
    }

    public void setRegistrationStatus(String status) {
        this.status = status;
    }
    @Override
     public int getAvailableSeats(){
        System.out.println("not used here");
        return 0;
    }
}
