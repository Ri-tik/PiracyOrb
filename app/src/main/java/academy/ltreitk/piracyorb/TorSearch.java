package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TorSearch extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    String[] urls = new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tor_search);

        button1 = (Button) findViewById(R.id.TSbutton1);
        button2 = (Button) findViewById(R.id.TSbutton2);
        button3 = (Button) findViewById(R.id.TSbutton3);
        button4 = (Button) findViewById(R.id.TSbutton4);
        button5 = (Button) findViewById(R.id.TSbutton5);
        button6 = (Button) findViewById(R.id.TSbutton6);
        button7 = (Button) findViewById(R.id.TSbutton7);
        button8 = (Button) findViewById(R.id.TSbutton8);
        button9 = (Button) findViewById(R.id.TSbutton9);

        urls[0] ="https://www.magnetdl.com";
        urls[1] ="https://torrentz2.eu";
        urls[2] ="https://solidtorrents.net";
        urls[3] ="https://www.skytorrents.lol";
        urls[4] ="https://torrent.nz";
        urls[5] ="https://torrents.io";
        urls[6] ="http://moviemagnet.co";
        urls[7] ="https://www.digbt.org";
        urls[8] ="http://www.aiosearch.com";

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
