package academy.ltreitk.piracyorb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorials extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17;
    String[] urls = new String[18];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        button1 = (Button) findViewById(R.id.TutsButton1);
        button2 = (Button) findViewById(R.id.TutsButton2);
        button3 = (Button) findViewById(R.id.TutsButton3);
        button4 = (Button) findViewById(R.id.TutsButton4);
        button5 = (Button) findViewById(R.id.TutsButton5);
        button6 = (Button) findViewById(R.id.TutsButton6);
        button7 = (Button) findViewById(R.id.TutsButton7);
        button8 = (Button) findViewById(R.id.TutsButton8);
        button9 = (Button) findViewById(R.id.TutsButton9);
        button10 = (Button) findViewById(R.id.TutsButton10);
        button11 = (Button) findViewById(R.id.TutsButton11);
        button12 = (Button) findViewById(R.id.TutsButton12);
        button13 = (Button) findViewById(R.id.TutsButton13);
        button14 = (Button) findViewById(R.id.TutsButton14);
        button15 = (Button) findViewById(R.id.TutsButton15);
        button16 = (Button) findViewById(R.id.TutsButton16);
        button17 = (Button) findViewById(R.id.TutsButton17);

        urls[0] ="https://ftuforum.com";
        urls[1] ="https://freecoursesonline.in";
        urls[2] ="https://www.learningcrux.com";
        urls[3] ="https://tutsgalaxy.com";
        urls[4] ="https://courseclub.me";
        urls[5] ="https://forum.gfxdomain.net";
        urls[6] ="http://www.freetutor.in";
        urls[7] ="https://forcoder.su";
        urls[8] ="https://www.howtofree.org";
        urls[9] ="https://coursedrive.org";
        urls[10] ="https://www.freecoursesonline.me";
        urls[11] ="https://www.onlinefreecourse.net";
        urls[12] ="http://academictorrents.com";
        urls[13] ="https://getfreetutorial.com";
        urls[14] ="https://freecoursesite.com";
        urls[15] ="https://freevideolectures.com";
        urls[16] ="https://freetutsdownload.net";


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
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
    }
}
