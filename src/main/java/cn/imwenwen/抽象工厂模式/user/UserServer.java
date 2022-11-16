package cn.imwenwen.抽象工厂模式.user;

import cn.imwenwen.抽象工厂模式.pojo.User;

/**
 * @author chenwenwei
 */
public interface UserServer {
    public void insert(User user);
    public void getUser(String id);
}
