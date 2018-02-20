package com.example.antko.mytestandroidapplication;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.antko.mytestandroidapplication.R;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button) findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Создание диалогового окна
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);

                // Заголовок окна
                builder.setTitle("Текущее время");

                // Значение положительного ответа пользователя
                builder.setPositiveButton("Ok", null);

                // Сообщение с текущим временем и датой
                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                builder.setMessage(currentDateTimeString);

                // Создание и отображение окна
                AlertDialog theAlertDialog = builder.create();
                theAlertDialog.show();

            }
        });
    }
}