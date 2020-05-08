package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DoctorsAdmin extends AppCompatActivity {
    ListView p1;
    TextView t1;
    Button btn1;

    private static final String FILE_NAME="userData.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_admin);
        String message = "";

        Bundle bundle = getIntent().getExtras();


        message =  bundle.getString("message");



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.doc);

        t1= findViewById(R.id.userDetails);

        if(message.equals("")){
            t1.setText("no patients");
        }else{
            t1.setText(message);
        }



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                , bookAppointment.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.doc:

                        return true;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                , HealthEducation.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , HealthEducation.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });



    }
    public void start(){
        t1.setText("yoyoyo");
    }
    public void load(){
        String json;
        String print="";
        try {

            FileInputStream fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bt= new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            if((text=bt.readLine())==""){
                t1.setText("You currently have no patients");
            }else{


            while((text=bt.readLine())!=null){
                sb.append(text).append("\n");
            }
            json=sb.toString();


            JSONArray jsonArray = new JSONArray(json);

            for(int i =0;i<jsonArray.length();i++){

                JSONObject obj =  jsonArray.getJSONObject(i);

                print="Date :12/18/19"+"\n";
                print= print + obj.getString("fname").toString()+"\n";
                print= print + obj.getString("lname").toString()+"\n";
                print= print + obj.getString("age").toString()+"\n";
                print= print + obj.getString("lvd").toString()+"\n";
                print= print + obj.getString("lastDate").toString()+"\n";
                print= print + obj.getString("Reason").toString()+"\n";
                print= print + obj.getString("Appointment").toString()+"\n";

            }
            final Random rand = new Random();
            t1.setText(print);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e){
            e.printStackTrace();
        }

    }

}
