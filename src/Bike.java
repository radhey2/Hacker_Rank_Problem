abstract class Bike {
    abstract void run();

    abstract void speed();

    abstract void b();

    abstract void gear();

    void circle() {

    }

}

class Honda4 extends Bike {

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
        obj.speed();
        obj.b();
        obj.gear();

    }

    @Override
    void run() {
        System.out.println("Naresh");
    }

    @Override
    void speed() {
        System.out.println("Vipin");
    }

    @Override
    void b() {
        System.out.println(2 + 6);

    }

    @Override
    void gear() {
        System.out.println("Govind");

    }

}