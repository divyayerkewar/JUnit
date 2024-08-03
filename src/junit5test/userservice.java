package junit5test;

import java.util.HashSet;
import java.util.Set;

public class userservice {
 private Set<String> registerusernames = new HashSet<>();
 
 
 public boolean isusernameavaliable(String username) {
	 return !registerusernames.contains(username);
 }
 public void registerusername(String username) {
	 registerusernames.add(username);
 }
}
