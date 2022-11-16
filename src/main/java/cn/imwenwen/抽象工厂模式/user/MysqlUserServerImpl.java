package cn.imwenwen.抽象工厂模式.user;

import cn.imwenwen.抽象工厂模式.pojo.User;
import cn.imwenwen.抽象工厂模式.user.UserServer;

/**
 * @author chenwenwei
 */
public class MysqlUserServerImpl implements UserServer {
    @Override
    public void insert(User user) {
        System.out.println("mysql中添加用户");
    }

    @Override
    public void getUser(String id) {
        System.out.println("mysql中获取用户");
    }
}
