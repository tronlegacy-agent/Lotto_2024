package tw.edu.pu.csim.tcyang.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView = findViewById(R.id.txv)
        txv.text = "0"
    }

    fun happy(v: View){
        var txv: TextView = findViewById(R.id.txv)
        txv.text = (1..100).random().toString()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Toast.makeText(this, "螢幕觸控", Toast.LENGTH_SHORT).show();
        return true
    }
}