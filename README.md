# OOP_project
**Checklist:**
1.  Are you in a Group?
  No I will be working alone
2.  If so, who else is in your group?
   N/A
3.  What programming language are you selecting? Which version?
  Java openjdk version "17.0.8.1"
4. Do you have your GitHub account set up?
yes user is ActualEmmerz
5. Do you have a public repository for your Project?
yes
6. What is the link to your GitHub repository?
https://github.com/ActualEmmerz/OOP_project/tree/main
7. If you are in a group, does everyone have access to the github repo?
yes
8. Do you have a “Hello World” program that compiles and runs?
yes screenshot provided in d2l 
9. Where is the entry point to your project? (src/main/Main.java for
example)
once configured it will be in src/main/main.java

**Project Description**

For this project, I will create a Global Travel Simulation and Route Planner. The goal of the project is to allow a user to build a multi-stop trip (for example: Chicago → London → Paris → Dubai) and then simulate what happens during the journey.

The system will not just plan routes, but also simulate realistic travel conditions such as delays, missed connections, and different types of transportation (flights, trains, etc.). The project is large enough to demonstrate multiple design patterns because it involves several systems working together (route creation, simulation engine, transportation types, and passenger state tracking).


**Core Features**

1. Create a travel route with multiple destinations
2. Support different transportation types (flight, train, etc.)
3. Simulate events such as delays and missed connections
4. Track basic passenger conditions (like fatigue or trip success)
5. Display a timeline or output of what happened during the trip

**Design Patterns to Be Used**


1. Strategy Pattern – to handle different travel methods (flight, train, etc.)
2. Factory Pattern – to create transportation objects
3. Observer Pattern – to update passenger state when events occur
4. Singleton Pattern – for the main simulation engine
5. Decorator Pattern – to add conditions like delays or issues to travel
   
**Builder Pattern**

Each pattern will be implemented in a way that is actually used in the program, not just added for demonstration.

1. Libraries / Tools (Planned)
2. Java Standard Library (required)
3. Java Swing (optional, for simple GUI)
4. JSON library (optional) for saving/loading routes
5. Java Time API for handling schedules and timing



## Current Sprint Progress

For this sprint, I implemented two major design patterns into the project:

1. Strategy Pattern
2. Factory Pattern
3. Singleton Pattern
4. Builder Pattern

The Strategy Pattern is used to support different transportation methods such as flights and trains. Each transportation type has its own class that implements the TransportationStrategy interface.

The Factory Pattern is used to create transportation objects without directly creating them in Main.java. This keeps object creation organized and scalable.

The Singleton Pattern is used in the TravelSimulationEngine so the program only uses one simulation engine object throughout execution.

The Builder Pattern is used in TravelRoute to simplify route creation with multiple travel stops.

## Planned Final Submission

## Planned Final Submission

For the final submission, I want the project to demonstrate:

- Multiple transportation systems
- Realistic route planning
- Passenger event notifications
- Delays and travel conditions
- Route simulation output
- Possible GUI support using Java Swing
- Expanded travel event systems

The final version should simulate a realistic travel experience where the user can create routes and watch the simulation play out step-by-step.

## Problems / Challenges

Some challenges I currently face include:

- Designing the project structure early enough to avoid large refactoring later
- Making design patterns interact correctly together
- Keeping the simulation realistic while still maintaining readable code
- Planning future features without overcomplicating the current sprint
- - Making all design patterns interact correctly together
- Preventing the simulation classes from becoming too tightly coupled
- Keeping the project organized as more features are added
- Designing realistic travel event systems without overcomplicating the code
- Creating a scalable structure for future transportation types

Another challenge is deciding how detailed the simulation should become while still staying manageable for the scope of the course project.


