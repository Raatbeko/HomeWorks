package front;

import exceptons.FieldEmptyException;
import models.UserModel;
import service.impl.LogsAndRegistrationImpl;
import service.impl.UserLogsServiceImpl;
import service.impl.UserServiceImpl;

import java.util.Scanner;

public class Menu {
    public static final LogsAndRegistrationImpl logsAndRegistr = new LogsAndRegistrationImpl();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Registration-> 1" +
                "\nLogin-> 2" +
                "\nExit-> 0");
        System.out.print("-> ");
        int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.print("username-> ");
                    String name = scanner.next();
                    System.out.print("email-> ");
                    String mail = scanner.next();
                    System.out.print("password-> ");
                    String password = scanner.next();
                    UserModel user = new UserModel(name, mail, password);
                    try {
                        if (logsAndRegistr.addUserAndLogs(user)){
                            System.out.println("You are added!!!");
                        }
                    } catch (FieldEmptyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("username-> ");
                    String userName = scanner.next();
                    System.out.print("password-> ");
                    String passwords = scanner.next();
                    try {
                        System.out.println(logsAndRegistr.logsUser(userName, passwords));
                    } catch (FieldEmptyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    if (num == 0) {
                        return;
                    }
            }
        }

    }

}
