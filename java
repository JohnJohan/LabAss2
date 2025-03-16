public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Soda"); // Item selected
        vendingMachine.insertCoin(2);      // Coin inserted
        vendingMachine.dispenseItem();     // Dispensing item

        vendingMachine.setOutOfOrder();    // Set out of order
        vendingMachine.selectItem("Chips"); // No operations allowed
    }
}
