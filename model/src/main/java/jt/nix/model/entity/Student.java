package jt.nix.model.entity;
import java.util.Date;

public class Student implements Persistent {
    private Long id;
    private String studentName;
    private String studentSurname;
    private Date studentDateOfRegistration;
    private Group0 group;


    public Student(Long studentCardNumber) {
        this.id = studentCardNumber;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Date getStudentDateOfRegistration() {
        return studentDateOfRegistration;
    }

    public void setStudentDateOfRegistration(Date studentDateOfRegistration) {
        this.studentDateOfRegistration = studentDateOfRegistration;
    }

    public Group0 getGroup() {
        return group;
    }

    public void setGroup(Group0 group) {
        this.group = group;
    }
}
