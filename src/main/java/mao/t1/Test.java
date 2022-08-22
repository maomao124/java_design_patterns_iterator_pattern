package mao.t1;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:11
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        StudentAggregate studentAggregate = new StudentAggregateImpl();

        Student student = new StudentBuilder().setId(1L).build();
        Student student1 = new StudentBuilder().setId(2L)
                .setName("张珊珊")
                .setAge(18)
                .setSex("女").
                build();

        Student student2 = new StudentBuilder()
                .setId(3L)
                .setName("王五")
                .build();

        Student student3 = new StudentBuilder()
                .setId(4L)
                .setName("张八")
                .setSex("男")
                .setAge(19)
                .build();

        studentAggregate.addStudent(student);
        studentAggregate.addStudent(student1);
        studentAggregate.addStudent(student2);
        studentAggregate.addStudent(student3);

        StudentIterator studentIterator = studentAggregate.getStudentIterator(0);
        while (studentIterator.hasNext())
        {
            Student next = studentIterator.next();
            System.out.println(next);
        }

        System.out.println("----------");

        studentIterator = studentAggregate.getStudentIterator(1);
        while (studentIterator.hasNext())
        {
            Student next = studentIterator.next();
            System.out.println(next);
        }

        System.out.println("----------");

        //测试异常
        studentAggregate.getStudentIterator(3);
    }
}
