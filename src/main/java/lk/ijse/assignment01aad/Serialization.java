package lk.ijse.assignment01aad;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {

        Employee employee = new Employee("E001","Himal","Avissawella");

        File file = new File("Employee.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);

            System.out.println("Object has been Serialized");

            // Print the absolute path of the file
            System.out.println("Serialized file location: " + new File("Employee.ser").getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
