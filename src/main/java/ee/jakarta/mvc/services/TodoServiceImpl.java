package ee.jakarta.mvc.services;

import ee.jakarta.mvc.TodoException;
import ee.jakarta.mvc.domains.Todo;
import ee.jakarta.mvc.repository.TodoRepository;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
class TodoServiceImpl implements TodoService{

    private TodoRepository todoRepository;

    @Inject
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAll() {
        return this.todoRepository.findAll();
    }

    @Override
    public void add(Todo todo) {
        if(StringUtils.isBlank(todo.getTitle()))
            throw new TodoException(TodoException.ExceptionType.TODO_TITLE_EMPTY);
        this.todoRepository.add(todo);
    }
}
