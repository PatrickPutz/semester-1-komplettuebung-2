package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    private HashMap<String, Integer> result;

    public CountryAnalyzer() {
        this.result = new HashMap<>();
    }

    @Override
    public void analyze() {

        for (Person person : persons) {
            if(result.containsKey(person.getCountry())){
                int amount = result.get(person.getCountry());
                amount++;
                result.put(person.getCountry(), amount);
            }
            else{
                result.put(person.getCountry(), 1);
            }
        }

        System.out.println(result.toString());
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "CountryAnalyzer{" +
                "result=" + result +
                '}';
    }
}
