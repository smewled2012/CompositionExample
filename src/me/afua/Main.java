package me.afua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Person theParent = new Person();
        System.out.println("please Enter the name of your parent !");
        String pName = input.nextLine();
        theParent.setName(pName);

//        Adding children here
        System.out.println("Please enter the names of your children !");
        Person childOne = new Person();

        System.out.println("Enter the name of your children !");
        String childName = input.nextLine();
        childOne.setName(childName);
        theParent.addAChild(childOne);
        boolean check=true;

        while(check) {

            System.out.println("IF you have more children press write yes  else press any key from the keyboard !");
            String meCheck = input.nextLine();
            if(meCheck.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name of the other children !");
                Person childTwo = new Person();
                String children=input.nextLine();
                childTwo.setName(children);
                theParent.addAChild(childTwo);
            }
            else{
                System.out.println("Thank you for entering the name's of your children !");
                check =false;
            }

        }

        ArrayList <String> theirNames  = new ArrayList<String>();

        System.out.println("The number of children you have entered for"+ theParent.getName() +" is "+theParent.getMyChildren().size() );
        // experience.getDuties()

        for(Person eachChild: theParent.getMyChildren())
        {

            theirNames.add(eachChild.getName());
            System.out.println(theParent.getName()+"'s child is "+eachChild.getName());
        }

        Collections.sort(theirNames);
        System.out.println("Sorted Names :\n");
        for(String aName:theirNames)
        {
            System.out.println(aName);
        }







    }
}
