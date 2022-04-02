package dao.impls;

import dao.BaseDao;
import dao.CourseDao;
import entity.Course;
import entity.Group;
import enums.Type_course;
import enums.Type_group;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

public class CourseImpl extends BaseDao implements CourseDao {
    private static final Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();

    @Override
    public Course getCourseByTypeCourse(Type_course type_course){
        try {
            session.beginTransaction();
            Long id  =  session.createSQLQuery(String.format("SELECT id FROM courses WHERE type_course= '%s'", type_course.name()));
            session.getTransaction().commit();
            session.close();
            return course;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
