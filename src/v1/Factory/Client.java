package v1.Factory;

public class Client {
    public static void main(String[] args) {
        //客户端代码只需要将相应的参数传入即可得到对象
        //用户不需要了解工厂类内部的逻辑。
        String name = "A";
            food x = null ;
            if ("A".equals(name)) {
                x = StaticFactory.getA();
            }else if ("B".equals(name)){
                x = StaticFactory.getB();
            }else {
                x = StaticFactory.getC();
            }
    }
}
