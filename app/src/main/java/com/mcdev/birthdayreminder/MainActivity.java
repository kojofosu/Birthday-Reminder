package com.mcdev.birthdayreminder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.fridayof1995.tabanimation.SnapTabLayout;
import com.mcdev.birthdayreminder.Adapters.ViewpagerAdapter;

public class MainActivity extends AppCompatActivity {
    SnapTabLayout snapTabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        init();

        //initializing viewpager
        initViewpager();

        snapTabLayout.setNumOfTabs(SnapTabLayout.NumOfTabs.THREE);
        snapTabLayout.smallCenterButton.setImageResource(R.drawable.ic_ring);
        snapTabLayout.largeCenterButton.setImageResource(R.drawable.ic_baseline_cake_24);
        snapTabLayout.startButton.setImageResource(R.drawable.ic_baseline_group_24);
        snapTabLayout.endButton.setImageResource(R.drawable.ic_baseline_group_work_24);
        snapTabLayout.setupWithViewPager(viewPager);
        snapTabLayout.setVpTransitionBgColors( R.color.colorRed, R.color.colorSideTab,R.color.colorPrimaryDark);

//        snapTabLayout.setBackgroundCollapsed(R.color.colorAccent); // By default black fall gradient.
//        snapTabLayout.setBackgroundExpanded(R.color.colorPrimaryDark);

    }

    private void init() {
        snapTabLayout = findViewById(R.id.snapTabLayout);
        viewPager = findViewById(R.id.viewpager);
    }

    private void initViewpager() {
        ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);       //initializing the view pager
        viewPager.setAdapter(adapter);      //setting view pager's adapter with contents in the viewpager adapter class
        viewPager.setOffscreenPageLimit(3);     //increasing the limit for screens to lose cache to three
//        viewPager.setCurrentItem(0);        //setting default page to position 0
    }
}