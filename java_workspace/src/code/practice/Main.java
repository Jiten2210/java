package code.practice;


    class Base {
        public Base(){
            System.out.println("Base Constructor");
        }
        public void show() {
            System.out.println("Base::show() called");
        }
    }

    class Derived extends Base {
        public Derived(){
            System.out.println("Derived Constructor");
        }
        public void show() {
            System.out.println("Derived::show() called");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Base b = new Base();;
            b.show();

            Base b1 =  new Derived();
            b1.show();

            Derived d =  new Derived();
            d.show();

            //Derived d1 =  new Base();
            //d1.show();
        }
    }

