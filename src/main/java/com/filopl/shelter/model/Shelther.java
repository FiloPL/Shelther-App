package com.filopl.shelter.model;

public class Shelther {
    private int id;
    private String name;
    private AnimalEnun sex;
    private AnimalEnun breed;
    private int age;

    public Shelther(int id, String name, AnimalEnun sex, AnimalEnun breed, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.breed = breed;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalEnun getSex() {
        return sex;
    }

    public void setSex(AnimalEnun sex) {
        this.sex = sex;
    }

    public AnimalEnun getBreed() {
        return breed;
    }

    public void setBreed(AnimalEnun breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
