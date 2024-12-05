package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Modules.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        System.out.printf("NoGenerics\n");

        NoGenericMethods example1 = new NoGenericMethods("One", "Two", "three");
        System.out.println("Example 1: " + example1);

        example1.setObject1("three");
        example1.setObject2("One");
        example1.setObject3("Two");
        System.out.println("Example 3 després de modificar: " + example1);

        System.out.println("Objecte 1: " + example1.getObject1());
        System.out.println("Objecte 2: " + example1.getObject2());
        System.out.println("Objecte 3: " + example1.getObject3());
    }
}