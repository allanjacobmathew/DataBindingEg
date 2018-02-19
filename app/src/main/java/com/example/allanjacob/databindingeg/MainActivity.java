package com.example.allanjacob.databindingeg;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.allanjacob.databindingeg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
       User user= new User();
       user.setName("ALLAN");
       binding.setUser(user);
       binding.setActivity(this);
    }
    public void onButtonClick(String email){
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
        
    }
}
