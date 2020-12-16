package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TorrentSites extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
    String[] urls = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torrent_sites);

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
        button19 = (Button) findViewById(R.id.TsiteButton19);
        button20 =  (Button) findViewById(R.id.TsiteButton20);

        urls[0] ="https://1337xto.to";
        urls[1] ="https://www.ettv.to";
        urls[2] ="https://thepiratebay.org";
        urls[3] ="https://eztv.io";
        urls[4] ="https://torrentgalaxy.to";
        urls[5] ="https://www.mkvcage.fun";
        urls[6] ="https://torrentcounter.to";
        urls[7] ="https://grabthebeast.com";
        urls[8] ="https://isohunt2.net";
        urls[9] ="https://katcr.co";
        urls[10] ="https://yts.lt";
        urls[11] ="https://rarbg.to/index70.php";
        urls[12] ="https://zooqle.com";
        urls[13] ="https://glodls.to";
        urls[14] ="http://moviemagnet.co";
        urls[15] ="https://www.torlock.com";
        urls[16] ="https://otorrents.com";
        urls[17] ="https://www.torrentfunk.com";
        urls[18] ="https://games4theworld.org";
        urls[19] ="https://480mkv.net";

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

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[19]);
                startActivity(intent);

            }
        });

    }
}
