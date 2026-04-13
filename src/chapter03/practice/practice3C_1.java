package chapter03.practice;

public class practice3C_1 {
    class Id {
        private static int counter = 0;
        private int id;

        public Id() {
            id = ++counter;
        }

        public static int getCounter() {
            return counter;
        }

        public int getId() {
            return id;
        }
    }
}

class IdTester {
    public static void main(String[] args) {
        practice3C_1 outer = new practice3C_1();

        practice3C_1.Id a = outer.new Id();
        practice3C_1.Id b = outer.new Id();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + practice3C_1.Id.getCounter());
    }
}

/*
클래스 메서드 (static O): static 변수만 사용하거나, 객체 상태가 필요 없을 때.
인스턴스 메서드 (static X): 인스턴스 변수를 사용할 때.

* static 메서드 안에서는 인스턴스 변수 못 씀.
 */
