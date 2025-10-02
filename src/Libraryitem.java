import java.util.Objects;

public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = Objects.requireNonNull(itemId, "itemId cannot be null");
        this.title = Objects.requireNonNull(title, "title cannot be null");
        this.author = Objects.requireNonNull(author, "author cannot be null");
        this.isCheckedOut = false;
        this.borrowerName = null;
    }


    public String getItemId() {
        return itemId;
    }

    public String getItemInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(getItemType()).append("] ");
        sb.append("ID: ").append(itemId).append(", ");
        sb.append("Title: ").append(title).append(", ");
        sb.append("Author: ").append(author).append(", ");
        sb.append("Status: ").append(isCheckedOut ? "Checked out by " + borrowerName : "Available");
        return sb.toString();
    }

    public void checkOut(String borrowerName) {
        if (isCheckedOut) {
            throw new IllegalStateException("Item is already checked out.");
        }
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
    }

    public void checkIn() {
        if (!isCheckedOut) {
            throw new IllegalStateException("Item is not currently checked out.");
        }
        this.isCheckedOut = false;
        this.borrowerName = null;
    }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);
}