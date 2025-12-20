# State Pattern - Media Player Example

## Overview
This example demonstrates the State Pattern using a Media Player application. The player can be in three states: **Playing**, **Paused**, or **Stopped**. Each state defines different behavior for the play, pause, and stop actions. The player automatically changes its behavior when transitioning between states.

## Pattern Structure

### Components

1. **State Interface** (`State.java`) - State Interface
   - Defines the interface for all states
   - Declares methods that all concrete states must implement: `play()`, `pause()`, `stop()`, and `getStateName()`
   - Each method takes the MediaPlayer context as a parameter

2. **PlayingState Class** (`PlayingState.java`) - Concrete State
   - Represents the playing state
   - `play()`: Does nothing (already playing)
   - `pause()`: Transitions to PausedState
   - `stop()`: Transitions to StoppedState

3. **PausedState Class** (`PausedState.java`) - Concrete State
   - Represents the paused state
   - `play()`: Resumes playback and transitions to PlayingState
   - `pause()`: Does nothing (already paused)
   - `stop()`: Transitions to StoppedState

4. **StoppedState Class** (`StoppedState.java`) - Concrete State
   - Represents the stopped state
   - `play()`: Starts playback and transitions to PlayingState
   - `pause()`: Does nothing (cannot pause when stopped)
   - `stop()`: Does nothing (already stopped)

5. **MediaPlayer Class** (`MediaPlayer.java`) - Context
   - Maintains a reference to the current state
   - Delegates state-specific behavior to the current State object
   - Provides methods (`play()`, `pause()`, `stop()`) that delegate to the current state
   - Changes state by setting a new State object

6. **Client Class** (`Client.java`)
   - Creates a MediaPlayer instance
   - Demonstrates various state transitions
   - Shows how behavior changes based on the current state

## How to Run

1. Navigate to the MediaPlayer directory:
   ```bash
   cd Java/state_pattern/MediaPlayer
   ```

2. Compile all Java files:
   ```bash
   javac *.java
   ```

3. Run the Client class:
   ```bash
   java Client
   ```

## Expected Output

The program will:
1. Initialize a media player in the Stopped state
2. Demonstrate various state transitions (Stopped → Playing → Paused → Playing → Stopped)
3. Show how the same action (play, pause, stop) produces different results based on the current state
4. Demonstrate invalid operations (e.g., trying to pause when stopped)
5. Show how behavior changes automatically when state changes

## State Transitions

```
         ┌─────────────┐
         │   STOPPED   │
         └──────┬──────┘
                │ play()
                ▼
         ┌─────────────┐
         │   PLAYING   │
         └──────┬──────┘
         │      │      │
pause()  │      │      │ stop()
         │      │      │
         ▼      │      ▼
    ┌───────────┘  ┌─────────┐
    │   PAUSED     │ STOPPED │
    └──────┬───────┘         │
           │                 │
    play() │                 │
           │                 │
           ▼                 │
      ┌─────────┐            │
      │ PLAYING │────────────┘
      └─────────┘
```

## Key Benefits

- **Eliminates Conditionals**: No need for large if-else or switch-case statements based on state
- **Explicit State Transitions**: State changes are clear and explicit
- **Localized Behavior**: State-specific behavior is encapsulated in state classes
- **Easy to Extend**: Can add new states without modifying existing code
- **Single Responsibility**: Each state class has one responsibility
- **Open/Closed Principle**: Open for extension (new states), closed for modification
- **Maintainability**: Easier to understand and maintain state-specific logic

## Real-World Applications

- **Media Players**: Playing, paused, stopped, buffering states
- **Vending Machines**: Idle, has money, dispensing, out of stock states
- **Order Processing**: Pending, processing, shipped, delivered, cancelled states
- **Game Development**: Character states (idle, walking, running, jumping, attacking)
- **Traffic Lights**: Red, yellow, green states
- **Document Workflow**: Draft, review, approved, published, archived states
- **ATM Machines**: Idle, card inserted, PIN entered, transaction, error states
- **Network Connections**: Disconnected, connecting, connected, error states
- **Thread States**: New, runnable, blocked, waiting, terminated
- **User Interface**: Enabled, disabled, loading, error states

## Design Principles Demonstrated

1. **State Pattern**: Object behavior changes based on internal state
2. **Single Responsibility Principle**: Each state class has one responsibility
3. **Open/Closed Principle**: Open for extension (new states), closed for modification
4. **Encapsulation**: State-specific behavior is encapsulated in state classes
5. **Polymorphism**: Different states provide different implementations of the same interface

## Pattern Variations

1. **State with Context**: States receive context (MediaPlayer) to access shared data
2. **State Objects as Singletons**: If states don't have instance variables, they can be singletons
3. **State with Entry/Exit Actions**: States can have actions when entering or exiting
4. **Hierarchical States**: States can have parent-child relationships (e.g., PlayingState → PlayingMusicState, PlayingVideoState)
5. **State Tables**: Use tables to define state transitions instead of code

## Comparison with Other Patterns

- **vs Strategy Pattern**: 
  - State changes behavior based on internal state, Strategy swaps algorithms based on external choice
  - State transitions are automatic, Strategy selection is manual
  - State objects know about other states, Strategy objects are independent

- **vs Command Pattern**: 
  - State encapsulates behavior based on state, Command encapsulates requests as objects
  - State changes automatically, Command execution is explicit

- **vs Chain of Responsibility**: 
  - State changes behavior based on state, Chain routes requests through handlers
  - State transitions are explicit, Chain forwarding is automatic

## When to Use

Use the State Pattern when:
- An object's behavior depends on its state and it must change behavior at runtime
- You have many conditional statements that depend on the object's state
- You want to make state transitions explicit
- You need to add new states frequently
- State-specific behavior should be localized in separate classes

## Common Pitfalls

1. **State Explosion**: Too many states can make the system complex
2. **Circular Dependencies**: States knowing about each other can create tight coupling
3. **Shared State Data**: Need to carefully manage data shared between states
4. **State Transition Logic**: Should be clear and well-documented

