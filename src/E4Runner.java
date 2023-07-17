public class E4Runner {
    public static void main(String[] args) {

        E4 totalBalance = new E4();

        totalBalance.setTotalBalance(1000);
        System.out.println("Total Balance after 1 Year: "+totalBalance.getTotalBalance(1));

        totalBalance.setTotalBalance(1000);
        System.out.println("Total Balance after 1 Year: "+totalBalance.getTotalBalance(2));

        totalBalance.setTotalBalance(1000);
        System.out.println("Total Balance after 1 Year: "+totalBalance.getTotalBalance(3));
    }
}
