package dev.beryl.contactreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import dev.beryl.contactreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()

    }
    fun displayContacts(){
        var contact1=Datainformation("lulu Doe","+2542380044","luludoe@gmail.com","https://i.pinimg.com/474x/fb/6d/f4/fb6df4e587493403fa75e3316a95d9e7.jpg", "616 korongo" )
        var contact2=Datainformation("ken Oloo","+256130046327" ,"olooken@gmail.com","https://i.pinimg.com/474x/fb/6d/f4/fb6df4e587493403fa75e3316a95d9e7.jpg","c18 hilly")
        var contact3=Datainformation("sabdio wanda","+254784000053","sabdiow@gmail.com","https://i.pinimg.com/474x/fb/6d/f4/fb6df4e587493403fa75e3316a95d9e7.jpg","200 waters")
        var contactsList= listOf(contact1,contact2,contact3)
        var contactsAdapter=DataRvAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }

    }

