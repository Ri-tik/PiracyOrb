package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComicManga extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button10,button11;
    String[] urls = new String[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic_manga);

        button1 = (Button) findViewById(R.id.CMButton1);
        button2 = (Button) findViewById(R.id.CMButton2);
        button3 = (Button) findViewById(R.id.CMButton3);
        button4 = (Button) findViewById(R.id.CMButton4);
        button5 = (Button) findViewById(R.id.CMButton5);
        button6 = (Button) findViewById(R.id.CMButton6);
        button7 = (Button) findViewById(R.id.CMButton7);
        button8 = (Button) findViewById(R.id.CMButton8);
        button9 = (Button) findViewById(R.id.CMButton9);
        button10 = (Button) findViewById(R.id.CMButton10);
        button11 = (Button) findViewById(R.id.CMButton5_1);

        urls[0] ="https://readcomiconline.to";
        urls[1] ="https://comicpunch.net";
        urls[2] ="https://www.comicextra.com";
        urls[3] ="https://getcomics.info";
        urls[4] ="https://comix-load.in";
        urls[5] ="https://mangadex.org";
        urls[6] ="https://kissmanga.com";
        urls[7] ="https://www.nineanime.com";
        urls[8] ="https://mangarock.com";
        urls[9] ="https://bato.to";
        urls[10] ="https://newcomic.info";



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
                Intent intent = new Intent(getApplicationContext(), ReadWebView.class);
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

    }
}
