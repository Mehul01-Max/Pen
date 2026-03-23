# Pen Design — Low Level Design in Java

A pen system built in Java demonstrating OOP and SOLID principles.

## Overview

Models different pen types (BallPoint, Gel, Ink) with interchangeable open/close mechanisms (Cap, Click) using the **Strategy Pattern**.

## UML Class Diagram

![UML Class Diagram](UML.png)

## Design Patterns

- **Strategy** — `OpenCloseStrategy` interface with `CapStrategy` / `ClickStrategy` decouples the open/close mechanism from the pen.
- **Factory** — `PenFactory.createPen()` centralises pen creation from type, colour, and mechanism strings.
- **Template Method** — `Pen.write()` calls abstract `getWritingStyle()` so subclasses only provide their unique style.

## Project Structure

```
Pen-new/
├── Pen.java                  # Abstract base class
├── BallPointPen.java         # "Rolling ball" writing style
├── GelPen.java               # "Gel" writing style
├── InkPen.java               # "Nib based fine stroke", custom refill
├── OpenCloseStrategy.java    # Strategy interface
├── CapStrategy.java          # Cap-based open/close
├── ClickStrategy.java        # Click-based open/close
├── PenFactory.java           # Factory for pen creation
├── Main.java                 # Demo client
└── UML.png                   # Class diagram
```

## How to Run

```bash
javac *.java
java Main
```

## Extending

- **New pen type** — Extend `Pen`, implement `getWritingStyle()`, register in `PenFactory`.
- **New mechanism** — Implement `OpenCloseStrategy`, register in `PenFactory.createStrategy()`.
