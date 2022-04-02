package dao;

import entity.Course;
import entity.Group;
import enums.Type_course;
import enums.Type_group;

public interface CourseDao {
    Course getCourseByTypeCourse(Type_course type_course);
}
