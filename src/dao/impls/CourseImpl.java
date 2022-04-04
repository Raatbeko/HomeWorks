package dao.impls;

import dao.BaseDao;
import dao.CourseDao;
import entity.Course;
import entity.Group;
import enums.Type_course;
import enums.Type_group;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public class CourseImpl extends BaseDao implements CourseDao {

    @Override
    public Course getCourseByTypeCourse(Type_course type_course){
        try {
            Session session = HibernateSessionFactoryUtils.buildSessionFactory().openSession();
            session.beginTransaction();
            List<Course> id  =  session.createQuery("from entity.Course c where c.type_course = :type_courses",Course.class).setParameter("type_courses",type_course).list();
            session.getTransaction().commit();
            session.close();
            for (Course course : id) {
                if (course.getType_course().equals(type_course)){
                    return course;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
