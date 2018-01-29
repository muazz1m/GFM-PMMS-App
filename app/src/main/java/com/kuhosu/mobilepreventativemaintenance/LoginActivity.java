package com.kuhosu.mobilepreventativemaintenance;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private static final String url = "jdbc:mysql://10.0.2.2:3306/mpmgfm";
    private static final String user = "root";
    private static final String pass = "";

    @BindView(R.id.loginBtn) Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.loginBtn)
    public void onClickLoginBtn(){
        Log.d("login", "clicked");
//        new MyTask().execute();
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
        finish();

    }

    private class MyTask extends AsyncTask<String, Void, Void>{

//        @Override
//        protected Void doInBackground(Void... params) {
//            Log.d("login", "processing");
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection(url,user,pass);
//
//                Statement st = con.createStatement();
//                String query = "select * from team";
//
//                final ResultSet rs = st.executeQuery(query);
//                rs.next();
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//
//            return null;
//        }

        @Override
        protected Void doInBackground(String... urls) {
            try {
                Log.d("login", "processing");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection conn = DriverManager.getConnection(url, user,
                        pass);
                Statement stmt = conn.createStatement();
                String sql = "select name from team";
                ResultSet rs = stmt.executeQuery(sql);

                List<String> actions = new ArrayList<String>();
                while (rs.next()) {
                    actions.add(rs.getString("name"));
                }
            } catch (Exception e) {
                Log.d("MySQLConnection", e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d("login", "success");
            super.onPostExecute(aVoid);
//            Intent intent = new Intent(getBaseContext(), MainActivity.class);
//            startActivity(intent);
//            finish();
        }
    }

//    public void init() throws IllegalAccessException, InstantiationException,
//            ClassNotFoundException, SQLException {
//
//        Class.forName("com.mysql.jdbc.Driver").newInstance();
//        try {
//            conn = DriverManager.getConnection(CONNECTION_URL, user, pass);
//        } catch (java.sql.SQLException e1) {
//            e1.printStackTrace();
//        }
//        try {
//
//            stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT title FROM books");
//            String entry;
//            while (rs.next()){
//                entry = rs.getString(1);
//            }
//            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (java.sql.SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
}
