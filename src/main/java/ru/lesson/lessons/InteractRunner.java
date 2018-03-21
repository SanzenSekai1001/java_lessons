package ru.lesson.lessons;
import java.util.Scanner;
/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/

public class InteractRunner{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Enter znak: ");
				String znak = reader.next();
				if(znak.equals("+")){
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
				} else if(znak.equals("-")){
					calc.razn(Integer.valueOf(first), Integer.valueOf(second));
				} else System.out.println("No result");
				
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}