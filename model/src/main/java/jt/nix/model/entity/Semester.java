package jt.nix.model.entity;


import java.util.Set;

public class Semester implements Persistent {
    private Long id;
    private Integer semesterWeeks;
    private Set<Subject> subjects;


    public Semester() {

    }

    public Semester(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSemesterWeeks() {
        return semesterWeeks;
    }

    public void setSemesterWeeks(Integer semesterWeeks) {
        this.semesterWeeks = semesterWeeks;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
