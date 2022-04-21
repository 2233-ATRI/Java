public class Car {
    public static void run(){
        System.out.println("汽车在奔跑");
    }
    public static void main(String[] args){
        run();
    }
}

class Driver {
    //使用形参方式发生依赖关系
    public void drive1(Car car){
        car.run();
    }
    //使用局部变量发生依赖关系
    public void drive2(){
        Car car = new Car();
        car.run();
    }
    //使用静态变量发生依赖关系
    public void drive3(){
        Car.run();
    }
}
