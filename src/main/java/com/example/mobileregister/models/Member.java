package com.example.mobileregister.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String tel;
    private String referececode;
    private Double salary;

    public Member() {
    }

    public Member(String firstname, String lastname, String birthdate, String tel, String referececode, Double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.tel = tel;
        this.referececode = referececode;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setId(String id) {
        this.id = id;
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


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getReferececode() {
        return referececode;
    }

    public void setReferececode(String referececode) {
        this.referececode = referececode;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
