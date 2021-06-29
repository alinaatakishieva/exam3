package com.company;

public class Me {
    private String name;
    private int age;
    private String profession;
    private Clothes jeans;

    public Me(String name, int age, String profession, Clothes jeans) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.jeans = jeans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Clothes getJeans() {
        return jeans;
    }

    public void setJeans(Clothes jeans) {
        this.jeans = jeans;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + " мне " + age +
                " по професси я " + profession;

    }
}
