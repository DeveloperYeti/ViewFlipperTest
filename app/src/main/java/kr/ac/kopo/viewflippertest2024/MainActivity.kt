package kr.ac.kopo.viewflippertest2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    lateinit var btnnext : Button
    lateinit var btnPrev : Button
    lateinit var vFlip : ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext = findViewById<Button>(R.id.btnnext)
        btnPrev = findViewById<Button>(R.id.btnPrev)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

        btnnext.setOnClickListener(btnListnner)
        btnPrev.setOnClickListener(btnListnner)

    }
    val btnListnner = View.OnClickListener {
        when(it.id){
            R.id.btnnext -> vFlip.showNext()
            R.id.btnPrev -> vFlip.showPrevious()
        }

    }
}