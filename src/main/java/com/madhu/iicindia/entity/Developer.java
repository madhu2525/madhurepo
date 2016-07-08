package com.madhu.iicindia.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by madhu on 04/07/16.
 */


@Entity
public class Developer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;



    @ManyToMany
    private List<Skill> skills;

    public Developer() {
    }

    public Developer(String lastName, String firstName, String email, List<Skill> skills) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public boolean hasSkill(Skill skill) {
        for (Skill containedSkill: getSkills()) {
            if (containedSkill.getId() == skill.getId()) {
                return true;
            }
        }
        return false;
    }
}
