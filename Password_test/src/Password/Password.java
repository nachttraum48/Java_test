package Password;

public class Password {

	public static void main(String[] args) {
		
		String password = "1234";
		
		// 0이상 2미만의 인덱스 추출
		String firstpassword = password.substring(0,2);
		
	    for (int i = 2; i < password.length(); i++) {
	    	firstpassword += "*";
	    }
	    
	    System.out.println(firstpassword);
		
	}

}