package ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

import ui.activityImpl.FinesActivityImpl;
import ui.activityImpl.ThucHanhActivityImpl;
import ui.activityImpl.TrafficSignsActivityImpl;

public class MainActivity extends AppCompatActivity {

    private Button btnFines;
    private Button btnThiThu;
    private Button btnLyThuyet;
    private Button btnHocSaHinh;
    private Button btnHocBienBao;
    private Button btnThucHanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Lý thuyết bằng lái xe A1");
        actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getApplicationContext(),R.color.toolbar2)));
        btnFines = findViewById(R.id.btnFines);
        btnThiThu = findViewById(R.id.btnThithu);
        btnLyThuyet = findViewById(R.id.btnLythuyet);
        btnHocSaHinh = findViewById(R.id.btnHocSaHinh);
        btnHocBienBao = findViewById(R.id.btnHocBienBao);
        btnThucHanh = findViewById(R.id.btnThuchanh);

        btnFines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FinesActivityImpl.class);
                startActivity(intent);
            }
        });
        btnHocBienBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), TrafficSignsActivityImpl.class);
                startActivity(intent);
            }
        });
        btnThucHanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThucHanhActivityImpl.class);
                startActivity(intent);
            }
        });

    }

    // test commit 4
}
