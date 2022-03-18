import dBConn.DBconn;
import models.User;
import models.UserLogs;
import service.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DBconn.connection();
        UserService service = new UserService();
        service.addUserLogs(new User(1),"SUCCESS");
    }

}
