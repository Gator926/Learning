/**
 * 类中方法的声明和使用
 *
 * 方法：描述类应该具有的功能
 * 比如：
 *      Math类：sqrt、random
 *      Scanner类：nextXxx
 *      Array类：sort、binarySearch、toString、equals
 *
 * 方式声明：
 *      权限修饰符 返回值类型 方法名（形参列表）{
 *          方法体
 *      }
 *
 * 权限修饰符：
 *      private、public、缺省、protected
 *
 * 返回值类型：
 *      有返回值：
 *          如果方法有返回值，则必须在方法声明时，指定返回值类型，同时，方法中需要使用return关键字来返回指定类型的变量或常量
 *      无返回值：
 *          如果方法没有返回值，则方法声明时，使用void来表示，通常没有返回值的方法中，就不需要使用return，如果使用只能使用“return”表示结束方法
 *
 * 形参列表：方法可以声明0个、1个或这个形参
 *      格式：数据类型1 形参1, 数据类型2 形参2, 数据类型3 形参3
 *
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // 报错无法执行
        // customer.eat();
    }
}

class Customer{
    String name;
    int age;
    boolean isMale;

    private void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是: " + nation;
        return info;
    }
}
