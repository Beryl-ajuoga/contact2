package dev.beryl.contactreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
    }

    fun getExtras() {
        val extras = intent.extras
        var name = extras?.getString("Name", "")
        var phoneNumber = extras?.getString("phoneNumber", "")
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}