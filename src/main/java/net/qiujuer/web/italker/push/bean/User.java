package net.qiujuer.web.italker.push.bean;

/**
 * Created by 范超 on 2017/6/21.
 */
public class User {
    private String name;
    private int sex;

    public User(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
