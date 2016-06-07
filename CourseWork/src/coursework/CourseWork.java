/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Princa
 */
public class CourseWork {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        ArrayList<Student> List1 = new ArrayList<>();   //StudentList /console app only
        int count = 5;
        
        /*InsertStudent form1 = new InsertStudent();  //calling GUI / no longer needed
        form1.setVisible(true);*/

        for (int i = 0; i < count; i++) {
            Student s = new Student(12340001+i);  // testing StudentList/console app only
            List1.add(s);
        }

        String file_name = "Students.txt";   //asaign text file /console app only
        new PrintWriter(file_name).close();

        try {
            FileWrite data = new FileWrite(file_name, true);    //write in file /console app only
            for (Object item : List1) {
                data.writeToFile(item.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileRead file = new FileRead(file_name);   //read in file / console app only
            String[] aryLines = file.OpenFile();

            for (String aryLine : aryLines) {
                System.out.println(aryLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
