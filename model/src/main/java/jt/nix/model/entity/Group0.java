package jt.nix.model.entity;

import java.util.Set;

public class Group0 implements Persistent {

    private Long id;
    private String groupName;
    private Set<Student> students;

    public Group0() {
    }

    public Group0(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
