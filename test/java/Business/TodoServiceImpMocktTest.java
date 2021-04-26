package Business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class TodoServiceImpMocktTest {


	@Test
	public void testRetrieveTodosRelatedToSpring_UsingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy User");
		
		assertEquals(2, filteredTodos.size());
	}

}
