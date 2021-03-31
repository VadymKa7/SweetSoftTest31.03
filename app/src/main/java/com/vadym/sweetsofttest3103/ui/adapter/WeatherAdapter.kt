package com.vadym.sweetsofttest3103.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vadym.sweetsofttest3103.R
import com.vadym.sweetsofttest3103.model.Weather

class WeatherAdapter(private val values: List<Weather>)
 : RecyclerView.Adapter<WeatherAdapter.MyViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView?.text = values[position].title
        holder.smallTextView?.text = values[position].woeid.toString()
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var largeTextView: TextView? = null
        var smallTextView: TextView? = null

        init {
            largeTextView = itemView?.findViewById(R.id.text_one)
            smallTextView = itemView?.findViewById(R.id.text_two)
        }
    }
}