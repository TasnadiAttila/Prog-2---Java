package feladatok;

import java.util.ArrayList;

public class Hero  {
    private String name;
    private int Age;
    private String gender;
    private ArrayList<String> skills;

    public Hero(String name, int age, String gender, ArrayList<String> skills) {
        this.name = name;
        Age = age;
        this.gender = gender;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }



}
