package dev.beryl.contactreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.beryl.contactreader.databinding.ContactListItemBinding

class DataRvAdapter( var contactList: List<Datainformation>):

    RecyclerView.Adapter<DataViewHolder>() {
    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int):DataViewHolder {
        var binding = ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        with(holder.binding){
            var currentContact = contactList.get(position)
            tvName.text = currentContact.name
            tvEmail.text = currentContact.email
            tvAddress.text = currentContact.address
            tvPhonenumber.text = currentContact.phoneNumber

            Picasso.get()
                .load(currentContact.image)
                .resize(300 ,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_person_24)
                .error(R.drawable.ic_baseline_person_24)
                .into(holder.binding.imgPerson)
        }

    }
    override fun getItemCount(): Int {
        return contactList.size

    }

}
class DataViewHolder(var binding: ContactListItemBinding)
    :RecyclerView.ViewHolder(binding.root){

}