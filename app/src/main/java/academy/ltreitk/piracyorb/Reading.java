package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reading extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,button15,button16,button17,button18;
    String[] urls = new String[19];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);


        button1 = (Button) findViewById(R.id.ReadButton1);
        button2 = (Button) findViewById(R.id.ReadButton2);
        button3 = (Button) findViewById(R.id.ReadButton3);
        button4 = (Button) findViewById(R.id.ReadButton4);
        button5 = (Button) findViewById(R.id.ReadButton5);
        button6 = (Button) findViewById(R.id.ReadButton6);
        button7 = (Button) findViewById(R.id.ReadButton7);
        button8 = (Button) findViewById(R.id.ReadButton8);
        button9 = (Button) findViewById(R.id.ReadButton9);
        button10 = (Button) findViewById(R.id.ReadButton10);
        button11 = (Button) findViewById(R.id.ReadButton11);
        button12 = (Button) findViewById(R.id.ReadButton12);
        button13 = (Button) findViewById(R.id.ReadButton13);
        button14 = (Button) findViewById(R.id.ReadButton14);
        button15 = (Button) findViewById(R.id.ReadButton15);
        button16 = (Button) findViewById(R.id.ReadButton16);
        button17 = (Button) findViewById(R.id.ReadButton17);
        button18 = (Button) findViewById(R.id.ReadButton18);

        urls[0] ="https://curiosity.com";
        urls[1] ="https://ed.ted.com";
        urls[2] ="https://www.howstuffworks.com";
        urls[3] ="https://www.popsci.com";
        urls[4] ="https://medium.com";
        urls[5] ="https://www.theschooloflife.com/thebookoflife/";
        urls[6] ="https://waitbutwhy.com";
        urls[7] ="https://www.brainpickings.org";
        urls[8] ="https://www.quora.com";
        urls[9] ="https://www.reddit.com";
        urls[10] ="https://www.instructables.com";
        urls[11] ="https://stackexchange.com";
        urls[12] ="https://www.academia.edu";
        urls[13] ="https://socratic.org";
        urls[14] ="https://www.lumosity.com";
        urls[15] ="https://www.memrise.com";
        urls[16] ="https://www.macat.com";
        urls[17] ="https://www.duolingo.com";

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
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[1]);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[2]);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[3]);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[4]);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[5]);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[6]);
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[7]);
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[8]);
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[9]);
                startActivity(intent);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[10]);
                startActivity(intent);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[11]);
                startActivity(intent);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[12]);
                startActivity(intent);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[13]);
                startActivity(intent);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[14]);
                startActivity(intent);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[15]);
                startActivity(intent);

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[16]);
                startActivity(intent);

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
                intent.putExtra("links" ,urls[17]);
                startActivity(intent);

            }
        });
    }
}
