package academy.ltreitk.piracyorb;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button,button2,button3,button4,button5,button6,button7;
    private ImageButton Ibutton1,Ibutton2;
    String[] urls = new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        Ibutton1 =(ImageButton) findViewById(R.id.buttonIntro);
        Ibutton2 =(ImageButton) findViewById(R.id.buttonFeedback);

        urls[0] ="https://forms.gle/tu3bUD1B9UNb5bCv9";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStreams();
            }
        });

        Ibutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutInfo();
            }
        });

        Ibutton2.setOnClickListener(new View.OnClickListener() {
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
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setTitle("Are You Sure You Are Connected To VPN?");
                builder1.setMessage("VPN Connection is Recommended");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                openTorrent();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(getApplicationContext(),"Establish VPN Connection", Toast.LENGTH_LONG).show();
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReading();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEABook();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openComicManga();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTutorial();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAplication();
            }
        });

    }

    private void openAplication() {
        Intent intent = new Intent(this, Applications.class);
        startActivity(intent);
    }

    private void openAboutInfo() {
        Intent intent = new Intent(this, AboutInfo.class);
        startActivity(intent);
    }

    private void openComicManga() {
        Intent intent = new Intent(this, ComicManga.class);
        startActivity(intent);
    }

    private void openEABook() {
        Intent intent = new Intent(this, EABook.class);
        startActivity(intent);
    }

    private void openTutorial() {
        Intent intent = new Intent(this, Tutorials.class);
        startActivity(intent);
    }


    private void openReading() {

        Intent intent = new Intent(this, Reading.class);
        startActivity(intent);
    }

    private void openTorrent() {
        Intent intent = new Intent(this, Torrent.class);
        startActivity(intent);
    }

    private void openStreams()
    {
        Intent intent = new Intent(this, StreamingSites.class);
        startActivity(intent);
    }

}
