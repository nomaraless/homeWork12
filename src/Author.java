import java.util.Objects;

public class Author {

    private String lastName;
    private String name;

    public Author(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;

    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.lastName + " " + this.name;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Author author = (Author) object;
        return Objects.equals(getLastName(), author.getLastName()) && Objects.equals(getName(), author.getName());
    }

    public int hashCode() {
        return java.util.Objects.hash(getLastName(), getName());
    }
}
