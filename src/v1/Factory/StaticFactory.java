package v1.Factory;

/**
 *  静态工厂模式
 */
public class StaticFactory {

    /**
     * 构造方法私有化
     */
    private StaticFactory(){}

    /**
     * 通过每个方法的实现
     * @return
     */
    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }

}