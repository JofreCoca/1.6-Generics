package Level_1_Exercise_2.Main;

import Level_1_Exercise_2.Modules.GenericMethods;
import Level_1_Exercise_2.Modules.Person;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Generics\n");

        GenericMethods example1 = new GenericMethods("One", 3, new Person("Pepe","Lopez",33));
        System.out.println("Example 1: " + example1);

        example1.setObject1(false);
        example1.setObject2("three");
        example1.setObject3(1);
        System.out.println("Example 3 després de modificar: " + example1);

        // Recuperar objectes específics
        System.out.println("Generic 1: " + example1.getObject1());
        System.out.println("Generic 2: " + example1.getObject2());
        System.out.println("Generic 3: " + example1.getObject3());
    }
}
