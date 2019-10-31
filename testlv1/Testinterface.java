package testlv1;

    public class Testinterface {
        private int age = 10;

         void show() {
            System.out.println("太难了");
        }

        public class Inner {
            public void www() {
                System.out.println(Testinterface.this.age);

            }
        }
    }

        class testc {
            public static void main(String[] args) {
                 Testinterface.Inner inner = new Testinterface().new Inner();
                inner.www();
                studentwoman s = new studentwoman();
                s.fly();
                s.mirror();

            }
        }





   interface people{
        int speed = 100;
        void fly();

}

    interface woman{
        void mirror();
        int weight = 90;
}
    class studentwoman implements people,woman{

        @Override
        public void fly() {
            System.out.println("我不会飞");
        }

        @Override
        public void mirror() {
            System.out.println(studentwoman.weight);
        }
    }