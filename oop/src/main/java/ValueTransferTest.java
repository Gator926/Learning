import javax.xml.transform.Source;

/**
 * 关于变量的赋值:
 *      如果变量是基本数据类型，此时赋值的是变量所保存的数据值
 *      如果变量是引用数据类型，此时赋值的是变量所爆粗的地址值
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;      // 值拷贝

        System.out.println("m = " + m + ", n = " + n);
        n = 20;
        System.out.println("m = " + m + ", n = " + n);
        m = 12;
        System.out.println("m = " + m + ", n = " + n);

        // 引用类型
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println(o1.orderId + " " + o2.orderId);
        o2.orderId = 2000;
        System.out.println(o1.orderId + " " + o2.orderId);
    }
}

class Order {
    int orderId;
}