# Observer Pattern - Class Hierarchy & Relationships

## Class Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                         OBSERVER PATTERN                        │
└─────────────────────────────────────────────────────────────────┘

┌─────────────────────┐         ┌─────────────────────┐
│   Subject (I/F)     │         │   Observer (I/F)    │
├─────────────────────┤         ├─────────────────────┤
│ + subscribe()       │         │ + notify()          │
│ + unsubscribe()     │         │   (storeName,       │
│ + notifyObservers() │         │    discount)        │
└──────────┬──────────┘         └──────────┬──────────┘
           │                               │
           │ implements                    │ implements
           │                               │
           ▼                               ▼
┌─────────────────────┐         ┌─────────────────────┐
│      Store          │         │      Shopper        │
│  (Concrete Subject) │         │ (Concrete Observer) │
├─────────────────────┤         ├─────────────────────┤
│ - name: String      │         │ - name: String      │
│ - observers: List   │         ├─────────────────────┤
├─────────────────────┤         │ + getName()         │
│ + getName()         │         │ + notify()          │
│ + subscribe()       │         └─────────────────────┘
│ + unsubscribe()     │
│ + notifyObservers() │         ┌─────────────────────┐
│ + sale()            │         │       Mall          │
└─────────────────────┘         │ (Concrete Observer) │
                                ├─────────────────────┤
                                │ - sales: List       │
                                ├─────────────────────┤
                                │ + notify()          │
                                │ + getSales()        │
                                │ + printSales()      │
                                │                     │
                                │ + SaleRecord        │
                                │   (Inner Class)     │
                                └─────────────────────┘
```

## Relationship Flow

```
                    ┌─────────────┐
                    │   Client    │
                    │  (Driver)   │
                    └──────┬──────┘
                           │
                           │ creates & manages
                           │
        ┌──────────────────┴──────────────────┐
        │                                     │
        ▼                                     ▼
┌───────────────┐                    ┌───────────────┐
│    Store     │                    │   Observer    │
│  (Subject)   │◄─── subscribes ────│  (Shopper/    │
│              │                    │    Mall)      │
│              │                    │               │
│              │─── notifies ──────►│               │
│              │    (on sale)       │               │
└──────────────┘                    └───────────────┘
```

## Component Hierarchy

```
Observer Pattern Example
│
├── Interfaces (Contracts)
│   ├── Subject
│   │   └── Defines: subscribe(), unsubscribe(), notifyObservers()
│   │
│   └── Observer
│       └── Defines: notify(storeName, discount)
│
├── Concrete Subjects
│   └── Store
│       ├── Maintains: List<Observer> observers
│       ├── Implements: Subject interface
│       └── Behavior: Notifies all observers when sale() is called
│
├── Concrete Observers
│   ├── Shopper
│   │   ├── Implements: Observer interface
│   │   ├── Maintains: String name
│   │   └── Behavior: Prints notification message when notified
│   │
│   └── Mall
│       ├── Implements: Observer interface
│       ├── Maintains: List<SaleRecord> sales
│       ├── Behavior: Records sale information when notified
│       └── Inner Class: SaleRecord
│           └── Stores: storeName, discount
│
└── Client
    └── Demonstrates: Pattern usage and interactions
```

## Interaction Sequence

```
1. Client creates:
   - Store objects (Cats & Things, Ins and Outs)
   - Shopper objects (Alex, Eve, Sharon, Mike)
   - Mall object (Valley Mall)

2. Client subscribes observers to stores:
   Store.subscribe(Observer)
   ├── Store adds observer to its list
   └── Observer is now registered

3. Store announces sale:
   Store.sale(discount)
   ├── Store calls notifyObservers()
   ├── Store iterates through observers list
   └── Each observer.notify() is called

4. Observers react:
   ├── Shopper.notify() → Prints message
   └── Mall.notify() → Records sale in list
```

## Key Relationships

```
Subject ──1───*───► Observer
  │                    │
  │                    │
  │                    │
Store              Shopper, Mall
  │                    │
  │                    │
  └─── notifies ───────┘
       (one-to-many)
```

## Design Pattern Roles

| Role | Class/Interface | Responsibility |
|------|----------------|----------------|
| **Subject** | `Subject` (interface) | Defines interface for objects being observed |
| **Concrete Subject** | `Store` | Maintains observer list, notifies on state change |
| **Observer** | `Observer` (interface) | Defines interface for objects that observe |
| **Concrete Observer** | `Shopper`, `Mall` | Implements update behavior when notified |
| **Client** | `Client` | Creates subjects and observers, manages subscriptions |

## Data Flow

```
┌──────────┐
│  Store   │
│          │
│ sale(20) │
└────┬─────┘
     │
     │ calls notifyObservers()
     │
     ▼
┌─────────────────┐
│ Observer List   │
│ [Alex, Eve,     │
│  Mike, Mall]    │
└────┬────────────┘
     │
     │ iterates and calls notify()
     │
     ├──► Shopper.notify() ──► Prints: "Alex, there is a sale..."
     ├──► Shopper.notify() ──► Prints: "Eve, there is a sale..."
     ├──► Shopper.notify() ──► Prints: "Mike, there is a sale..."
     └──► Mall.notify() ─────► Records: {storeName, discount}
```

