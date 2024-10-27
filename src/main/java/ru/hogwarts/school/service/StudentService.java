package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.*;

@Service
public class StudentService {
    private final Map<Long, Student> students = new HashMap<>();
    private long currentId = 1L;

    public Student createStudent(Student student) {
        student.setId(currentId++);
        students.put(student.getId(), student);
        return student;
    }

    public Student getStudent(Long id) {
        return students.get(id);
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public Student deleteStudent(Long id) {
        return students.remove(id);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Alice", 20));
        students.add(new Student(2L, "Bob", 25));
        students.add(new Student(3L, "Stef", 20));
        return students;
    }
}