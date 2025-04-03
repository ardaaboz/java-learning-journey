# Homework Assignment: Game Character Interface System

## Objective
Create a simple game character system using interfaces to define different character abilities and traits.

## Requirements

### Create the following interfaces:

- **Attackable**
    - Methods:
      ```java
      void attack();  
      int getDamage();
      ```

- **Defendable**
    - Methods:
      ```java
      void defend();  
      int getDefense();
      ```

- **Healable**
    - Methods:
      ```java
      void heal();  
      int getHealingPower();
      ```

- **Movable**
    - Methods:
      ```java
      void move(String direction);  
      int getSpeed();
      ```

### Create an abstract `GameCharacter` class with:

- Fields for `name`, `health`, `level`
- Constructor, getters, and setters
- Abstract method:
  ```java
  void displayStats();
  ```

### Create at least three concrete character classes that extend `GameCharacter` and implement different combinations of interfaces:

- **Warrior** (implements `Attackable`, `Defendable`, `Movable`)
- **Healer** (implements `Healable`, `Defendable`, `Movable`)
- **Archer** (implements `Attackable`, `Movable`)

### Create a `GameWorld` class with a `main` method that:

- Creates instances of each character type
- Stores them in an `ArrayList<GameCharacter>`
- Demonstrates polymorphism by calling methods through interface types
- Shows different behavior based on which interfaces a character implements

### Add a simple menu system to:

1. List all characters
2. Select a character and display their stats
3. Make a character perform actions based on their implemented interfaces
4. Exit the program

## Extra Challenge (Optional)

- Add a `Magical` interface with methods for casting spells
- Create a `Wizard` class that implements both `Magical` and `Attackable`
- Implement interface inheritance (one interface extending another)

