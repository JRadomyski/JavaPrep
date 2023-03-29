package Lambdas;

public interface MyInterface {
    public void message();
    MyInterface mainter = new MyInterface() {
        @Override
        public void message() {
            System.out.println("helol");
        }
    };

}
