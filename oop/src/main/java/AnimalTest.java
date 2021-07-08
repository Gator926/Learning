/**
 * 面向对象的特征一：封装和隐藏
 * 问题引入
 *      当我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行复制，这里赋值操作受到
 *      属性的数据类型和存储范围的制约。但是除此之外，没有其他制约条件，但是问题中，我们需要给属性加入额外
 *      的限制条件。不能在属性声明时提现，我们只能通过方法进行限制条件的添加。（比如：setLegs())
 *
 *      同时，我们需要避免用户再时间“对象.属性”的方式对属性进行赋值。则需要将属性声明为私有的（private）
 *      此时，针对属性就体现了封装性
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "大黄";
        animal.age = 1;

        animal.show();

        animal.setLegs(6);
        animal.show();
    }
}

class Animal{
    String name;
    int age;
    private int legs;

    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0){
            legs = 1;
        } else {
            legs = 0;
        }
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
    }
}