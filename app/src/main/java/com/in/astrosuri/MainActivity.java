package com.in.astrosuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.in.fragment.BirthDetails;
import com.in.fragment.History;
import com.in.fragment.HomePage;
import com.in.fragment.MyAccount;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    LinearLayout nav_Home,nav_History,nav_ConsuilNow,nev_MyAccount;
    NavigationView navigationView;
    DrawerLayout MyDrawer;
    RelativeLayout nav_Myaccount,nav_brithDetails,nav_history,nav_walletHistory,nav_Logout;
    TextView showtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nev_MyAccount = findViewById(R.id.nev_MyAccount);
        nav_Home = findViewById(R.id.nav_Home);
        nav_History = findViewById(R.id.nav_History);
        nav_ConsuilNow = findViewById(R.id.nav_ConsuilNow);
        navigationView = findViewById(R.id.navigationView);
        MyDrawer = findViewById(R.id.MyDrawer);
        showtext = findViewById(R.id.showtext);

        getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,new HomePage()).addToBackStack(null).commit();

        navigationView.setNavigationItemSelectedListener(this);
        View header = navigationView.getHeaderView(0);
        nav_Myaccount = header.findViewById(R.id.nav_Myaccount);
        nav_brithDetails = header.findViewById(R.id.nav_brithDetails);
        nav_history = header.findViewById(R.id.nav_history);
        nav_Logout = header.findViewById(R.id.nav_Logout);
        nav_walletHistory = header.findViewById(R.id.nav_walletHistory);

        nav_Myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                closeDrewlayout(MyDrawer);

                FragmentTransaction fragmentManager = getSupportFragmentManager().beginTransaction();
                MyAccount myAccount = new MyAccount();
                fragmentManager.replace(R.id.framLayout,myAccount);
                fragmentManager.addToBackStack(null);
                fragmentManager.commit();

                showtext.setText("My Account");


            }
        });

        nav_brithDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                closeDrewlayout(MyDrawer);

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                BirthDetails birthDetails = new BirthDetails();
                fragmentTransaction.replace(R.id.framLayout,birthDetails);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                showtext.setText("Brith Details");
            }
        });

        nav_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                closeDrewlayout(MyDrawer);

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                History history = new History();
                fragmentTransaction.replace(R.id.framLayout,history);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                showtext.setText("History");
            }
        });

         nav_Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Show Your Another AlertDialog
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.condition_logout);
                dialog.setCancelable(false);
                Button btn_No = dialog.findViewById(R.id.no);
                TextView textView = dialog.findViewById(R.id.editText);
                Button btn_Yes = dialog.findViewById(R.id.yes);

                btn_Yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //SharedPrefManager.getInstance(MainActivity.this).logout();

                        dialog.dismiss();
                       /* System.exit(1);
                        finish();*/

                        Intent intent = new Intent(MainActivity.this,LoginPage.class);
                        startActivity(intent);

                    }
                });
                btn_No.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.dismiss();
                    }
                });

                dialog.show();
                Window window = dialog.getWindow();
                window.setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                window.setBackgroundDrawableResource(R.drawable.edittextback);
            }
        });



        nav_Home.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor_buttom));

        nav_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nav_Home.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor_buttom));
                nev_MyAccount.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_History.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_ConsuilNow.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));

                getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,new HomePage()).addToBackStack(null).commit();

                showtext.setText("Home");
            }
        });

        nev_MyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nav_Home.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nev_MyAccount.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor_buttom));
                nav_History.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_ConsuilNow.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));

                getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,new MyAccount()).addToBackStack(null).commit();

                showtext.setText("My Account");
            }
        });

        nav_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nav_Home.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nev_MyAccount.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_History.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor_buttom));
                nav_ConsuilNow.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));

                getSupportFragmentManager().beginTransaction().replace(R.id.framLayout,new History()).addToBackStack(null).commit();

                showtext.setText("History");
            }
        });

        nav_ConsuilNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nav_Home.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nev_MyAccount.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_History.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor3));
                nav_ConsuilNow.setBackgroundColor(MainActivity.this.getResources().getColor(R.color.astrocolor_buttom));

            }
        });
    }

    public void ClickMenu(View view){

        openDrawerlayout(MyDrawer);
    }

    public void openDrawerlayout(DrawerLayout drawerLayout){

        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void closeDrewlayout(DrawerLayout drawerLayout){

        drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull  MenuItem item) {

        closeDrewlayout(MyDrawer);

        return true;
    }
}