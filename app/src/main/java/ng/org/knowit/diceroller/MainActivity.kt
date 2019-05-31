package ng.org.knowit.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"

        rollDice()
    }

    private fun rollDice() {
        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
        val randomInt = Random(6)


    }
}
