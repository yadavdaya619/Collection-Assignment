package com.ttn.Q4;

import java.util.Comparator;

public class ObjectComparator implements Comparator<Employee> {


    public int compare(Employee e1,Employee e2){
        if(e1.salary==e2.salary)
            return 0;
        else if(e1.salary>e2.salary)
            return 1;
        else
            return -1;
    }
}
