package com.example.weiqi.time20160104dome;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected Button br1;
    protected ImageView im1;
    int number=1;
    protected ProgressBar prb1;
    protected ProgressBar prb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br1= (Button) findViewById(R.id.button);
        im1= (ImageView) findViewById(R.id.imageView);
        prb1= (ProgressBar) findViewById(R.id.progressBar);
        prb2= (ProgressBar) findViewById(R.id.progressBar2);
        br1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pbr22=prb2.getProgress();
                pbr22=pbr22+10;
                prb2.setProgress(pbr22);
                AlertDialog.Builder diao=new AlertDialog.Builder(MainActivity.this);
                diao.setTitle("测试测试测试真的是测试啊");
                diao.setMessage("测试正文");
                diao.setNegativeButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                diao.setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                diao.setNeutralButton("查看详情", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                if(prb1.getVisibility()==View.GONE){

                prb1.setVisibility(View.VISIBLE);
            }

                else{
                prb1.setVisibility(View.GONE);
            }
            if(number==1) {
                im1.setImageResource(R.drawable.dome2);
                number=0;
            }
                else{
                im1.setImageResource(R.drawable.dome1);
                number=1;
            }
            }
        });
    }
}
