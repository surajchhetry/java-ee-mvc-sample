package ee.jakarta.mvc.repository;

import ee.jakarta.mvc.domains.Todo;


import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Named
@Singleton
class TodoRepositoryImpl implements TodoRepository {

    private List<Todo> store = new ArrayList<>();


    @Override
    public void add(Todo todo) {
        this.store.add(todo);
    }

    @Override
    public List<Todo> findAll() {
        return this.store;
    }
}
