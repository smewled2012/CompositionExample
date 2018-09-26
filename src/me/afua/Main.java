package me.afua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person theParent = new Person();
        theParent.setName("Afua");

//        Adding children here
        Person childOne = new Person();
        childOne.setName("First Child");
        theParent.addAChild(childOne);

        Person childTwo = new Person();
        childTwo.setName("Second Child");
        theParent.addAChild(childTwo);

        Person childThree = new Person();
        childThree.setName("Third Child");
        theParent.addAChild(childThree);

        ArrayList <String> theirNames  = new ArrayList<>();
        for(Person eachChild: theParent.getMyChildren())
        {

            theirNames.add(eachChild.getName());
            System.out.println(theParent.getName()+"'s child is "+eachChild.getName());
        }

        Collections.sort(theirNames);
        System.out.println("Sorted Names:\n");
        for(String aName:theirNames)
        {
            System.out.println(aName);
        }







    }
}
