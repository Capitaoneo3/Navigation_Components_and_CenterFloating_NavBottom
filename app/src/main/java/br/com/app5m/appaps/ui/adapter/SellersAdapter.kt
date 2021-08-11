package br.com.app5m.appaps.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.app5m.appaps.R
import br.com.app5m.appaps.helper.RecyclerItemClickListener
import br.com.app5m.appaps.ui.model.Seller


class SellersAdapter (private val context: Context, private val listSellers: List<Seller>,
                      private val clickOnListener: RecyclerItemClickListener
)
    : RecyclerView.Adapter<SellersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItem: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.adapter_sellers,
                parent,
                false
            ) // vai conectar com os ids abaixo
        return ViewHolder(listItem)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val seller = listSellers[position]

        /* holder.productNameCartTv.text = "Nome do produto"
 */
        holder.itemView.setOnClickListener { clickOnListener.onClickListenerSeller(seller) }

    }

    override fun getItemCount(): Int {
        return listSellers.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
/*        val productNameCartTv: TextView


        init {
            productNameCartTv = itemView.findViewById(R.id.productNameCartTv)

        }*/
    }
}
