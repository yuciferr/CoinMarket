package com.example.coinmarket.ui.home

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coinmarket.databinding.RvItemsBinding
import com.example.coinmarket.model.home.Data
import kotlin.math.roundToInt

class HomeRecyclerAdapter(private val listener: ItemClickListener): RecyclerView.Adapter<HomeRecyclerAdapter.MViewHolder>() {

    private var coins = emptyList<Data>()

    class MViewHolder(private val binding: RvItemsBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: ItemClickListener, coin: Data){
            binding.onItemClickListener = listener
            binding.coin = coin
            coin.quote?.uSD?.percentChange24h?.let { setColor(it) }
            binding.executePendingBindings()
        }
        private fun setColor(percent: Double){
            val rounded = (percent * 100.0).roundToInt() / 100.0
           if(rounded>0){
               binding.coinPriceChange.setTextColor(Color.GREEN)
               binding.percent.setTextColor(Color.GREEN)

           }else if (rounded<0){
               binding.coinPriceChange.setTextColor(Color.RED)
               binding.percent.setTextColor(Color.RED)
           }
        }

        companion object{
            fun from(parent: ViewGroup): MViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RvItemsBinding.inflate(layoutInflater,parent,false)
                return MViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MViewHolder.from(parent)

    override fun onBindViewHolder(holder: MViewHolder, position: Int) = holder.bind(listener, coins[position])

    override fun getItemCount() = coins.size

    fun setList(newList: List<Data>){
        coins = newList
        notifyDataSetChanged()
    }
}