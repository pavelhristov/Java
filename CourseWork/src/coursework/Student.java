/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author Princa
 */
public class Student extends Person {

    long FNumber;
    int Kurs;

    public Student() {
        this.FNumber = 500;
        this.Kurs = 1;
    }

    public Student(long FNumber, int Kurs, String FirstName, String LastName, Integer Age) {
        super(FirstName, LastName, Age);
        this.FNumber = FNumber;
        this.Kurs = Kurs;
    }

    public Student(long FNumber) {
        this.FNumber = FNumber;
        this.Kurs = 1;
    }

    public long getFNumber() {
        return FNumber;
    }

    public int getKurs() {
        return Kurs;
    }

    @Override
    public String toString() {
        return super.toString() + ", FNumber: " + FNumber + ", Kurs: " + Kurs;
    }

    public String getName() {
        return super.FirstName + "_" + super.LastName;
    }
}
