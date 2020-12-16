package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MovieTvSites extends AppCompatActivity {

    private Button button0, button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
    String[] urls = new String[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_tv_sites);

        button0 = (Button) findViewById(R.id.SSButton0);
        button1 = (Button) findViewById(R.id.SSButton1);
        button2 = (Button) findViewById(R.id.SSButton2);
        button3 = (Button) findViewById(R.id.SSButton3);
        button4 = (Button) findViewById(R.id.SSButton4);
        button5 = (Button) findViewById(R.id.SSButton5);
        button6 = (Button) findViewById(R.id.SSButton6);
        button7 = (Button) findViewById(R.id.SSButton7);
        button8 = (Button) findViewById(R.id.SSButton8);
        button9 = (Button) findViewById(R.id.SSButton9);
        button10 = (Button) findViewById(R.id.SSButton10);
        button11 = (Button) findViewById(R.id.SSButton11);
        button12 = (Button) findViewById(R.id.SSButton12);
        button13 = (Button) findViewById(R.id.SSButton13);
        button14 = (Button) findViewById(R.id.SSButton14);
        button15 = (Button) findViewById(R.id.SSButton15);
        button16 = (Button) findViewById(R.id.SSButton16);
        button17 = (Button) findViewById(R.id.SSButton17);
        button18 = (Button) findViewById(R.id.SSButton18);
        button19 = (Button) findViewById(R.id.SSButton19);
        button20 = (Button) findViewById(R.id.SSButtonextra);

        urls[0] ="https://hdo.to";
        urls[1] ="https://scr.cr";
        urls[2] ="http://m4ufree.tv";
        urls[3] ="https://www9.0123movies.com";
        urls[4] ="https://lookmovie.ag";
        urls[5] ="https://azm.to";
        urls[6] ="http://www.streamlord.com";
        urls[7] ="https://flixgo.cc";
        urls[8] ="https://hdflix.net";
        urls[9] ="https://www1.swatchseries.to";
        urls[10] ="https://www.moviesjoy.net";
        urls[11] ="https://5movies.to";
        urls[12] ="https://www.putlockermix.info";
        urls[13] ="https://tvbox.ag";
        urls[14] ="https://movieninja.to";
        urls[15] ="https://www6.two-movies.name";
        urls[16] ="https://yesmovies.to";
        urls[17] ="https://ymovies.tv";
        urls[18] ="https://spacemov.cc";
        urls[19] ="https://www.bestfreestreaming.com";
        urls[20] ="https://ololo.to";

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[20]);
                startActivity(intent);

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[19]);
                startActivity(intent);

            }
        });

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
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[15]);
                startActivity(intent);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[16]);
                startActivity(intent);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[17]);
                startActivity(intent);

            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[18]);
                startActivity(intent);

            }
        });
    }
}
