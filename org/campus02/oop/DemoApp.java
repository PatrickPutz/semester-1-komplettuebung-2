package org.campus02.oop;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager personManager = new PersonManager();
		for(int i = 0; i < 100; i++){
			personManager.add(createTestPerson());
		}

		GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
		genderAnalyzer.setPersons(personManager.getPersons());
		genderAnalyzer.analyze();
		System.out.println("");

		CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
		countryAnalyzer.setPersons(personManager.getPersons());
		countryAnalyzer.analyze();
		System.out.println("");

		MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
		maxSalaryAnalyzer.setPersons(personManager.getPersons());
		maxSalaryAnalyzer.analyze();
		System.out.println("");

		BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
		bmiAnalyzer.setPersons(personManager.getPersons());
		bmiAnalyzer.analyze();
		System.out.println("");

		ArrayList<Pair<Person, Double>> result = bmiAnalyzer.getResult();
		for (Pair<Person, Double> personDoublePair : result) {
			System.out.println("Person: " + personDoublePair.getKey() + ", BMI: " + personDoublePair.getValue());
		}
	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "gr�n", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
