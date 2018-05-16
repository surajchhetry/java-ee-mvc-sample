package ee.jakarta.mvc.repository;

import ee.jakarta.mvc.domains.Todo;


import java.util.List;

public interface TodoRepository {

    void add(Todo todo);

    List<Todo> findAll();
}
