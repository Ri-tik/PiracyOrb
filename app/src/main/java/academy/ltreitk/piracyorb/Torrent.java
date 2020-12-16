package academy.ltreitk.piracyorb;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Torrent extends AppCompatActivity {

    private Button button1,button2,button3;
    String[] urls = new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torrent);


        button1 = (Button) findViewById(R.id.TorButton1);
        button2 = (Button) findViewById(R.id.TorButton2);
        button3 = (Button) findViewById(R.id.TorButton3);

        urls[0] ="https://unblocked.lc";

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTorSearch();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTorSites();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebView.class);
                intent.putExtra("links" ,urls[0]);
                startActivity(intent);

            }
        });
    }

    private void openTorSearch() {
        Intent intent = new Intent(this, TorSearch.class);
        startActivity(intent);
    }

    private void openTorSites() {
        Intent intent = new Intent(this, TorrentSites.class);
        startActivity(intent);
    }
}
