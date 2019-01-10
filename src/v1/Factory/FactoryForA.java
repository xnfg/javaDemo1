package v1.Factory;

public class FactoryForA implements produce {
    @Override
    public food get() {
        return new A();
    }
}
