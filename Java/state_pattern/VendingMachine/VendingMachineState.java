package Java.state_pattern.VendingMachine;

import Java.state_pattern.VendingMachine.ItemUtils.Item;

/**
 * VendingMachineState is the State interface in the State design pattern.
 * Each concrete state implements these operations with different behaviors
 * based on the current state of the vending machine.
 * 
 * States: IdleState -> SelectedItemState -> DispensingState -> IdleState
 */
public interface VendingMachineState {

    /**
     * Handles item selection based on current state.
     * 
     * @param context the vending machine context
     * @param item the item to select
     */
    void selectItem(VendingMachine context, Item item);

    /**
     * Handles coin insertion based on current state.
     * 
     * @param context the vending machine context
     * @param amount the amount in cents to insert
     */
    void insertCoin(VendingMachine context, int amount);

    /**
     * Handles item dispensing based on current state.
     * 
     * @param context the vending machine context
     */
    void dispenseItem(VendingMachine context);

    /**
     * Returns a human-readable name of the current state.
     * 
     * @return the state name
     */
    String getStateName();
}
