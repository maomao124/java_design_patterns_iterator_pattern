package mao.t1;

import java.util.List;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Class(类名): StudentIteratorImpl2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class StudentIteratorImpl2 implements StudentIterator
{
    private final List<Student> list;
    private int position;

    /**
     * Instantiates a new Student iterator impl 2.
     *
     * @param list the list
     */
    public StudentIteratorImpl2(List<Student> list)
    {
        this.list = list;
        position = list.size() - 1;
    }


    @Override
    public boolean hasNext()
    {
        return position >= 0;
    }

    @Override
    public Student next()
    {
        Student student = list.get(position);
        position--;
        return student;
    }
}
