package Java.state_pattern.VendingMachine.VendingMachineStates;

import Java.state_pattern.VendingMachine.VendingMachine;
import Java.state_pattern.VendingMachine.VendingMachineState;
import Java.state_pattern.VendingMachine.ItemUtils.Item;

/**
 * HasMoneyState represents the state when sufficient payment has been received.
 * NOTE: This state is currently unused in the workflow. The SelectedItemState
 * transitions directly to DispensingState when payment is sufficient.
 * 
 * This state could be used in future enhancements for:
 * - Allowing users to add more items to their order
 * - Handling multiple item selections with accumulated payment
 * - Implementing a cart-based vending system
 * 
 * Current Transitions (if used):
 * - selectItem() -> Error (collect items first)
 * - insertCoin() -> Error (payment already done)
 * - dispenseItem() -> DispensingState
 */
public class HasMoneyState implements VendingMachineState {

    /**
     * Rejects item selection when payment is already done.
     * User must collect current items first.
     */
    @Override
    public void selectItem(VendingMachine context, Item item) {
        System.out.println("Error: Items are already selected. Please collect them first before selecting another item.");
    }

    /**
     * Rejects additional coin insertion when payment is already complete.
     */
    @Override
    public void insertCoin(VendingMachine context, int amount) {
        System.out.println("Error: Payment is already complete. Please collect your items.");
    }

    /**
     * Transitions to DispensingState to dispense the selected items.
     * 
     * @param context the vending machine context
     */
    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Transaction complete. Processing dispensing...");
        context.setVendingMachineState(new DispensingState());
    }

    /**
     * Returns the state name.
     */
    @Override
    public String getStateName() {
        return "HasMoneyState (payment complete, ready to dispense)";
    }
}
