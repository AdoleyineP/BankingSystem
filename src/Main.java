public class Main {
    public static void main(String[] args) {
       Details client = new Details();
        System.out.println("\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDCBBWELCOME\uD83D\uDCBB\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C");

       client.insertInfo("Akolgo Prince Adoleyine", 743325935, 1000000000);
       client.checkInfo();
       client.withdraw(9435465);
       client.displayBalance();
       client.checkInfo();
       client.deposit(9435465);
       client.checkInfo();
       client.displayBalance();
    }
}