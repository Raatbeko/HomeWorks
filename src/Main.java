import Management.ITAcademyManagement;

import menu.Menu;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new ITAcademyManagement(new ArrayList<>(),new ArrayList<>()));
        menu.collectAllMenu();
    }
}
