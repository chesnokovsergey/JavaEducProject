package com.sschesnokov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by SSCHesnokov on 22.07.2016.
 */
public class ConnectMSSQLServer {

        public void dbConnect(String db_connect_string,
                              String db_userid,
                              String db_password) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(db_connect_string,
                        db_userid, db_password);
                System.out.println("connected");
                Statement statement = conn.createStatement();
                //String queryString = "select * from sysobjects where type='u'";
                //ResultSet rs = statement.executeQuery(queryString);
                //while (rs.next()) {
                //    System.out.println(rs.getString(1));
                //}
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
