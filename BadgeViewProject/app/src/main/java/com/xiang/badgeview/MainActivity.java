package com.xiang.badgeview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
   BadgeView badgeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView) findViewById(R.id.text);
//               1. setTargetView(View) --> 设置哪个控件显示数字提醒，参数就是一个view对象
//        2. setBadgeCount(int) --> 设置提醒的数字
//        3. setBadgeGravity(Gravity) --> 设置badgeview的显示位置
//        4. setBackgroundColor() --> 设置badgeview的背景色，当然还可以设置背景图片
//        5. setBackgroundResource() --> 设置背景图片
//        6. setTypeface() --> 设置显示的字体
//        7. setShadowLayer() --> 设置字体的阴影
        badgeView = new BadgeView(this);
        badgeView.setTargetView(text);
        badgeView.setBackground(12, Color.parseColor("#9b2eef"));
        badgeView.setBadgeCount(11);
    }
}
