package ru.alexandrUniversity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrUniversity.Entity.Course;
import ru.alexandrUniversity.Repository.CourseRepository;

import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private CourseRepository repository;

    public TestService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public Optional<Course> getCourse() {
        return repository.findById(1);
    }
}
