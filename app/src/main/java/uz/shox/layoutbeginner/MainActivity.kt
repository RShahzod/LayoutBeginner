package uz.shox.layoutbeginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val nextTask = findViewById<Button>(R.id.nextTask)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val editID = findViewById<EditText>(R.id.editID)
        val editPW = findViewById<EditText>(R.id.editPW)
        val resultTxt = findViewById<TextView>(R.id.resultTxt)

        loginBtn.setOnClickListener {
            val userID = editID.text.toString()
            val userPW = editPW.text.toString()

            resultTxt.text = "UserID: $userID \nUserPW: $userPW"
        }

        nextBtn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        nextTask.setOnClickListener {
            startActivity(Intent(this,ThreeActivity::class.java))
        }

    }
}