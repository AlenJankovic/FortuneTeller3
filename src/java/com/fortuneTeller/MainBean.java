/*
 * 
 * 
 * 
 */
package com.fortuneTeller;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alenj
 */
@Named(value = "mainBean")
@RequestScoped
public class MainBean {
        
    private String name;
    private String lastName;
    private String nationality;
    private String etnicity;
    private Date dob;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

   
    public String getEtnicity() {
        return etnicity;
    }

    public void setEtnicity(String etnicity) {
        this.etnicity = etnicity;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public MainBean() {
        
       
    }

   
    
}
