package cn.imwenwen.抽象工厂模式.school;

import cn.imwenwen.抽象工厂模式.pojo.School;
import cn.imwenwen.抽象工厂模式.school.SchoolServer;

/**
 * @author chenwenwei
 */
public class MysqlSchoolServerImpl implements SchoolServer {


    @Override
    public void insert(School school) {
        System.out.println("mysql中添加学校");

    }

    @Override
    public void getSchool(String id) {
        System.out.println("mysql中获取学校");

    }
}
