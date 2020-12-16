package academy.ltreitk.piracyorb;

import android.app.DownloadManager;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ReadWebView extends AppCompatActivity {
    private android.webkit.WebView readbView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_web_view);

        readbView = (android.webkit.WebView) findViewById(R.id.ReadView);
        readbView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        final String website = intent.getStringExtra("links");

        readbView.loadUrl(website);
        WebSettings webSettings = readbView.getSettings();
        readbView.getSettings().setBuiltInZoomControls(true);
        readbView.getSettings().setDisplayZoomControls(false);
        readbView.getSettings().setUserAgentString("PiracyOrb");
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (readbView.canGoBack()) {
            readbView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
