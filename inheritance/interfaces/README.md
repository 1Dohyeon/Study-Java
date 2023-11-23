### interface
- ������ �־� Ŭ�������� �� ����� ���� �ٸ��� ������ �� �ֵ��� �ϴ� Ŭ������ �԰� ����, Ŭ������ �������� ����
- Ŭ������ �����ؾ��� �߻� �޼������ ����
    - interface Ű����� ����
- abstract ���� �߻� �޼��� ���� ����
- protected �Ұ���
- �������̽� ���� ==���� ��� ����==�ϴ�.
- extends�� �ƴ� ==implements�� ���==(����� �ƴ� �����̶� ǥ���� �˸´�.)
- �������̽��� �������̽��� ����� ���� extends�� ����Ѵ�.
> EX [���� �ڵ� �ּ�](https://github.com/1Dohyeon/Study-Java/blob/main/inheritance/interfaces/InterfaceEx.java)
```
package inheritance.interfaces;

/* �������̽��� ����
*   ������ �־� Ŭ�������� �� ����� ���� �ٸ��� ������ �� �ֵ��� �ϴ� Ŭ���� ���� ����.
*   Ŭ������ �������� �����ϴ� ������.
*/

public class InterfaceEx {
    public static void main(String [] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo(); phone.sendCall();
        phone.play();
        System.out.println("3 5 " + phone.calculate(3,5)); phone.schedule();
    }
}

// interface Ű����� �������̽��� ����(interface = Ŭ������ �����ؾ� �� �߻� �޼������ ����, ���赵�̴�.)
interface PhoneInterface {
    // interface�� ������ ��, ����� public�� ���(public static final ���� ����)
    int TIMEOUT = 10000;
    
    // �޼��嵵 public abstract�� ����. ���� ����
    void sendCall();
    void receiveCall();
    
    // default �޼��� = �������̽��� �ڵ尡 �ۼ��� �޼���
    // �������̽��� �����ϴ� Ŭ������ �ڵ� ��ӵǰ�, public ���� ������ ���. ���� ����.
    default void printLogo() {
        System.out.println("** Phone **");
    }
    
    /*
    * private �޼���
    *   defaultó�� �������̽� ������ �ڵ尡 �ۼ��� �޼����̸�, �������̽� ���� �ִ� �޼��忡 ���ؼ��� ȣ�� ����
    */
}

// interface�� interface�� ��� ���� �� extends�� ���
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface {
    void play();
    void stop();
}

// ���� ��ӵ� �����ϴ�.
interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
    void playMP3RingTone();
}

// class�� interface�� ��� ���� �� implements ���
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

// class�� interface ���� ��ӵ� �����ϴ�.
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


