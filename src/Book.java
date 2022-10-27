public class Book {
    private String title;
    private String nameAuthor;
    private int publicationYear;

    public  Book (String title, String nameAuthor, int publicationYear ){

        this.title = title;
        this.nameAuthor = nameAuthor;
        this.publicationYear = publicationYear;

    }

    public String getTitle() {
        return this.title;

    }

    public String getNameAuthor() {
        return this.nameAuthor;

    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setTitle(int publicationYear) {
        this.publicationYear = publicationYear;
    }


}
