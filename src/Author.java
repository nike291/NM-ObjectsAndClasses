import java.util.Objects;

public class Author {
    private int id;
    private String firstName;
    private String lastName;

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор" + id + ": " + firstName + " " + lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return (this.firstName.equals(author2.firstName) && this.lastName.equals(author2.lastName));
    }

    public int hashCode() {
        return Objects.hash(firstName);
    }
}
