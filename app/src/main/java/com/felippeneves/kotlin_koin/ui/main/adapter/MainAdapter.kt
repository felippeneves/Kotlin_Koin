package com.felippeneves.kotlin_koin.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.felippeneves.kotlin_koin.R
import com.felippeneves.kotlin_koin.data.model.BitcoinValue
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(
    private val users: ArrayList<BitcoinValue>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(btc: BitcoinValue) {
            itemView.tvCode.text = btc.code
            itemView.tvDescription.text = btc.description
            itemView.tvSymbol.text = btc.symbol
            itemView.tvRate.text = btc.rate

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<BitcoinValue>) {
        users.addAll(list)
    }
}