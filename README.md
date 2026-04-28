# Ultimate Team (Java OOP)

A Java OOP project modelling a football Ultimate Team. Players are organized by position, each with their own class, and assembled into a full squad through the `UltimateTeam` class.

## Project Structure

```
UltimateTeam/
├── Player.java          # Base class for all players
├── Attacker.java        # Extends Player — attacking position
├── Midfielder.java      # Extends Player — midfield position
├── Defender.java        # Extends Player — defensive position
├── Goalkeeper.java      # Extends Player — goalkeeper position
├── UltimateTeam.java    # Assembles and manages the full squad
└── ProjectOneTester.java # Entry point — runs and tests the project
```

## Concepts Demonstrated

- Object-Oriented Programming (inheritance, encapsulation, polymorphism)
- Class hierarchy with a base `Player` class
- Squad assembly and management logic

## How to Run

1. Open the project in **VS Code**
2. Run `ProjectOneTester.java` as the entry point
3. Output will display in the console/terminal

## Requirements

- Java JDK 11 or higher
- Any Java IDE (IntelliJ IDEA recommended)
