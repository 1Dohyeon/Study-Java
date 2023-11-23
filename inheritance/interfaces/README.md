### interface
- 스펙을 주어 클래스들이 그 기능을 서로 다르게 구현할 수 있도록 하는 클래스의 규격 선언, 클래스의 다형성을 실현
- 클래스가 구현해야할 추상 메서드들의 집합
    - interface 키워드로 선언
- abstract 없이 추상 메서드 구현 가능
- protected 불가능
- 인터페이스 간의 ==다중 상속 가능==하다.
- extends가 아닌 ==implements로 상속==(상속이 아닌 구현이란 표현이 알맞다.)
- 인터페이스가 인터페이스를 상속할 때는 extends를 사용한다.
> EX [예제 코드 주소](https://github.com/1Dohyeon/Study-Java/blob/main/inheritance/interfaces/InterfaceEx.java)
```
package inheritance.interfaces;

/* 인터페이스의 목적
*   스펙을 주어 클래스들이 그 기능을 서로 다르게 구현할 수 있도록 하는 클래스 구격 선언.
*   클래스의 다형성을 실현하는 도구임.
*/

public class InterfaceEx {
    public static void main(String [] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo(); phone.sendCall();
        phone.play();
        System.out.println("3 5 " + phone.calculate(3,5)); phone.schedule();
    }
}

// interface 키워드로 인터페이스를 선언(interface = 클래스가 구현해야 할 추상 메서드들의 집합, 설계도이다.)
interface PhoneInterface {
    // interface를 선언할 때, 상수는 public만 허용(public static final 생략 가능)
    int TIMEOUT = 10000;
    
    // 메서드도 public abstract로 지정. 생략 가능
    void sendCall();
    void receiveCall();
    
    // default 메서드 = 인터페이스에 코드가 작성된 메서드
    // 인터페이스를 구현하는 클래스에 자동 상속되고, public 접근 지정만 허용. 생략 가능.
    default void printLogo() {
        System.out.println("** Phone **");
    }
    
    /*
    * private 메서드
    *   default처럼 인터페이스 내에서 코드가 작성된 메서드이며, 인터페이스 내에 있는 메서드에 의해서만 호출 가능
    */
}

// interface가 interface를 상속 받을 때 extends를 사용
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface {
    void play();
    void stop();
}

// 다중 상속도 가능하다.
interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
    void playMP3RingTone();
}

// class가 interface를 상속 받을 때 implements 사용
class SamsungPhone implements PhoneInterface {
    @Override public void sendCall() { System.out.println(" "); }
    @Override public void receiveCall() { System.out.println(" ."); }
    public void flash() { System.out.println(" ."); }
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

// class와 interface 다중 상속도 가능하다.
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override public void sendCall() { System.out.println(" ~~"); }
    @Override public void receiveCall() { System.out.println(" ."); }
    @Override public void sendSMS() { System.out.println(" ."); }
    @Override public void receiveSMS() { System.out.println(" ."); }
    @Override public void play() { System.out.println(" ."); }
    @Override public void stop() { System.out.println(" ."); }
    public void schedule() { System.out.println(" ."); }
}
```


