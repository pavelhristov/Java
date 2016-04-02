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
public class Person {

    String FirstName;
    String LastName;
    Integer Age;

    public Person() {
        this.FirstName = "Ivan";
        this.LastName = "Ivanov";
        this.Age = 20;
    }

    public Person(String FirstName, String LastName, Integer Age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Integer getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Name: " + FirstName + " " + LastName + ", Age: " + Age;
    }

}
