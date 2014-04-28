package jt.nix.model.entity;


public class Progress implements Persistent{
    private Long id;
    private Student student;
    private SubSem subSem;
    private Integer progressMark;

    public Progress() {
    }

    public Progress(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getProgressMark() {
        return progressMark;
    }

    public void setProgressMark(Integer progressMark) {
        this.progressMark = progressMark;
    }

    public SubSem getSubSem() {
        return subSem;
    }

    public void setSubSem(SubSem subSem) {
        this.subSem = subSem;
    }
}
