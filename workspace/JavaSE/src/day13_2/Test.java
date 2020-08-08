package day13_2;

public class Test {
    @org.junit.Test
    public void test() {
        Employee e1 = new Employee();

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("时磊");
        //CloneNotSupportedException
        //要实现克隆对象 被克隆对象必须实现Cloneable接口
        Employee e2 = (Employee) e1.clone();
        System.out.println(e1 == e2);//false e1 e2不是同一个对象

        //修改前
        System.out.println(e1);
        System.out.println(e2);//不会改变值
        //修改后
        e2.getDept().setDeptName("技术部");
        e2.getDept().setNo(1);
        System.out.println(e1);
        System.out.println(e2);
        //结果：
        //Employee{id=1, name='时磊', salary=null, dept=Dept{deptName='技术部', no=1}}
        //Employee{id=1, name='时磊', salary=null, dept=Dept{deptName='技术部', no=1}}
        //e1 e2都同时改变
        //浅克隆，只会克隆基本类型和String
        //引用类型的属性不会克隆（默认不支持）   因为两个都同时指向一个对象

        //这种情况就需要使用深克隆
        //深克隆:引用类型的属性也要实现Cloneable接口


    }
}
