package ru.alexandrUniversity.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alexandrUniversity.Entity.Course;
import ru.alexandrUniversity.Entity.Service.TestService;

@RestController()
public class BasicController {

    @Autowired
    private TestService testService;

    @GetMapping("/get")
    public Course getCourse() {
        return new Course();
    }

}
