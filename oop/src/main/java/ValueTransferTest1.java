/**
 * 方法形参的传递机制
 * 形参：方法定义时，生命的小括号内的参数
 * 实参：方法调用时，实际传递给形参的数据
 * <p>
 * 值传递机制：
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        // 交换变量值操作
        int tmp = m;
        m = n;
        n = tmp;
        System.out.println("m = " + m + ", n = " + n);
    }
}
