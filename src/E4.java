public class E4 {
    private double  totalBalance;

    public E4(){
        totalBalance = 0;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getTotalBalance(int year) {
        totalBalance = totalBalance + totalBalance * 0.05 * year;
        return totalBalance;
    }
}
