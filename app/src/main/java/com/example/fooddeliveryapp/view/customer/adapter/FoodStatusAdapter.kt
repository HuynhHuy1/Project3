package com.example.fooddeliveryapp.view.customer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.model.FoodModel
import com.example.fooddeliveryapp.view.customer.`interface`.handleFoodItem

class FoodStatusAdapter(var listData : List<FoodModel>) : Adapter<FoodStatusAdapter.viewHolder>() {
    class viewHolder(view :View ) : ViewHolder(view){
        var name = view.findViewById<TextView>(R.id.name_food_status)
        var price = view.findViewById<TextView>(R.id.price_food_status)
        var countFood = view.findViewById<TextView>(R.id.count_food_status)
        var image = view.findViewById<ImageView>(R.id.image_status_food)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.food_status_adapter,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.name.text = listData[position].name
        holder.price.text = "$ ${ listData[position].price }"
        holder.image.setImageResource(listData[position].image)
    }
}