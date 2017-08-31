package ru.sl.q330;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {
        public int x = 1;

        void methodFirstLevel(int x) {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(ShadowTest.this.x);
        }

        void doSmth() {
            int x = 10;//java 8
            class MemberLLocal {
                public MemberLLocal() {
                    System.out.println(x);
                }
            }
        }

    }

    public static void main(String[] args) {
        ShadowTest shadowTest = new ShadowTest();
        ShadowTest.FirstLevel firstLevel = shadowTest.new FirstLevel();
        firstLevel.methodFirstLevel(23);

    }
}
