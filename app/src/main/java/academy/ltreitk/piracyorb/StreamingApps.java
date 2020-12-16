package academy.ltreitk.piracyorb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StreamingApps extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15;
    String[] urls = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streaming_apps);

        button1 = (Button) findViewById(R.id.StreamingAppsButton1);
        button2 = (Button) findViewById(R.id.StreamingAppsButton2);
        button3 = (Button) findViewById(R.id.StreamingAppsButton3);
        button4 = (Button) findViewById(R.id.StreamingAppsButton4);
        button5 = (Button) findViewById(R.id.StreamingAppsButton5);
        button6 = (Button) findViewById(R.id.StreamingAppsButton6);
        button7 = (Button) findViewById(R.id.StreamingAppsButton7);
        button8 = (Button) findViewById(R.id.StreamingAppsButton8);
        button9 = (Button) findViewById(R.id.StreamingAppsButton9);
        button10 = (Button) findViewById(R.id.StreamingAppsButton10);
        button11 = (Button) findViewById(R.id.StreamingAppsButton11);
        button12 = (Button) findViewById(R.id.StreamingAppsButton12);
        button13 = (Button) findViewById(R.id.StreamingAppsButton13);
        button14 = (Button) findViewById(R.id.StreamingAppsButton14);
        button15 = (Button) findViewById(R.id.StreamingAppsButton15);

        urls[0] ="https://www.kokotime.tv";
        urls[1] ="https://www.mobdro.bz";
        urls[2] ="https://cinemaapk.net";
        urls[3] ="https://fildo.net";
        urls[4] ="https://teatv.net";
        urls[5] ="https://cotomovies.com";
        urls[6] ="https://animeglare.xyz";
        urls[7] ="https://www1.animevibe.tv";
        urls[8] ="https://apollotv.xyz";
        urls[9] ="http://beetvapk.me";
        urls[10] ="https://cybercloud.media";
        urls[11] ="https://zionapp.live";
        urls[12] ="https://unlockmytv.com";
        urls[13] ="https://morpheustvapkdownload.com";
        urls[14] ="https://titaniumtv-app.com";


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
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[9]);
                startActivity(intent);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[10]);
                startActivity(intent);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[11]);
                startActivity(intent);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[12]);
                startActivity(intent);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[13]);
                startActivity(intent);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[14]);
                startActivity(intent);

            }
        });

    }
}
