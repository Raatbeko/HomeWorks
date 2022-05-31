public class TreadLearn implements Runnable {

    String figure;
    static Integer num = 4;

    public TreadLearn(String figure) {
        this.figure = figure;
    }

    public TreadLearn() {
    }

    @Override
    public void run() {
        if (figure.equals("*")){
            num = num * 2;

        } else if (figure.equals("/")){
            num = num / 2;

        } else if (figure.equals("-")){
            num = num - 2;

        }else {
            num = num + 2;

        }
        System.out.println(num);
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
