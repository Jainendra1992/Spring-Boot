package JwtExample3.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import JwtExample3.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	
	public UserService()
	{
		
		store.add(new User(UUID.randomUUID().toString(), "Jainendra","jai145@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shailendra","shai1456@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Sandeep","san125@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Mandeep","man12@gmail.com"));
	}
	public List<User> getUsers()
	{
		return this.store;
	}
}
