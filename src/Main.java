import dBConn.DBconn;
import dao.impl.UserLogsDaoImpl;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        DBconn.connection();
        UserLogsDaoImpl userLogsDao = new UserLogsDaoImpl();
        System.out.println(userLogsDao.countLog(4L));
    }

}
