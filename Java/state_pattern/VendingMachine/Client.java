package Java.state_pattern.VendingMachine;

import Java.state_pattern.VendingMachine.ItemUtils.Item;

public class Client {
    public static void main(String[] args) {
        Item chocolate = new Item("chocolate", 99);
        VendingMachine machine = new VendingMachine(chocolate);

        machine.displayStatus();

        System.out.println("select ------------- > ");
        machine.selectItem();
        machine.displayStatus();

        System.out.println("try dispense without pay ------> ");
        machine.dispenseItems();
        machine.displayStatus();

        System.out.println("Pay less------->");
        machine.insertCoin(90);
        machine.displayStatus();

        System.out.println("Pay Proper ----> ");
        machine.insertCoin(150);
        machine.displayStatus();

        System.out.println("dispense ------> ");
        machine.dispenseItems();
        machine.displayStatus();

    }
}
