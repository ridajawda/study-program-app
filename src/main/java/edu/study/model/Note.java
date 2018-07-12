package edu.study.model;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private Program program;

   @Lob
    private String programNotes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getProgramNotes() {
        return programNotes;
    }

    public void setProgramNotes(String programNotes) {
        this.programNotes = programNotes;
    }
}
