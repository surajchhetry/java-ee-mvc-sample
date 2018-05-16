package ee.jakarta.mvc.services;

import ee.jakarta.mvc.domains.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAll();

    void add(Todo todo);

}
