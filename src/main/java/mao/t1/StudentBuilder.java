package mao.t1;

/**
 * Project name(项目名称)：java设计模式_迭代器模式
 * Package(包名): mao.t1
 * Class(类名): StudentBuilder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/22
 * Time(创建时间)： 19:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class StudentBuilder
{
    private Long id;
    private String name;
    private String sex;
    private Integer age;

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public StudentBuilder setId(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @return the name
     */
    public StudentBuilder setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     * @return the sex
     */
    public StudentBuilder setSex(String sex)
    {
        this.sex = sex;
        return this;
    }

    /**
     * Sets age.
     *
     * @param age the age
     * @return the age
     */
    public StudentBuilder setAge(Integer age)
    {
        this.age = age;
        return this;
    }

    /**
     * Build student.
     *
     * @return the student
     */
    public Student build()
    {
        return new Student(id, name, sex, age);
    }
}
