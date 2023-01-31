package com.toavina.reactintegration.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity()
@Access(AccessType.FIELD)
public class Student {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue
    Integer id;
    @Column
    String name;
    @Column
    int age;


    
    public Student() {
    }

    public Integer getId() {
        return id;
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
