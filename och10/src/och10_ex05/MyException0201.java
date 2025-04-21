package och10_ex05;
// 최소 임금 Error Message
public class MyException0201 extends Exception {  // 개발자 정의 에러 처리
	//   MyException0201 -> 최저 임금
	
	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "사장님 200만 원 보다 적어요 !! 이게 뭡니까";
		return ErrMsg;
	}
}
