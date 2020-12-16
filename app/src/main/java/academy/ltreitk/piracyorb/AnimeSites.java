package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimeSites extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button10, button11, button12, button13, button14, button15, button16, button17, button18, button19;
    String[] urls = new String[19];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_sites);


        button1 = (Button) findViewById(R.id.AnimeButton1);
        button2 = (Button) findViewById(R.id.AnimeButton2);
        button3 = (Button) findViewById(R.id.AnimeButton3);
        button4 = (Button) findViewById(R.id.AnimeButton4);
        button5 = (Button) findViewById(R.id.AnimeButton5);
        button6 = (Button) findViewById(R.id.AnimeButton6);
        button7 = (Button) findViewById(R.id.AnimeButton7);
        button8 = (Button) findViewById(R.id.AnimeButton8);
        button9 = (Button) findViewById(R.id.AnimeButton9);
        button10 = (Button) findViewById(R.id.AnimeButton10);
        button11 = (Button) findViewById(R.id.AnimeButton11);
        button12 = (Button) findViewById(R.id.AnimeButton12);
        button13 = (Button) findViewById(R.id.AnimeButton13);
        button14 = (Button) findViewById(R.id.AnimeButton14);
        button15 = (Button) findViewById(R.id.AnimeButton15);
        button16 = (Button) findViewById(R.id.AnimeButton16);
        button17 = (Button) findViewById(R.id.AnimeButton17);
        button18 = (Button) findViewById(R.id.AnimeButton18);
        button19 = (Button) findViewById(R.id.AnimeButton19);

        urls[0] = "https://1337xto.to";
        urls[0] = "https://nyaa.si";
        urls[1] = "https://nyaa.pantsu.cat";
        urls[2] = "https://animekaizoku.com";
        urls[3] = "https://horriblesubs.info";
        urls[4] = "https://www1.animego.to";
        urls[5] = "https://www.animeout.xyz";
        urls[6] = "https://aniwatcher.com";
        urls[7] = "https://ww2.animeram.cc";
        urls[8] = "https://anime8.ru";
        urls[9] = "https://twist.moet";
        urls[10] = "https://4anime.to";
        urls[11] = "https://kissanime.ac";
        urls[12] = "https://www1.9anime.nl/";
        urls[13] = "https://ww2.naruspot.tv/";
        urls[14] = "https://kisscartoon.is";
        urls[15] = "https://www.watchcartoononline.io";
        urls[16] = "http://www.animetoon.org";
        urls[17] = "http://www.toonova.net";
        urls[18] = "https://kimcartoon.si";

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[0]);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[1]);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[2]);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[3]);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[4]);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[5]);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[6]);
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[7]);
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[8]);
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[9]);
                startActivity(intent);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[10]);
                startActivity(intent);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[11]);
                startActivity(intent);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[12]);
                startActivity(intent);

            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[13]);
                startActivity(intent);

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[14]);
                startActivity(intent);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[15]);
                startActivity(intent);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[16]);
                startActivity(intent);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[17]);
                startActivity(intent);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links", urls[18]);
                startActivity(intent);
            }
        });
    }
}