package dev.beryl.contactreader

import android.provider.ContactsContract

data class Datainformation(
    var name:String,
    var phoneNumber:String,
    var email:String,
    var image:String,
    var address:String
)
