package Day10.Ex05_UserDefineException;


// 사용자 정의 예외 클래스 선언
// public class ????Exception extends Exception
public class StoregeOverflowException extends Exception {
	
		public static void main(String[] args) {
			
		}

		public StoregeOverflowException(String message) {
			super(message);
		}
}
