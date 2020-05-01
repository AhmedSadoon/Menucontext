package com.example.menucontextual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View view) {

        PopupMenu popupMenu=new PopupMenu(this,view);
        MenuInflater menuInflater=popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.popup_actions,popupMenu.getMenu());
        PopupMenuEvent popupMenuEvent=new PopupMenuEvent(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popupMenuEvent);
        popupMenu.show();

    }
}
