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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
}

