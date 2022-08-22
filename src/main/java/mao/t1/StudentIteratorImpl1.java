package mao.t1;

import java.util.List;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Class(类名): StudentIteratorImpl1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 19:58
 * Version(版本): 1.0
 * Description(描述)： 升序
 */

public class StudentIteratorImpl1 implements StudentIterator
{
    private final List<Student> list;
    private int position = 0;

    /**
     * Instantiates a new Student iterator impl 1.
     *
     * @param list the list
     */
    public StudentIteratorImpl1(List<Student> list)
    {
        this.list = list;
    }

    @Override
    public boolean hasNext()
    {
        return position < list.size();
    }

    @Override
    public Student next()
    {
        Student student = list.get(position);
        position++;
        return student;
    }
}
