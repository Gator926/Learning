import javax.xml.transform.Source;

/**
 * 类中属性的使用

 * 属性（成员变量） vs 局部变量
 * 1. 相同点
 *      - 定义变量的格式: 数据类型 变量名 = 变量值
 *      - 先声明后使用
 *      - 变量都有其对应的作用域
 *
 * 2. 不同点
 *      - 在类中声明的位置不同
 *          属性：直接定义在类的一对{}内
 *          局部变量：声明在方法、方法形参、代码块、构造器形参、构造器内部的变量
 *      - 关于权限修饰符的不同
 *          属性：可以在声明属性时，指明其权限，使用权限修饰符
 *              常用的权限修饰符：private、public、缺省、protected
 *          局部变量：不可以使用权限修饰符
 *      - 默认初始化值
 *          属性：根据其类型，都有默认初始化值
 *              整型（byte、short、int、long）：0
 *              浮点型（float、double）：0.0
 *              字符型（char）：0或‘\u0000’
 *              布尔型：false
 *              引用数据类型（类、数组、接口）：null
 *          局部变量：
 *              没有初始化值，调用之前必须显性赋值
 *              形参在调用时赋值即可
 *      - 在内存中夹子啊的位置：
 *          属性：夹子啊到对空间中（非static）
 *          局部变量：加载到栈空间
 */
public class UserTest{
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
    }
}

class User {
    String name;
    int age;
    boolean isMale;

    public void talk(String language) { // language: 形参, 也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat(){
        String food = "烙饼"; // 局部变量
        System.out.println("北方人喜欢吃: " + food);
    }
}
