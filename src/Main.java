
public class Main {
    public static void main(String[] args) {
        System.out.printf("Generics\n");

        NoGenericMethods example1 = new NoGenericMethods("One", 123, true);
        System.out.println("Example 1: " + example1);


        NoGenericMethods example2 = new NoGenericMethods(3.14, "Two", false);
        System.out.println("Example 2: " + example2);

        example1.setObject1(123);
        example1.setObject2(false);
        example1.setObject3("Nou valor");
        System.out.println("Example 3 després de modificar: " + example1);

        // Recuperar objectes específics
        System.out.println("Objecte 1: " + example1.getObject1());
        System.out.println("Objecte 2: " + example1.getObject2());
        System.out.println("Objecte 3: " + example1.getObject3());
    }
}