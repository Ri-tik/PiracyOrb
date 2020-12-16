package academy.ltreitk.piracyorb;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StreamingSites extends AppCompatActivity {

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streaming_sites);

        button1 = (Button) findViewById(R.id.StreamButton1);
        button2 = (Button) findViewById(R.id.StreamButton2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnime();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(StreamingSites.this);
                builder1.setTitle("Are You Sure You Are Connected To VPN?");
                builder1.setMessage("VPN Connection is Recommended");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                openMovieTv();
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
    }

    private void openMovieTv() {
        Intent intent = new Intent(this, MovieTvSites.class);
        startActivity(intent);
    }

    private void openAnime() {
        Intent intent = new Intent(this, AnimeSites.class);
        startActivity(intent);
    }
}
