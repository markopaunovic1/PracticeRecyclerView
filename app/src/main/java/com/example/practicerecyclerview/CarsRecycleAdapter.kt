package com.example.practicerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CarsRecycleAdapter(context: Context, val cars : List<Cars>)  : RecyclerView.Adapter<CarsRecycleAdapter.ViewHolder>() {

    var layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car = cars[position]

        holder.carTextView.text = car.car
        holder.modelTextView.text = car.model
        holder.horsePowerView.text = car.horsePower
        holder.carPriceView.text = car.priceOfCar
        holder.carImage.setImageDrawable(holder.carImage.context.getDrawable(car.carImage))

    }

    override fun getItemCount(): Int {
        return cars.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        var carTextView = itemView.findViewById<TextView>(R.id.carView)
        var modelTextView = itemView.findViewById<TextView>(R.id.carModelView)
        var horsePowerView = itemView.findViewById<TextView>(R.id.horsePowerView)
        var carPriceView = itemView.findViewById<TextView>(R.id.carPriceView)
        val carImage = itemView.findViewById<ImageView>(R.id.carImage)

    }
}