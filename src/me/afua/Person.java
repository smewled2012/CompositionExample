package me.afua;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;

    HashSet<Person> myChildren;

    public Person() {
        this.myChildren = new HashSet<>();
    }

    public HashSet<Person> getMyChildren() {
        return myChildren;
    }

    public void setMyChildren(HashSet<Person> myChildren) {
        this.myChildren = myChildren;
    }

    public void addAChild(Person aChild)
    {
        this.myChildren.add(aChild);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
