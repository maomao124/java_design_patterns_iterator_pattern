package mao.t1;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Interface(接口名): StudentIterator
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface StudentIterator
{
    /**
     * Has next boolean.
     *
     * @return the boolean
     */
    boolean hasNext();

    /**
     * Next student.
     *
     * @return the student
     */
    Student next();
}
