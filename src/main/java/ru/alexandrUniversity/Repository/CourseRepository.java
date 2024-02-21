package ru.alexandrUniversity.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrUniversity.Entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
