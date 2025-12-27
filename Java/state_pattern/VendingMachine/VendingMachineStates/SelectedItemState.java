package Java.state_pattern.VendingMachine.VendingMachineStates;

import Java.state_pattern.VendingMachine.VendingMachine;
import Java.state_pattern.VendingMachine.VendingMachineState;
import Java.state_pattern.VendingMachine.ItemUtils.Item;

/**
 * SelectedItemState represents the state after an item has been selected.
 * The machine is now waiting for the user to insert sufficient payment.
 * 
 * Transitions:
 * - selectItem() -> Error (item already selected)
 * - insertCoin() -> DispensingState (if sufficient payment) or stay in this state
 * - dispenseItem() -> Error (payment not complete)
 */
public class SelectedItemState implements VendingMachineState {

    /**
     * Rejects item selection when an item is already selected.
     * User must complete current transaction first.
     */
    @Override
    public void selectItem(VendingMachine context, Item item) {
        System.out.println("Error: Item already selected. Please complete payment first.");
    }

    /**
     * Processes coin insertion and validates payment amount.
     * Transitions to DispensingState if payment is sufficient.
     * 
     * @param context the vending machine context
     * @param amount the amount in cents inserted
     */
    @Override
    public void insertCoin(VendingMachine context, int amount) {
        Item selectedItem = context.getSelectedItem();
        System.out.println("Processing payment for: " + selectedItem.getName() + 
                         " (Price: " + selectedItem.getPrice() + " cents, Inserted: " + amount + " cents)");
        
        // Check if payment is sufficient
        if (amount >= selectedItem.getPrice()) {
            // Transition to DispensingState - payment complete
            context.setVendingMachineState(new DispensingState());
            int change = amount - selectedItem.getPrice();
            if (change > 0) {
                System.out.println("Payment successful! Change: " + change + " cents. Ready to dispense.");
            } else {
                System.out.println("Payment successful! Ready to dispense.");
            }
        } else {
            // Insufficient payment - remain in SelectedItemState
            int remaining = selectedItem.getPrice() - amount;
            System.out.println("Insufficient payment. Please insert " + remaining + " more cents.");
        }
    }

    /**
     * Rejects dispensing when payment is not complete.
     */
    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Error: Cannot dispense. Payment is incomplete. Please insert coins.");
    }

    /**
     * Returns the state name.
     */
    @Override
    public String getStateName() {
        return "SelectedItemState (waiting for payment)";
    }
}
