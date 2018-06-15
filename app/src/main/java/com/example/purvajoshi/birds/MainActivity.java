package com.example.purvajoshi.birds;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPage = (ViewPager) findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Bulbul", "Chicken", "Crow", "Dodo", "Duck", "Eagle", "Flemingo", "Owl", "Parrot", "penguin", "piegon", "Sparrow"};

        public MyOwnPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new Bulbul();
            }
            if (position == 1) {
                return new Chicken();
            }
            if (position == 2) {
                return new Crow();
            }
            if (position == 3) {
                return new Dodo();
            }
            if (position == 4) {
                return new Duck();
            }
            if (position == 5) {
                return new Eagle();

            }
            if (position == 6) {
                return new Flemingo();
            }
            if (position == 7) {
                return new Owl();
            }
            if (position == 8) {
                return new Parrot();
            }
            if (position == 9) {
                return new Penguin();
            }
            if (position == 10) {
                return new Piegon();
            }
            if (position == 11) {
                return new Sparrow();
            }

            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }

    }
}




