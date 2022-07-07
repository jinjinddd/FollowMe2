package com.example.sd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button CourseButton = (Button) findViewById(R.id.CourseButton);
        final Button statisticsButton = (Button) findViewById(R.id.statisticsButton);
        final Button scheduleButton = (Button) findViewById(R.id.scheduleButton);
        final Button MemoButton = (Button) findViewById(R.id.MemoButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);


        CourseButton.setOnClickListener(new View.OnClickListener() {       //강의 클릭시
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                CourseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                MemoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new CourseFragment());
                fragmentTransaction.commit();
            }
        });
        scheduleButton.setOnClickListener(new View.OnClickListener() {    //시간표 클릭시
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                CourseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                MemoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ScheduleFragment());
                fragmentTransaction.commit();


            }

        });
        statisticsButton.setOnClickListener(new View.OnClickListener() {      //통계 클릭시
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.GONE);
                CourseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                MemoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new StatisticsFragment());
                fragmentTransaction.commit();


            }
        });

        MemoButton.setOnClickListener(new View.OnClickListener() {           //메모 클릭시
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MemoActivity.class);
                startActivity(intent);
            }
        });
    }


    public void onButton1Clicked(View view){
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www4.chosun.ac.kr/acguide/9326/subview.do"));
    }
    public void onButton2Clicked(View view){
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://sw.chosun.ac.kr/home/kor/board.do?menuPos=62"));
    }
    public void onButton3Clicked(View view){
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://sw.chosun.ac.kr/home/kor/board.do?menuPos=62"));
    }
}