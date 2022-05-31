public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Thread firstTeam = new Thread(new Team("Real", game));
        Thread secondTeam = new Thread(new Team("Bars", game));
        firstTeam.start();
        secondTeam.start();
    }
    /*
    * Разница между потоком и процессом? Есть процесс и есть потоки внутри процесса.
    * Какие есть состояния потока? New -> Runnable -> Running-> Dead, waiting - sleeping;
    * Зачем isAlive()? Чекает поток в процессе или нет. Т.е работает или нет.
    * Зачем join()? Заставляет работать поток по очередно
    * Что будет если вызвать new MyThread().run() напрямую без вызова start()? Он просто обработает код внутри run() не создавая потокж
    * Можно ли запустить один поток дважды? пробовал нет
    * Что такое блок синхронизации? Синхронизированый блок кода может быть выполнен только одним потоком одновременно
     */
}
