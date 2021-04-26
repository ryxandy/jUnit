package Business;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learning Spring MVC", "Learning Spring","Learning how to dance");
	}

}
