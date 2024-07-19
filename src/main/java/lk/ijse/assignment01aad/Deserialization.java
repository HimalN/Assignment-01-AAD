package lk.ijse.assignment01aad;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {

        File file = new File("Employee.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            /*reading the object*/
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println("Deserialized file" + employee);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
