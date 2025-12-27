package Java.state_pattern.VendingMachine.VendingMachineStates;

import Java.state_pattern.VendingMachine.VendingMachine;
import Java.state_pattern.VendingMachine.VendingMachineState;
import Java.state_pattern.VendingMachine.ItemUtils.Item;

/**
 * IdleState represents the initial state of the vending machine.
 * The machine is waiting for the user to select an item.
 * 
 * Transitions:
 * - selectItem() -> SelectedItemState
 * - insertCoin() -> Error (no item selected)
 * - dispenseItem() -> Error (no item selected)
 */
public class IdleState implements VendingMachineState {

    /**
     * Handles item selection in Idle state.
     * Transitions to SelectedItemState and prompts for payment.
     */
    @Override
    public void selectItem(VendingMachine context, Item item) {
        System.out.println("Selected the Item: " + context.getSelectedItem().getName());
        // Transition to SelectedItemState to wait for payment
        context.setVendingMachineState(new SelectedItemState());
        System.out.println("Please insert the amount: " + context.getSelectedItem().getPrice() + " cents");
    }

    /**
     * Rejects coin insertion when no item is selected.
     */
    @Override
    public void insertCoin(VendingMachine context, int amount) {
        System.out.println("Error: Cannot insert coins without selecting an item first.");
    }

    /**
     * Rejects dispensing when no item is selected and no payment made.
     */
    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Error: Please select an item and pay first.");
    }

    /**
     * Returns the state name.
     */
    @Override
    public String getStateName() {
        return "IdleState (waiting for item selection)";
    }
}
