package academy.ltreitk.piracyorb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModApps extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String[] urls = new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_apps);

        button1 = (Button) findViewById(R.id.ModAppsButton1);
        button2 = (Button) findViewById(R.id.ModAppsButton2);
        button3 = (Button) findViewById(R.id.ModAppsButton3);
        button4 = (Button) findViewById(R.id.ModAppsButton4);
        button5 = (Button) findViewById(R.id.ModAppsButton5);
        button6 = (Button) findViewById(R.id.ModAppsButton6);
        button7 = (Button) findViewById(R.id.ModAppsButton7);
        button8 = (Button) findViewById(R.id.ModAppsButton8);
        button9 = (Button) findViewById(R.id.ModAppsButton9);

        urls[0] ="https://www.mobilism.org";
        urls[1] ="https://en.aptoide.com";
        urls[2] ="https://onhax.me";
        urls[3] ="https://www.apkmirror.com";
        urls[4] ="https://apkpure.com";
        urls[5] ="https://acmarket.net";
        urls[6] ="https://blackmod.net";
        urls[7] ="https://android-zone.ws";
        urls[8] ="https://www.revdl.com";

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[0]);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[1]);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[2]);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[3]);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[4]);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[5]);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[6]);
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[7]);
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[8]);
                startActivity(intent);

            }
        });
    }
}
