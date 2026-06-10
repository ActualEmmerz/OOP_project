# OOP_project

**Checklist:**
1. Are you in a Group?
   No I will be working alone
2. If so, who else is in your group?
   N/A
3. What programming language are you selecting? Which version?
   Java openjdk version "17.0.8.1"
4. Do you have your GitHub account set up?
   yes user is ActualEmmerz
5. Do you have a public repository for your Project?
   yes
6. What is the link to your GitHub repository?
   https://github.com/ActualEmmerz/OOP_project/tree/main
7. If you are in a group, does everyone have access to the github repo?
   yes
8. Do you have a "Hello World" program that compiles and runs?
   yes screenshot provided in d2l
9. Where is the entry point to your project? (src/main/Main.java for example)
   The entry point is Main.java

**Project Description**

For this project, I created a Global Travel Simulation and Route Planner. The goal of the project is to allow a user to build a multi-stop trip (for example: Chicago → London → Paris → Dubai) and then simulate what happens during the journey.

The system does not just plan routes, it also simulates travel conditions such as delays and different types of transportation (flights, trains, etc.). The project is large enough to demonstrate multiple design patterns because it involves several systems working together (route creation, simulation engine, transportation types, and passenger notifications).


**Core Features**

1. Create a travel route with multiple destinations
2. Support different transportation types (flight, train, etc.)
3. Simulate events such as delays during the trip
4. Notify the passenger as the trip progresses
5. Display an output of what happened during the trip

**Design Patterns Used**

This project implements 6 custom design patterns, and each one is actually used in the program (not just added for demonstration):

1. Strategy Pattern – to handle different travel methods (flight, train, etc.)
2. Factory Method Pattern – to create transportation objects
3. Observer Pattern – to update the passenger when events occur
4. Singleton Pattern – for the main simulation engine
5. Decorator Pattern – to add conditions like delays to travel
6. Builder Pattern – to build the travel route with multiple stops

All 6 are the standard Gang of Four versions we saw in class, so I did not deviate from them.

The Strategy Pattern is used to support different transportation methods such as flights and trains. Each transportation type has its own class that implements the TransportationStrategy interface (FlightStrategy, TrainStrategy).

The Factory Method Pattern is used to create transportation objects without directly creating them in Main.java. TransportationCreator is the abstract creator and FlightCreator and TrainCreator are the concrete creators. This keeps object creation organized and scalable.

The Observer Pattern is used so the Passenger gets notified as the trip moves from stop to stop. TravelEventManager keeps the list of observers and notifies them, and Passenger implements the TravelObserver interface.

The Singleton Pattern is used in the TravelSimulationEngine so the program only uses one simulation engine object throughout execution.

The Decorator Pattern is used to wrap a transportation strategy and add extra behavior. DelayDecorator wraps a flight and adds a delay message while still using the original travel behavior.

The Builder Pattern is used in TravelRoute to simplify route creation with multiple travel stops using a chain of addStop(...) calls.

**SOLID Principles**

The patterns also follow SOLID principles:

- Single Responsibility: each class has one job (a strategy travels, the engine runs the simulation, the manager handles observers, the route holds stops).
- Open/Closed: I can add a new transportation type (like a Bus) by adding a new Strategy and Creator without changing the existing classes.
- Liskov Substitution: any TransportationStrategy (including a decorated one) can be used in place of another.
- Interface Segregation: TransportationStrategy and TravelObserver are small, focused interfaces.
- Dependency Inversion: Main and the simulation engine depend on the interfaces (TransportationStrategy, TravelObserver) instead of the concrete classes.

**Libraries / Tools**

1. Java Standard Library (required)
2. java.util.ArrayList for holding stops and observers

No third party libraries are required to compile or run this project.

**How to Compile and Run**

From the project root:

```
javac *.java
java Main
```

## Final Submission

For the final submission, the project demonstrates a working travel simulation:

- A multi-stop route is built with the Builder Pattern
- Transportation objects are created with the Factory Method Pattern
- A flight is wrapped with the Decorator Pattern to add a delay
- The Singleton simulation engine runs the trip
- The passenger is notified at each stop with the Observer Pattern
- The Strategy Pattern lets the same route run with a flight or a train

The program runs the route twice, once with a delayed flight and once with a train, and prints out a step-by-step output of the trip.

## UML Diagram

The final UML diagram is in the root folder of this repo (UML.pdf). It shows all of the classes, interfaces, fields, methods, and the relationships for all 6 design patterns.

## Incomplete Functionality

- The simulation does not model missed connections or passenger fatigue. Those were ideas from an earlier sprint that I did not get to. The current passenger state is limited to receiving arrival notifications.
- There is no GUI. The project runs in the console only. A Java Swing front end was a stretch goal that I did not implement.
- Saving and loading routes (the optional JSON idea from an earlier sprint) was not implemented.

## Unfixed Bugs

- Delays are added through the DelayDecorator but they are descriptive only. The delay message prints, but it does not change the timing or affect the rest of the trip.

## Problems / Challenges

Some challenges I faced during the project:

- Designing the project structure early enough to avoid large refactoring later
- Making the design patterns interact correctly together
- Keeping the simulation realistic while still maintaining readable code
- Preventing the simulation classes from becoming too tightly coupled
- Deciding how detailed the simulation should become while still staying manageable for the scope of the course project
