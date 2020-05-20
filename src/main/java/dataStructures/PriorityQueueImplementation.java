package dataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * This class implements PriorityQueue data structure for a custom class
 */
public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>(new PersonComparator());

        queue.add(new Person("Vinay", "Mehta", 25));
        queue.add(new Person("Vishal", "Mehta", 28));
        queue.add(new Person("Charmy", "Shah", 26));

        System.out.println(queue.peek().getFirstname());
    }
}

class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge())
            return 1;
        else if (p2.getAge() > p1.getAge())
            return -1;

        return 0;
    }
}

class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person (String firstname, String lastname, int age) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setAge(age);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}