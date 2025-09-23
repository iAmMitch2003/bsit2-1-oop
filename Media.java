
abstract class Media {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    public Media(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned");
    }

    public abstract String getMediaType();

    public abstract void displayInfo();
}

class Book extends Media {
    private String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public String getMediaType() {
        return "Book";
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " (ID: " + itemId + ")");
    }
}

class DVD extends Media {
    private String director;

    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.director = director;
    }

    @Override
    public String getMediaType() {
        return "DVD";
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD: " + title + " directed by " + director + " (ID: " + itemId + ")");
    }
}

class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getMediaType() {
        return "Magazine";
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + " Issue #" + issueNumber + " (ID: " + itemId + ")");
    }
}
