package edu.study.model;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String name;
    private String desc;
    private int nomOfCredit;

    @OneToOne(fetch = FetchType.EAGER)
    private Semster semster;

    @ManyToOne
    private Program program;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
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

    public int getNomOfCredit() {
        return nomOfCredit;
    }

    public void setNomOfCredit(int nomOfCredit) {
        this.nomOfCredit = nomOfCredit;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Semster getSemster() {
        return semster;
    }

    public void setSemster(Semster semster) {
        this.semster = semster;
    }
}
