<<<<<<< HEAD
import java.util.Objects;

public class Book {

    private int id;
=======
public class Book {

>>>>>>> origin/NM-ObjectsAndClasses
    private String title;
    private Author author;
    private int yearPublication;

<<<<<<< HEAD
    public Book(int id, String title, Author author, int yearPublication) {
        this.id = id;
=======
    public Book(String title, Author author, int yearPublication) {
>>>>>>> origin/NM-ObjectsAndClasses
        this.title = title;
        this.yearPublication = yearPublication;
        if (author.getFirstName().length() != 0 && author.getLastName().length() != 0) {
            this.author = author;
        } else {
            System.out.println("Автор не указан. Без автора книга не может быть добавлена");
        }
    }

<<<<<<< HEAD
    public int getId() {
        return this.id;
    }
=======
>>>>>>> origin/NM-ObjectsAndClasses
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
<<<<<<< HEAD

    public String toString() {
        return "Книга" + id + ": " + title + " Автор: " + author.getFirstName() + " " + author.getLastName() + " Год публикации: " + yearPublication;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookBook = (Book) other;
        return this.title.equals(bookBook.title);
    }

    public int hashCode() {
        return Objects.hash(title);
    }
=======
>>>>>>> origin/NM-ObjectsAndClasses
}
