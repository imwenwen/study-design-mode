package cn.imwenwen.抽象工厂模式.user;

import cn.imwenwen.抽象工厂模式.pojo.User;
import cn.imwenwen.抽象工厂模式.user.UserServer;

public class MongoDbUserServerImpl implements UserServer {
    @Override
    public void insert(User user) {
        System.out.println("MongoDb中添加用户");
    }

    @Override
    public void getUser(String id) {
        System.out.println("MongoDb中获取用户");
    }
}
