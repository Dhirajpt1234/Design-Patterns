package Java.state_pattern.VendingMachine.VendingMachineStates;

import Java.state_pattern.VendingMachine.VendingMachine;
import Java.state_pattern.VendingMachine.VendingMachineState;
import Java.state_pattern.VendingMachine.ItemUtils.Item;

/**
 * DispensingState represents the state when the machine is dispensing the selected item.
 * Payment has been completed and the item is being delivered to the user.
 * 
 * Transitions:
 * - selectItem() -> Error (dispense current item first)
 * - insertCoin() -> Error (payment already done)
 * - dispenseItem() -> IdleState (after dispensing, return to idle)
 */
public class DispensingState implements VendingMachineState {

    /**
     * Rejects item selection during dispensing.
     * User must collect current item first.
     */
    @Override
    public void selectItem(VendingMachine context, Item item) {
        System.out.println("Error: Please collect the dispensed item before selecting a new item.");
    }

    /**
     * Rejects coin insertion during dispensing.
     * Payment has already been processed.
     */
    @Override
    public void insertCoin(VendingMachine context, int amount) {
        System.out.println("Error: Payment is already complete. Please collect your item.");
    }

    /**
     * Dispenses the selected item and transitions back to IdleState.
     * This completes the transaction cycle.
     * 
     * @param context the vending machine context
     */
    @Override
    public void dispenseItem(VendingMachine context) {
        Item item = context.getSelectedItem();
        System.out.println("Dispensing item: " + item.getName());
        // Transition back to IdleState - ready for next transaction
        context.setVendingMachineState(new IdleState());
        System.out.println("Item dispensed successfully. Please collect your " + item.getName() + ".");
    }

    /**
     * Returns the state name.
     */
    @Override
    public String getStateName() {
        return "DispensingState (dispensing item)";
    }
}
