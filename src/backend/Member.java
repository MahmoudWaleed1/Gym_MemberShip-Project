/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Mahmoud Waleed
 */
public class Member implements General{

    private String memberID;
    private String name;
    private String membershipType;
    private String email;
    private String phoneNumber;
    private String status;

    public Member(String memberID, String name, String memberShipType, String email, String phoneNumber, String status) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = memberShipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String lineRepresentation() {
        return memberID + "," + name + "," + membershipType + "," + email + "," + phoneNumber + "," + status + "\n";
    }

    public String getSearchKey() {
        return memberID;
    }
    
    public int getAvailableSeats(){
        System.out.println("not used here");
        return 0;
    }
    
}
