package jt.nix.model.entity;


public class SubSem implements Persistent {
    private Long id;
    private Subject subject;
    private Semester semester;

    public SubSem(Long id) {
        this.id = id;
    }

    public SubSem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
