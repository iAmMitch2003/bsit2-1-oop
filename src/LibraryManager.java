import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        System.out.println("All library items:");
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(" - " + li.getItemInfo() + " | Borrowing status: " + b.getBorrowingStatus());
            } else {
                System.out.println(" - Unknown item (not a LibraryItem).");
            }
        }
    }

    public Borrowable findById(String itemId) {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (li.getItemId().equals(itemId)) {
                    return b;
                }
            }
        }
        return null;
    }

    public boolean borrowItem(String itemId, String borrowerName) {
        Borrowable b = findById(itemId);
        if (b == null) {
            System.out.println("No item with ID " + itemId + " found.");
            return false;
        }
        if (!b.isAvailable()) {
            System.out.println("Item " + itemId + " is not available.");
            return false;
        }
        try {
            b.borrowItem(borrowerName);
            System.out.println("Item " + itemId + " checked out to " + borrowerName + ".");
            return true;
        } catch (Exception e) {
            System.out.println("Failed to borrow: " + e.getMessage());
            return false;
        }
    }

    public boolean returnItem(String itemId) {
        Borrowable b = findById(itemId);
        if (b == null) {
            System.out.println("No item with ID " + itemId + " found.");
            return false;
        }
        if (b.isAvailable()) {
            System.out.println("Item " + itemId + " is not currently borrowed.");
            return false;
        }
        try {
            b.returnItem();
            System.out.println("Item " + itemId + " returned and is now available.");
            return true;
        } catch (Exception e) {
            System.out.println("Failed to return: " + e.getMessage());
            return false;
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available items:");
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                if (b instanceof LibraryItem) {
                    System.out.println(" - " + ((LibraryItem) b).getItemInfo());
                } else {
                    System.out.println(" - Available: Unknown item type");
                }
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0.0;
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                total += li.calculateLateFee(daysLate);
            }
        }
        return total;
    }
}