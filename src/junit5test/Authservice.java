package junit5test;

public class Authservice {
   public boolean auth(String username, String password) {
	return "user1".equals(username)&& "password1".equals(password) ;
}
   
}
