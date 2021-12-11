public class Credit {
    private long id;
    private long sum;
    private String period;
    private double interestRate;
    public static long count;

    public Credit() {
        count++;
    }

    public Credit(long id, long sum, String period, double interestRate) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
    }
    public static void sum(Credit[] sumArr){
        int sumCredit = 0;
        int count = 0;
        for (int i = 0;i < sumArr.length;i++){
              sumCredit+= sumArr[i].sum;
              count ++;
        }
        System.out.println("Sum of credit:" + sumCredit + "\nAverage loan amount:" + sumCredit/count);
    }


    @Override
    public String toString() {
        return "Id:" + id + "\nCredits: " + sum + "\nPeriod: " + period + "\nInterest rate: " + interestRate + "%";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
