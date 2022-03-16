import dBase.TrainersConn;
package task_B;

public class Main {
    public static void main(String[] args) {
        TrainersConn trainersConn = new TrainersConn();
        System.out.println(trainersConn.getAllTrainer());
    }
}
