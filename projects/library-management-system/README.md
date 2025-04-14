# Requirements

## 1. Create a base class called `LibraryItem` with the following:

### Fields:
- `title`
- `itemID`
- `isCheckedOut`

### Constructor:
- Initialize the fields: `title`, `itemID`, and `isCheckedOut`.

### Methods:
- `checkOut()`
- `returnItem()`
- `displayInfo()`

---

## 2. Create three subclasses that inherit from `LibraryItem`:

### 2.1. `Book`:
- Additional fields:
    - `author`
    - `numPages`

### 2.2. `DVD`:
- Additional fields:
    - `director`
    - `runningTime` (in minutes)

### 2.3. `Magazine`:
- Additional fields:
    - `issueDate`
    - `publisher`

### Each subclass should:
- Have a constructor that calls the parent constructor.
- Override the `displayInfo()` method to show all information, including the subclass-specific fields.
- Add at least one unique method that makes sense for that type of item.

---

## 3. Create a `Library` class with the following features:

### Fields:
- An `ArrayList` to store `LibraryItem` objects.

### Methods:
- `addItem()` - to add items to the library.
- `displayAllItems()` - to display all items in the library.
- `checkOutItem()` - to check out an item by its ID.
- `returnItem()` - to return an item by its ID.

---

## 4. Create a `Main` class with a menu system to:

- Add a new book, DVD, or magazine to the library.
- Display all items in the library.
- Check out an item (by ID).
- Return an item (by ID).
- Exit the program.
