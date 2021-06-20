package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabBebidas_Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentBebidasAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bebidas);

        tabLayout = findViewById(R.id.tabLayout_Bebidas);
        pager2 = findViewById(R.id.viewpager_Bebidas);

        FragmentManager fm = getSupportFragmentManager();
        adaptador = new FragmentBebidasAdapter(fm, getLifecycle());
        pager2.setAdapter(adaptador);

        tabLayout.addTab(tabLayout.newTab().setText("Refrigerantes"));
        tabLayout.addTab(tabLayout.newTab().setText("Sucos"));
        tabLayout.addTab(tabLayout.newTab().setText("Cervejas"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}