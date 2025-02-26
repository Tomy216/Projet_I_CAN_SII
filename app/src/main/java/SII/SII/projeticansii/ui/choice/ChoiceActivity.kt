package SII.SII.projeticansii.ui.choice

import SII.SII.projeticansii.MainActivity
import SII.SII.projeticansii.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// app/src/main/java/SII/SII/projeticansii/ChoiceActivity.kt
class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choice)

        findViewById<Button>(R.id.buttonChoicePAM).setOnClickListener {
            startMainActivity("PAM")
        }

        findViewById<Button>(R.id.buttonChoiceAidant).setOnClickListener {
            startMainActivity("Aidant")
        }
    }

    private fun startMainActivity(choix: String) {
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("PROFIL_CHOISI", choix)
        }
        startActivity(intent)
        finish()
    }
}