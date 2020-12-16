package academy.ltreitk.piracyorb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Applications extends AppCompatActivity {

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applications);

        button1 = (Button) findViewById(R.id.ApplicationButton1);
        button2 = (Button) findViewById(R.id.ApplicationButton2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStreamingApps();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openModApps();
            }
        });
    }

    private void openModApps() {
        Intent intent = new Intent(this, ModApps.class);
        startActivity(intent);
    }

    private void openStreamingApps() {
        Intent intent = new Intent(this, StreamingApps.class);
        startActivity(intent);
    }
}
