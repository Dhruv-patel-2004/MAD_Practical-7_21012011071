package com.example.MAD_PRACTICAL7_21012011071
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton
class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        playYoutubeVideo();
        var yb:FloatingActionButton=findViewById(R.id.youtubeButton);
        yb.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).also { startActivity(it) } };
    }
    private val youtubeId="w9AbHXPKp_s";
    fun playYoutubeVideo(){
        var youtube:WebView=findViewById(R.id.youtubeVideo);
        var wb:WebSettings=youtube.settings;
        wb.javaScriptEnabled=true;
        wb.loadWithOverviewMode=true;
        wb.useWideViewPort=true;
        youtube.loadUrl("https://www.youtube.com/embed/$youtubeId");
    }
}
