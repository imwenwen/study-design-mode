package cn.imwenwen.抽象工厂模式;

import cn.imwenwen.抽象工厂模式.school.SchoolServer;
import cn.imwenwen.抽象工厂模式.user.UserServer;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author chenwenwei
 */
public class ReflectFactory {
    public String getDb(){
        String db ="";
        Properties properties = new Properties();
        try{
            //这里我的 db.properties放在resources 才能读取
            InputStream in = ReflectFactory.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(in);
            db = properties.getProperty("db");
        }catch (Exception e){
            System.out.println(e);
        }
        return db;
    }

    public static void main(String[] args) {
        ReflectFactory reflectFactory =new ReflectFactory();
        System.out.println(reflectFactory.getDb());
    }

    public Class<?> getSqlFactory(String pge,String type) throws ClassNotFoundException{
        String className ="cn.imwenwen.抽象工厂模式."+pge+getDb()+type;
        System.out.println("读取配置文件db.properties:"+getDb());
        Class<?> clz = Class.forName(className);
        //System.out.println(clz.getName());
        return clz;
    }


    public UserServer createUserServer()throws Exception{
        Class<?> clz = getSqlFactory("user.","UserServerImpl");
        UserServer userServer =(UserServer) clz.newInstance();
        //System.out.println(userServer);
        return userServer;
    }
    public SchoolServer createSchoolServer()throws Exception{
        Class<?> clz = getSqlFactory("school.","SchoolServerImpl");
        SchoolServer schoolServer =(SchoolServer) clz.newInstance();
        //System.out.println(schoolServer);
        return schoolServer;
    }

}
