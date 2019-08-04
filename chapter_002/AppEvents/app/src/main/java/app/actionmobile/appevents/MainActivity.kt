package app.actionmobile.appevents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Inside OnCreate()...")

        var appEventTag = "MainActivity"
        var appEventMsg = "Inside OnCreate()... 2"

        Log.d(appEventTag, appEventMsg);

    }
}
