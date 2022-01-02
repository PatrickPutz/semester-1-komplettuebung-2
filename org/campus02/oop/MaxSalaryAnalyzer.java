package org.campus02.oop;

public class MaxSalaryAnalyzer extends PersonAnalyzer{

    public MaxSalaryAnalyzer() {
    }

    @Override
    public void analyze() {

        int value = 0;

        for (Person person : persons) {
            if(person.getSalary() > value){
                value = person.getSalary();
            }
        }

        System.out.println("Höchstes Gehalt: " + value);
        System.out.println("Personen mit dem höchsten Gehalt: ");

        for (Person person : persons) {
            if(person.getSalary() == value){
                System.out.println(person.toString());
            }
        }

    }
}
