package olm.users.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import olm.users.entity.User;
import olm.utils.ConnDB;

public class UserDao {
    ConnDB connDB = new ConnDB();

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        ResultSet resultSet = connDB.executeQuery("SELECT * FROM olm_user");
        try{
            while(resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String user_name = resultSet.getString("user_name");
                String user_passwd = resultSet.getString("user_passwd");
                String user_introduction = resultSet.getString("user_introduction");
                users.add(new User(id, user_name, user_passwd, user_introduction));
            }
        } catch (SQLException e) {
            System.err.println("在olm.users.controller中，字段的查找出现异常！！");
            e.printStackTrace();
        }
        return users;
    }
}
