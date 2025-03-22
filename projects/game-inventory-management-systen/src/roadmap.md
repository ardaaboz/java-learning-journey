## Requirements

### 1. `Item` Class

- **Private fields:**
    - `name`
    - `type` (e.g., weapon, armor, potion, etc.)
    - `rarity`
    - `value`
    - `weight`
- **Constructor** and appropriate **getters/setters**
- A method to **display item information**

---

### 2. `Character` Class

- **Private fields:**
    - `name`
    - `level`
    - `ArrayList` of items (inventory)
    - `maximum carrying capacity`
- **Constructor** and appropriate **getters/setters**
- Methods to:
    - **Add** items to inventory
    - **Remove** items from inventory
- A method to **calculate total inventory weight**
- A method to **display character information** and inventory contents

---

### 3. `GameWorld` Class

- **ArrayLists** to store:
    - All available items
    - All characters
- Methods to:
    - **Create** new items and characters
    - **Search** for items by name, type, or rarity
    - **Equip** items to characters
    - **Trade** items between characters
    - **Display**:
        - All items
        - All characters
        - A specific character's inventory

---

### 4. `GameManager` Class (with `main` Method)

- Create several **items** of different types and rarities
- Create a few **characters** with different inventories
- Implement a **menu system** for the user to:
    - View all available items
    - View all characters
    - Add items to a character's inventory
    - Remove items from a character's inventory
    - Trade items between characters
    - Exit the program
