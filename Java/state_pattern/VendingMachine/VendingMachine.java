package Java.state_pattern.VendingMachine;

import Java.state_pattern.VendingMachine.ItemUtils.Item;
import Java.state_pattern.VendingMachine.VendingMachineStates.IdleState;

/**
 * VendingMachine is the context class in the State design pattern.
 * It manages the current state and delegates operations to the state implementation.
 * This design allows behavior to change dynamically based on the machine's state.
 */
public class VendingMachine {
    // Current state of the vending machine (uses State pattern)
    private VendingMachineState currentMachineState;
    // Currently selected item for purchase
    private Item selectedItem;

    /**
     * Initializes the vending machine with a default item and Idle state.
     * 
     * @param item the initial item to be available (must not be null)
     * @throws IllegalArgumentException if item is null
     */
    public VendingMachine(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Initial item cannot be null");
        }
        this.selectedItem = item;
        // Start in Idle state - machine is ready to accept item selection
        this.currentMachineState = new IdleState();
    }

    /**
     * Gets the currently selected item.
     * 
     * @return the selected item
     */
    public Item getSelectedItem() {
        return this.selectedItem;
    }

    /**
     * Sets a new item for purchase.
     * 
     * @param item the item to select (must not be null)
     * @throws IllegalArgumentException if item is null
     */
    public void setSelectedItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Selected item cannot be null");
        }
        this.selectedItem = item;
    }

    /**
     * Gets the current state of the vending machine.
     * 
     * @return the current VendingMachineState implementation
     */
    public VendingMachineState getVendingMachineState() {
        return this.currentMachineState;
    }

    /**
     * Transitions the machine to a new state.
     * This is called by state implementations to change behavior.
     * 
     * @param state the new state to transition to (must not be null)
     * @throws IllegalArgumentException if state is null
     */
    public void setVendingMachineState(VendingMachineState state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        this.currentMachineState = state;
    }

    /**
     * Delegates item selection to the current state.
     * Behavior depends on the current state (Idle, SelectedItem, etc.)
     */
    public void selectItem() {
        this.currentMachineState.selectItem(this, selectedItem);
    }

    /**
     * Delegates coin insertion to the current state.
     * Validates the amount before delegating.
     * 
     * @param amount the amount in cents to insert (must be positive)
     * @throws IllegalArgumentException if amount is non-positive
     */
    public void insertCoin(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Coin amount must be positive");
        }
        this.currentMachineState.insertCoin(this, amount);
    }

    /**
     * Delegates item dispensing to the current state.
     * Behavior depends on whether payment is complete.
     */
    public void dispenseItems() {
        this.currentMachineState.dispenseItem(this);
    }

    /**
     * Displays the current status of the vending machine.
     * Shows the selected item and current state.
     */
    public void displayStatus() {
        System.out.println();
        System.out.println(" ****  Vending machine status **** ");
        System.out.println("Item name: " + this.getSelectedItem().getName());
        System.out.println("Item price: " + this.getSelectedItem().getPrice() + " cents");
        System.out.println("State: " + this.currentMachineState.getStateName());
        System.out.println();
    }
}
