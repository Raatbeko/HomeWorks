import dao.BaseDao;
import dao.impls.*;
import entity.Course;
import entity.Group;
import enums.Type_course;
import enums.Type_group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static final CourseImpl course = new CourseImpl();
    static final GroupImpl group = new GroupImpl();
    static final BaseDao mentor = new MentorImpl();
    static final BaseDao person = new PersonImpl();
    static final BaseDao student = new StudentImpl();

    public static void main(String[] args) {
        Group group1 = Group.builder().
                type_group(Type_group.JV_F21).
                build();

        Group group2 = Group.builder().
                type_group(Type_group.JV_W22).
                build();


        Group group3 = Group.builder().
                type_group(Type_group.FR_F21).
                build();

        Group group4 = Group.builder().
                type_group(Type_group.FR_W22).
                build();

        Course courseFrontEnd = Course.builder().
                groups(Arrays.asList(group1, group2)).
                type_course(Type_course.FRONTEND).
                build();


        Course courseByTypeCourse = course.getCourseByTypeCourse(Type_course.JAVA_DEVELOPER);
        Course courseJava = Course.builder()
                .id(courseByTypeCourse== null ? null : courseByTypeCourse.getId())
                .type_course(Type_course.JAVA_DEVELOPER).groups(Arrays.asList(group1, group2,group3))
                .build();



        group.insert(group1);
        group.insert(group2);
        group.insert(group3);
        group.insert(group4);

        course.insert(courseFrontEnd);
        Course course1 = course.getCourseByTypeCourse(Type_course.JAVA_DEVELOPER);
        course1.setGroups(Arrays.asList(group.getGroupById(4L)));

        course.update(course1);

        if(courseJava.getId() == null) course.insert(courseJava);
        else course.update(courseJava);

    }

}
