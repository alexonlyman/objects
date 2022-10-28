public class Book {
    private String title;
    private String Author;
    private int publicationYear;

    public  Book (String title, String Author, int publicationYear ){

        this.title = title;
        this.Author = Author;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;

    }

    public String getNameAuthor() {
        return this.Author;

    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setTitle(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
