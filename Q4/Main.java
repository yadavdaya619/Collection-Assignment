package com.ttn.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(22, 24000, "Mark"));
        emp.add(new Employee(23, 30000, "Rohan"));
        emp.add(new Employee(25, 28000, "Tony"));


        Collections.sort(emp, new ObjectComparator());
        System.out.println("Sorting by salary");

            for (Employee st : emp) {
                System.out.println(st.salary + " " + st.age + " " + st.name);
            }
    }
}
