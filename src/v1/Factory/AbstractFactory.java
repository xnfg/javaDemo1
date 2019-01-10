package v1.Factory;

/**
 * 抽象工厂模式
 */
public class AbstractFactory {

    public static void main(String[] args) {
        food x= new FactoryForA().get();
        x = new FactoryForB().get();
    }

}
