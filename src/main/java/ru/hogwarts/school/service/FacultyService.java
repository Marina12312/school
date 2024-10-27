package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FacultyService {
    private final Map<Long, Faculty> faculties = new HashMap<>();
    private long currentId = 1L;

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(currentId++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty getFaculty(Long id) {
        return faculties.get(id);
    }

    public Faculty updateFaculty(Long id, Faculty faculty) {
        faculty.setId(id);
        faculties.put(id, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(Long id) {
        return faculties.remove(id);
    }

    public List<Faculty> getAllFaculties() {
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty(1L, "Mathematics", "red"));
        faculties.add(new Faculty(2L, "Science", "blue"));
        faculties.add(new Faculty(3L, "Arts", "green"));

        return faculties;
    }
}
