package ee.jakarta.mvc.services;

import ee.jakarta.mvc.TodoException;
import ee.jakarta.mvc.domains.Todo;
import ee.jakarta.mvc.repository.TodoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class TodoServiceTest {

    private static TodoService todoService;

    @BeforeAll
    public static void init(){
        TodoRepository todoRepository = mock(TodoRepository.class);
        todoService = new TodoServiceImpl(todoRepository);
    }

    @Test
    public void testSetup(){
    }

    @Test
    @DisplayName(" If title is null")
    public void shouldThroughExceptionIfTitleIsBlank(){
        Todo todo = new Todo();
        TodoException exception = assertThrows(TodoException.class,()->todoService.add(todo));
        assertEquals(TodoException.ExceptionType.TODO_TITLE_EMPTY,exception.getType());

    }
}
