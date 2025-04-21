package och10_ex04;
	
public class MyException extends Exception {
	
	@Override
	public String getMessage() {
		String errMsg;
		
		// bussiness logic Error
		errMsg = "아니 10보다 크나디";
		
		return errMsg;
	}
}
