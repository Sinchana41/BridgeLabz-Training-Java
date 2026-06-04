package innerclasses.Ananymousinnerclass;

public abstract class C {

    public abstract void show();
    public abstract void config();

    public static void main(String[] args) {

        //Ananymous innerclass
        C obj = new C() {

            @Override
            public void show() {
                System.out.println("From new show");
            }

            @Override
            public void config() {
              System.out.println("From new config");
            }
        };
        obj.show();
        obj.config();
    }
}
