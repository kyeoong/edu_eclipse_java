package och10_ex05;

public class MyException0202 extends Exception {  // MyException0202 -> 최대 급여
	
	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "사장님 5000만 원 넘 많아요, 좀 적당히 합시다";
		return ErrMsg;
	}

}
