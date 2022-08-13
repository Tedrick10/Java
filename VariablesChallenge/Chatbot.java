package VariablesChallenge;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String place = scanner.nextLine();

        System.out.println("I hear it's beautiful at " + place + "! I'm from a place called Oracle.");
        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("So you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");

        System.out.println("Enough about me. What's your favorite language? (just don't say Python)");
        String favoriteLanguage = scanner.nextLine();

        System.out.println(favoriteLanguage + ", fair enough! How many years have you been coding in " + favoriteLanguage);
        int codingExperienceYears = Integer.parseInt(scanner.nextLine());

        System.out.println(codingExperienceYears + " years eh? That's great, keep it up!");
        System.out.println("Nice chatting with you " + name + ". I have to log off now. See ya!");
    }
}
