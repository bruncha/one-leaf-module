package olm.utils;

import java.sql.*;
public class ConnDB {

    private Connection getConnection()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.err.println("在olm.utils.ConnDB中，数据库驱动未找到！！");
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/oneleafmodule?user=root&password=admin");
        }catch (SQLException e){
            System.err.println("在olm.utils.ConnDB中，数据库连接失败！！");
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 为DAO层提供查找功能
     * @param sql
     * @return Result结果集
     */
    public ResultSet executeQuery(String sql) {
        ResultSet resultSet = null;
        try {
            resultSet = getConnection().createStatement().executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("在olm.utils.ConnDB中，数据库在查找过程中出现异常！！");
            e.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 为DAO层提供更新功能
     * @param sql
     * @return 0：没有查到数据；
     *         否则返回更新数据表的行数
     */
    public int executeUpdate(String sql) {
        int rows = 0;
        try {
            rows = getConnection().createStatement().executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("在olm.utils.ConnDB中，数据库在查找过程中出现异常！！");
            e.printStackTrace();
        }
        return rows;
    }

}
