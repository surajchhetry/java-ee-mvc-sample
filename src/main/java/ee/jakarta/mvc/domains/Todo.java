package ee.jakarta.mvc.domains;

public class Todo {
    private String title;

    public Todo(String title) {
        this.title = title;
    }

    public Todo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
