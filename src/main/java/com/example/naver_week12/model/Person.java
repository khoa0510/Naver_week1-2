package com.example.naver_week12.model;

public class Person {
    String Id;
    String Name;
    Integer Age;
    String Hobby;

    public Person(String Id, String Name, Integer Age, String Hobby) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Hobby = Hobby;
    }

    public Person(Person person) {
        this.Id = person.getId();
        this.Name = person.getName();
        this.Age = person.getAge();
        this.Hobby = person.getHobby();
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
