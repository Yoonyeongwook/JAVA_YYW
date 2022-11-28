package Day09.Ex08_AnonymousClass;

public class AnonymousEx {
	
	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous();
		
		anonymous.tv.tronOn();
		
		anonymous.methodA();
		
		anonymous.methodB(
				new RemoteControl() {
					
					@Override
					public void tronOn() {
						System.out.println("에어컨을 켭니다");
					}
					
					@Override
					public void tronOff() {
						System.out.println("에어컨을 끕니다");			
					}
				}
					
		);
	}

}
