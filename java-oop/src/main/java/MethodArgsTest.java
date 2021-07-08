/**
 * 可变个数形参的方法
 * jdk5.0新增内容
 *
 * 具体使用：
 *      可变个数形参格式：数据类型 ... 变量名
 *      当调用可变个数形参方法时，传入参数个数可以是0个、1个或多个
 *      可变个数形参的方法与本来中方法名相同，形参不同的方法之间构成重载
 *      各边个数形参在方法的形参中，必须声明在参数列表的末尾
 *      可变个数的形参在方法的形参中，最多只能声明一个可变形参
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest methodArgsTest = new MethodArgsTest();
        methodArgsTest.show(1);
        methodArgsTest.show("a");
        methodArgsTest.show("a", "c", "e");
    }

    public void show(int j){
        System.out.println(j);
    }

    public void show(String s){
        System.out.println(1);
        System.out.println(s);
    }

    // 可变个数的形参
    public void show(String ... strings){
        System.out.println(2);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
