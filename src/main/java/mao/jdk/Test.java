package mao.jdk;

import mao.t1.Student;
import mao.t1.StudentBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.jdk
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();

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

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Student next = iterator.next();
            System.out.println(next);
        }
    }
}
