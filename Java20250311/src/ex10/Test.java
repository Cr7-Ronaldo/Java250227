package ex10;

class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("강아지가 멍멍 짖습니다.");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // 업캐스팅
        System.out.println(a.name); // 출력 1
        a.sound(); // 출력 2
    }

}
