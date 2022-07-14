package dev.beryl.contactreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.beryl.contactreader.databinding.ActivityViewContactBinding
import dev.beryl.contactreader.databinding.ContactListItemBinding
import java.util.jar.Attributes

class ViewContact : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras(){
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val extras = intent.extras
        var name = extras?.getString("NAME","")
        var phone= extras?.getString("PHONE","")
        var email = extras?.getString("EMAIL","")
        var address = extras?.getString("ADDRESS","")
        var namee=extras?.getString("NAME","")


        var image = binding.imgcont

       Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()

        binding.tvnamee.text=name
        binding.tvMobile.text=phone
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)

    }
}


