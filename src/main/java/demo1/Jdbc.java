package demo1;

import org.junit.Test;

import java.sql.*;

/**
 * \Date: 2017/12/23
 * \
 * \Description:
 * \
 */
public class Jdbc {

    @Test
    public void demo1() {

        try {
            // 1.加载驱动
            //  DriverManager.registerDriver(new Driver());// 会导致驱动注册两次。
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");

            // 3.创建执行SQL语句的对象，并且执行SQL
            String sql = "select * from user";
            // 3.1创建执行sql的对象
            Statement statement = connection.createStatement();

            // 3.2执行sql
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");

                System.out.println(uid + "   " + username + "   " + password + "   " + name);
            }
            // 4.释放资源
            resultSet.close();
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    /**
     * JDBC资源的释放
     */
    public void demo2(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1.加载驱动
//			DriverManager.registerDriver(new Driver());// 会导致驱动注册两次。
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获得连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "root");
            // 3.创建执行SQL语句的对象，并且执行SQL
            // 3.1创建执行sql的对象
            String sql = "select * from user";
            stmt = conn.createStatement();
            // 3.2执行sql
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int uid = rs.getInt("uid");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String name = rs.getString("name");

                System.out.println(uid+"   "+username+"   "+password+"   "+name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            // 4.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { // ignore

                }

                rs = null;
            }

            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;// 垃圾回收机制更早回收对象。
            }
        }
    }
}
