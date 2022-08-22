package mao.t1;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Interface(接口名): StudentAggregate
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 20:04
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface StudentAggregate
{
    /**
     * 添加学生
     *
     * @param student Student
     */
    void addStudent(Student student);

    /**
     * 移除学生
     *
     * @param student Student
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器对象
     *
     * @param asc_or_desc 升序或者将序，输入0为升序，输入1为降序
     * @return StudentIterator实现类
     */
    StudentIterator getStudentIterator(int asc_or_desc);
}
