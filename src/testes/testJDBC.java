package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.oi
 */
/**
 *
 * @author u10549640177
 */
public class testJDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, use, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_victor_cardoso";
            use = "victor_cardoso";
            password = "victor_cardoso";
            Connection cnt;
            cnt = DriverManager.getConnection(url, use, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(testJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}