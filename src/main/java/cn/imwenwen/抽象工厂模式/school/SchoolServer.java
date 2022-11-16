package cn.imwenwen.抽象工厂模式.school;

import cn.imwenwen.抽象工厂模式.pojo.School;

public interface SchoolServer {
    public void insert(School school);
    public void getSchool(String id);
}
