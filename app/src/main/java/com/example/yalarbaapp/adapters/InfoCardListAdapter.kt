package com.example.yalarbaapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yalarbaapp.R
import com.example.yalarbaapp.data_room.model.InfoCard
import com.example.yalarbaapp.databinding.InfoCardItemBinding

class InfoCardListAdapter : RecyclerView.Adapter<InfoCardListAdapter.ViewHolder>() {

    var items: List<InfoCard> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    private var itemClick: (InfoCard) -> Unit = {}
    fun itemClick(listener: (InfoCard) -> Unit) {
        itemClick = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.info_card_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.infoCard = items[position]
        holder.itemView.setOnClickListener {
            itemClick(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = InfoCardItemBinding.bind(view)

    }
}