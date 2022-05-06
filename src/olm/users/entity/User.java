package olm.users.entity;

public class User {
    private int id;
    private String name;
    private String passwd;
    private String introduction;

    public User(int id, String user_name, String user_passwd, String user_introduction) {
        this.id = id;
        this.name = user_name;
        this.passwd = user_passwd;
        this.introduction = user_introduction;
    }
    /*------  getter和setter... ------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
