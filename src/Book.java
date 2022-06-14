public class Book {

    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.yearPublication = yearPublication;
        if (author.getFirstName().length() != 0 && author.getLastName().length() != 0) {
            this.author = author;
        } else {
            System.out.println("Автор не указан. Без автора книга не может быть добавлена");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
