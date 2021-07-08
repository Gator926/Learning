/**
 * 万事万物皆对象
 *  1. 在java语言范畴中，将功能、结构封装到类中，通过类的实例化，来调用具体的功能结构
 *  2. 设计到java语言与前端、数据库交互时，有前后端的结构在java层面交互时，都提现为类、对象
 *
 * 内存解析
 *  1. 引用类型的变量，只课鞥存在两类值：null或地址值（含变量的类型）
 *
 *  匿名对象的使用
 *      理解：创建的对象，没有显示赋值一个变量名，即匿名对象
 *      特征：匿名对象只能调用一次
 *      使用：
 *          phoneMall phoneMall = new phoneMall();
 *          new phoneMall().show(new Phone());
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone);

        phone.sendEmail();
        phone.playGame();

        System.out.println("------------");
        // 匿名对象
        new Phone().sendEmail();
        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice();

        System.out.println("-------------");
        phoneMall phoneMall = new phoneMall();
        new phoneMall().show(new Phone());      // 匿名对象的使用
    }
}

class phoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void  showPrice(){
        System.out.println("手机价格为: " + price);
    }
}