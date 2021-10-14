package com.yyzy.mydl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;
    private TextView username,password;
    private AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        dialog = new AlertDialog.Builder(MainActivity.this).create();
        View dialogView = View.inflate(MainActivity.this, R.layout.activity_main, null);
        dialog.setView(dialogView);
        dialog.setCancelable(false);
        dialog.show();


        username=dialogView.findViewById(R.id.edt1);
        password=dialogView.findViewById(R.id.edt2);
        button1=dialogView.findViewById(R.id.bottom1);
        button2=dialogView.findViewById(R.id.bottom2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mname="admin";
                String mpassw="admin123";
                String user=username.getText().toString();
                String passd=password.getText().toString();
                if (TextUtils.isEmpty(mname) || TextUtils.isEmpty(mpassw)) {
                    Toast.makeText(MainActivity.this, "用户名或密码不能为空!", Toast.LENGTH_SHORT).show();
                    return;
                }
                dialog.dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }
}
