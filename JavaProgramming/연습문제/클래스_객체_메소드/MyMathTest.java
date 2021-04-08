class MyMath { //매개 변수만 다르면 메소드 이름은 같아도 된다. 이것을 메소드 중복정의라고 한다.
    // 정수값을 제곱하는 메소드
    int square(int i) {
        return (int) Math.pow(i, 2);
    }


    // 실수값을 제곱하는 메소드
    double square(double i) {
        return (double) Math.pow(i, 2);
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.printf("%d\n%.4f\n", obj.square(10), obj.square(3.14));
    }
}