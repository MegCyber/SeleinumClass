package com.maggie.selenium.assignments;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;

@RunWith(JUnit4.class)
public class AssignmentMain {

    @Before
    public void setUp() {
//       System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\OneDrive\\Documents\\Development\\Intelij");
        System.setProperty("webdriver.chrome.driver", "C:/Users/pc/OneDrive/Documents/Development/Intelij/chromedriver.exe"
        );
    }
    @Test
    public void runBrowser(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.twitter.com");
    }
    @Test
    public  void runGreetings() {
        String name = "Richie";
        String greetings ="Happy Birthday";
        String wish = "Many Happy Returns";
        int cheers = 5;
        System.out.println(greetings + " " + name + "! " + wish + " "+  cheers + " Hearty Cheers!!!!!");
    }
    @Test
    public void greetArray(){
        String name = "Richie";
        String greetings ="Happy Birthday";
        String wish = "Many Happy Returns";
        ArrayList<String> theArrayGreeting = new ArrayList();
        theArrayGreeting.add(name);
        theArrayGreeting.add(greetings);
        theArrayGreeting.add(wish);

        System.out.println(theArrayGreeting);
        for (String i : theArrayGreeting){
            System.out.println(i);


        }




    }
    @Test
    public void oddNum() {
        int n = 10;
        //to print out the odd numbers
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i + "\n");


        }
    }
    @Test

    public void evenNum(){

            // to print out eve numbers
            for (int e = 2; e<=10; e+=2){
                System.out.println(e);
            }
        }
    @Test
    public void arrayNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("\n");
        for (int i = 0; i <= 9; i+=2){
            System.out.println("Index " + i + " = " + numbers.get(i) + " it is an odd number");}
        System.out.println("\n");
        for (int e = 1; e <= 9; e+=2) {
                System.out.println("Index " + e + " = " + numbers.get(e) + " it is an even number");
            }


        }






}




