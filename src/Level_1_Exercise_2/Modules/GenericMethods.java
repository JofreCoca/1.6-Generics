package Level_1_Exercise_2.Modules;

public class GenericMethods <T> {
    private T object1;
    private T object2;
    private T object3;

    public GenericMethods(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public Object getObject2() {
        return object2;
    }

    public void setObject2(T object2) {
        this.object2 = object2;
    }

    public Object getObject3() {
        return object3;
    }

    public void setObject3(T object3) {
        this.object3 = object3;
    }

    @Override
    public String toString() {
        return "Level_1_Exercise_1.Modules.NoGenericMethods{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                ", object3=" + object3 +
                '}';
    }
}