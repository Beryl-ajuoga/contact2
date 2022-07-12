package dev.beryl.contactreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class DataRvAdapter( var contactList: List<Datainformation>):
    RecyclerView.Adapter<dataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dataViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)

        return dataViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: dataViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvEmail.text=currentContact.email
        holder.tvAddress.text=currentContact.address
        holder.tvPhonenumber.text=currentContact.phoneNumber


    }

    override fun getItemCount(): Int {
        return contactList.size

    }

}
class dataViewHolder( itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName:TextView=itemView.findViewById(R.id.tvName)
    var tvPhonenumber:TextView=itemView.findViewById(R.id.tvPhonenumber)
    var tvEmail:TextView=itemView.findViewById(R.id.tvEmail)
    var tvAddress:TextView=itemView.findViewById(R.id.tvAddress)

}