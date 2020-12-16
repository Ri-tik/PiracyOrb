package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EABook extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14;
    String[] urls = new String[14];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eabook);

        button1 = (Button) findViewById(R.id.EBButton1);
        button2 = (Button) findViewById(R.id.EBButton2);
        button3 = (Button) findViewById(R.id.EBButton3);
        button4 = (Button) findViewById(R.id.EBButton4);
        button5 = (Button) findViewById(R.id.EBButton5);
        button6 = (Button) findViewById(R.id.EBButton6);
        button7 = (Button) findViewById(R.id.EBButton7);
        button8 = (Button) findViewById(R.id.EBButton8);
        button9 = (Button) findViewById(R.id.EBButton9);
        button10 = (Button) findViewById(R.id.EBButton10);
        button11 = (Button) findViewById(R.id.EBButton11);
        button12 = (Button) findViewById(R.id.EBButton12);
        button13 = (Button) findViewById(R.id.EBButton13);
        button14 = (Button) findViewById(R.id.EBButton14);


        urls[0] ="https://cse.google.com/cse?cx=000661023013169144559:a1-kkiboeco";
        urls[1] ="https://b-ok.xyz";
        urls[2] ="https://booksc.org";
        urls[3] ="http://www.allitebooks.org";
        urls[4] ="http://it-ebooks.info";
        urls[5] ="http://gen.lib.rus.ec";
        urls[6] ="https://textbooknova.com";
        urls[7] ="http://www.gutenberg.org";
        urls[8] ="https://ebookee.org";
        urls[9] ="https://manybooks.net";
        urls[10] ="http://the-eye.eu/public/AudioBooks";
        urls[11] ="http://audiobookbay.nl";
        urls[12] ="https://audiobooks.cloud";
        urls[13] ="https://tokybook.com";

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
        
    }
}
