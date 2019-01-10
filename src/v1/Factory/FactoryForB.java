package v1.Factory;

public class FactoryForB implements produce {
    @Override
    public food get() {
        return new B();
    }
}
