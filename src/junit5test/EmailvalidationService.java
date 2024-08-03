package junit5test;

public class EmailvalidationService {
         public boolean isvalidemail(String email) {
        	 if(email==null)return false;
        	 return email.contains("@")&& email.contains(".");
         }
} 
