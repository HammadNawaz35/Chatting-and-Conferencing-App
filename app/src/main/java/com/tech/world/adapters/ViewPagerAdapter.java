package com.tech.world.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.tech.world.activities.main.MeetingsFragment;
import com.tech.world.activities.main.calls.CallsFragment;
import com.tech.world.activities.main.chats.FragmentChats;
import com.tech.world.activities.main.status.StatusFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private int count = 4;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentChats();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            case 3:
                return new MeetingsFragment();
            default:
                throw new IllegalStateException("Not implemented Fragment exception");
        }

    }

    @Override
    public int getCount() {
        return count;

    }



}
