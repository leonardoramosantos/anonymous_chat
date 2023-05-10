package com.example.anonymous_chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_chat_menu_options, menu);

        return true;
    }

    public void onAboutSystemClick(MenuItem menu) {
        Intent aboutSystemIntent = new Intent(this, AboutSystemActivity.class);
        startActivity(aboutSystemIntent);
    }
}