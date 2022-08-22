package mao.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Class(类名): StudentAggregateImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class StudentAggregateImpl implements StudentAggregate
{
    private final List<Student> studentList;

    public StudentAggregateImpl()
    {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student)
    {
        studentList.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator(int asc_or_desc)
    {
        if (asc_or_desc == 0)
        {
            return new StudentIteratorImpl1(studentList);
        }
        else if (asc_or_desc == 1)
        {
            return new StudentIteratorImpl2(studentList);
        }
        else
        {
            throw new RuntimeException("输入的数字不合法！ 当前参数asc_or_desc的值为" + asc_or_desc + "，此产参数值只能为0或者1");
        }
    }
}
