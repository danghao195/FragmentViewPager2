package com.example.danghao195.myfragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.danghao195.myfragment.fragment.ChatFragment;
import com.example.danghao195.myfragment.fragment.HomeFragment;
import com.example.danghao195.myfragment.MainActivity;

public class CommonAdapter extends FragmentPagerAdapter {
    public CommonAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // position + 1 vì position bắt đầu từ số 0.
        if(position == 0){
            return  HomeFragment.newInstance("abc");
        } else if( position == 1){
            return ChatFragment.newInstance("phần tạo view chat");
        }
        return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home Page";
            case 1:
                return "Chat Room";
            case 2:
                return "Profile";
        }
        return null;
    }

}
