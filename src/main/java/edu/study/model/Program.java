package edu.study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;
    private String name;
    private String desc;
    private int numOfHours;

    @Lob
    private Byte[] image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "program")
    private Set<Course> courses;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
