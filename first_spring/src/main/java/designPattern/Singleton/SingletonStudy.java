package designPattern.Singleton;

public class SingletonStudy {
    static SingletonStudy singletonObject;
    
/*
싱글톤 패턴은 new 생성자를 외부 Class 에서 활용하지 못하도록 하는 것.
따라서 static 을 활용하여 값을 공유하고 변경하지 못하도록 고정함.

외부 Class 에서 new 생성자를 활용하지 못하도록 하는 법은 

1. private 생성자()
2. 하나의  변수에 단 하나의 주소값을 가지도록 하기 위해 static 메소드 안에
   singletonObject 가 null 일 경우에 객체를 생성하도록 명령 함 
   
3. 따라서 한번 값을 얻은 변수는 다음 번 호출 되었을 경우 null 값이 아니므로 
   이 전에 가지고 있던 주소 값을 전달 하게 됨 
   
      
*/
    private SingletonStudy() {
    	
    }
    
    // static 메소드 는 static 변수만 접근 가능 
    public static SingletonStudy getInstance() {
    	
    	if (singletonObject == null) {
			singletonObject = new SingletonStudy();
		}
    	
    	return singletonObject;
    }
    
    
	
}
