package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer{

    public GenderAnalyzer() {
    }

    @Override
    public void analyze() {
        int count_m = 0;
        int size_m = 0;
        int count_f = 0;
        int size_f = 0;

        for (Person person : persons) {
            if(person.getGender() == 'M'){
                size_m += person.getSize();
                count_m++;
            }
            if(person.getGender() == 'F'){
                size_f += person.getSize();
                count_f++;
            }
        }

        System.out.println("In der Liste existieren " + count_m + " Männer mit einer durchschnittlichen Körpergröße von " + (size_m / count_m) + " cm.");
        System.out.println("In der Liste existieren " + count_f + " Frauen mit einer durchschnittlichen Körpergröße von " + (size_f / count_f) + " cm.");
    }
}
