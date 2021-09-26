package com.ttn.Q5;

class Student{
    String name;
    double score;
    double age;
    public Student(String name, double score, double age) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString(){

        return score+":"+name+": "+age;
    }
}
