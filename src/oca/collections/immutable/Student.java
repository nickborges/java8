package oca.collections.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return Collections.unmodifiableList(this.courses);
    }

    public void add(Course course){
        this.courses.add(course);
    }

}
