package java010_abstract_interface.answ.part02;

public class MotorBicycle implements IBicycle, IMotor {
    // 멤버변수 추가
    int id;
    String brand;
    
    // IBicycle에 있는 추상 메소드를 구현하세요
    public void prtInfo() {
        System.out.println("ID : "+id);
        System.out.println("Brand : "+brand);
        System.out.println("Frame Size : "+IBicycle.FrameSize_M); // 인터페이스에서 제공하는 상수 사용
        System.out.println("Motor Size : "+IMotor.Motor_Size_Large);
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void start() {
        System.out.println("## 모터 start!!");
    }
    // IMotor에 있는 추상 메소드를 구현하세요
    public void stop() {
        System.out.println("## 모터 stop!!");
    }
}
