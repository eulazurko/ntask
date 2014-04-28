package jt.nix.model.entity;


import java.util.Set;

public class Subject implements Persistent {
    private Long id;
    private String subjectName;
    private Set<Semester> semesters;

    public Subject() {
    }

    public Subject(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long subjectId) {
        this.id = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Set<Semester> getSemesters() {
        return semesters;
    }

    public void setSemesters(Set<Semester> semesters) {
        this.semesters = semesters;
    }
}
