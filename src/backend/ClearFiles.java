/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileWriter;
import java.io.IOException;

public class ClearFiles {
    public static void main(String[] args) {
        clearFile("Trainers.txt");
        clearFile("Class.txt");
        clearFile("Members.txt");
        clearFile("Registration.txt");
    }

    private static void clearFile(String fileName) {
        try {
            try (FileWriter writer = new FileWriter(fileName, false) // 'false' to overwrite
            ) {
                writer.write(""); // Clear the file
            } // Clear the file
            System.out.println("Cleared file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while clearing " + fileName);
        }
    }
}

