package com.ed.will.fanweather.view.activity;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.design.widget.NavigationView;

import com.ed.will.fanweather.R;
import com.ed.will.fanweather.model.Weather;
import com.ed.will.fanweather.retrofit.APIService;
import com.ed.will.fanweather.utils.LogUtils;
import com.ed.will.fanweather.view.fragment.IndexFragment;
import com.ed.will.fanweather.view.fragment.NextFragment;
import com.ed.will.fanweather.view.fragment.SettingsFragment;

import java.util.ArrayList;
import java.util.List;


import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {
    private static String baseUrl="http://api.heweather.com/x3/";
    private static String key="ed1617ef14784185b2e20c79aeea32a3";

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private ImageView userAvatarIv;
    private TextView userNameTv;

    private String[] drawerTitles = {"今日天气", "未来4天", "设置"};
    private List<Fragment> fragmentList;
    private Class[] classes = {IndexFragment.class, NextFragment.class, SettingsFragment.class};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getWeatherDate();//获取天气信息

        fragmentList=new ArrayList<>();
        for(int i=0;i<4;i++){
            fragmentList.add(null);
        }

        findViews();
        selectItem(0);//默认选中第一个

    }

    private void selectItem(int position) {
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        //先隐藏所有fragment
        for (Fragment fragment : fragmentList) {
            if (null != fragment) fragmentTransaction.hide(fragment);
        }

        Fragment fragment;
        if (null == fragmentList.get(position)) {
            Bundle bundle = new Bundle();
            bundle.putString("title", drawerTitles[position]);
            fragment = Fragment.instantiate(this, classes[position].getName(), bundle);
            fragmentList.set(position, fragment);
            // 如果Fragment为空，则创建一个并添加到界面上
            fragmentTransaction.add(R.id.main_content_fl, fragment);
        } else {
            // 如果Fragment不为空，则直接将它显示出来
            fragment = fragmentList.get(position);

            fragmentTransaction.show(fragment);
            LogUtils.i("TAG","showfragment:"+position);
        }
        fragmentTransaction.commit();

        setTitle(drawerTitles[position]);

    }

    private void findViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        ((LinearLayout.LayoutParams) mToolbar.getLayoutParams()).setMargins(0, 0, 0, 0);
        setSupportActionBar(mToolbar);
        ActionBar ab = getSupportActionBar();
        if (null != ab) {
            ab.setHomeAsUpIndicator(R.mipmap.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }

        mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id._main_navigation_view);

        setupDrawerContent(mNavigationView);

    }

    private void setupDrawerContent(NavigationView mNavigationView) {
        View headerView = LayoutInflater.from(this).inflate(R.layout.view_navigation_header, null);
        userAvatarIv = (ImageView) headerView.findViewById(R.id.navigation_header_view_avatar_iv);
        userAvatarIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (true) {
                    jumpToActivity(MainActivity.this, LoginActivity.class, null);
                } else {
                    ActivityOptionsCompat compat = ActivityOptionsCompat
                            .makeSceneTransitionAnimation(MainActivity.this, v, getString(R.string.shared_elements_avatar_iv));
                    ActivityCompat.startActivity(MainActivity.this, new Intent(MainActivity.this, PersonalActivity.class), compat.toBundle());
                }
            }
        });
        userNameTv = (TextView) headerView.findViewById(R.id.navigation_header_view_name_tv);

        mNavigationView.addHeaderView(headerView);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_index://首页
                        selectItem(0);
                        menuItem.setChecked(true);
                        break;
                    case R.id.nav_next://
                        selectItem(1);
                        menuItem.setChecked(true);
                        break;
                    case R.id.nav_settings://设置
                        selectItem(2);
                        menuItem.setChecked(true);
                        break;
                    case R.id.nav_personal://个人信息
                        if (true) {
                            jumpToActivity(MainActivity.this, LoginActivity.class, null);
                        } else {
                            jumpToActivity(MainActivity.this, PersonalActivity.class, null);
                        }
                        break;
                    case R.id.nav_favorite://我的收藏

                }

                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }



}
