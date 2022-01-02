package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{

    private ArrayList<Pair<Person, Double>> result;

    public BMIAnalyzer() {
        result = new ArrayList<>();
    }

    @Override
    public void analyze() {
        for (Person person : persons) {
            System.out.println(person.toString() + ", BMI: " + calcBMI(person));
            Pair calced = new Pair(person, calcBMI(person));
            result.add(calced);
        }
    }

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p){
        double bmi = (double) p.getWeight() / (((double) p.getSize() / 100) * ((double) p.getSize() / 100));
        return bmi;
    }
}
