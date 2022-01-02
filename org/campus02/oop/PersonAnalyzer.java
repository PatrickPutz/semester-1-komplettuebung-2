package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {

    // switched to protected for genderanalyzer methods
    protected ArrayList<Person> persons;

    public PersonAnalyzer(){

    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public abstract void analyze();
}
