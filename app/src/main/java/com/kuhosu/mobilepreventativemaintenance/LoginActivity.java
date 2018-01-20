package com.kuhosu.mobilepreventativemaintenance;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginActivity extends AppCompatActivity {

    private static final String url = "jdbc:mysql://10.0.2.2:8080/mpmgfm";
    private static final String user = "root";
    private static final String pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remarks);

//        Button loginBtn = (Button) findViewById(R.id.loginBtn);
//
//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new MyTask().execute();
//            }
//        });

    }

    private class MyTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... params) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,user,pass);

                Statement st = con.createStatement();
                String query = "select * from team";

                final ResultSet rs = st.executeQuery(query);
                rs.next();
            }
            catch (Exception e){
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Log.d("login", "success");
            super.onPostExecute(aVoid);
        }
    }
}
