package org.example.jdbc;
import java.sql.*;
public class DemoJdbc {
    public static void main(String args[]){

        /*
         * import packages
         * create connection
         * create statement
         * execute statement
         * progress result
         * close
         */
        String url="jdbc:mysql://localhost:3306/project_rms";//URL
        String user="(User Name)";//This is dummy data
        String pass="(Password)";//This is dummy data -check your Username and Password from MySql

        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating a Connection
            Connection con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection Established");

            //Creating a Statement
            Statement st = con.createStatement();

            //Executing Query
            ResultSet rs= st.executeQuery("select subjectname from practical");
            rs.next();

            //Giving information about which columns data is required
            String data = rs.getString("subjectname");

            //Progressing the result
            System.out.println(data);

            //Closing the connection
            con.close();
            System.out.println("Connection closed");

        }catch(Exception e){
            System.out.println("Error occur");
        }

    }
}
