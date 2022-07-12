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

    }
    fun displayContacts(){
        var contact1=Datainformation("lulu Doe","+2542380044","luludoe@gmail.com","", "616 korongo")
        var contact2=Datainformation("ken Oloo","+256130046327" ,"olooken@gmail.com","","c18 hilly")
        var contact3=Datainformation("sabdio wanda","+254784000053","sabdiow@gmail.com","","200 waters")
        var contactsList= listOf(contact1,contact2,contact3)
        var contactsAdapter=DataRvAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }

    }

