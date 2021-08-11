package br.com.app5m.appaps.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.app5m.appaps.R
import br.com.app5m.appaps.helper.RecyclerItemClickListener
import br.com.app5m.appaps.ui.adapter.SellersAdapter
import br.com.app5m.appaps.ui.model.Seller
import kotlinx.android.synthetic.main.fragment_recommendation2.*

class Recommendation2Frag : Fragment(),RecyclerItemClickListener {
    private var listSellers = ArrayList<Seller>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recommendation2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureInitialViews()
        next_bt_reco2.setOnClickListener {
                Navigation?.findNavController(view).navigate(R.id.action_recommendation2Frag_to_phoneValidation1Frag)

            }

    }
    fun configureInitialViews() {
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())
        listSellers.add(Seller())

        recommendation_rv.apply {
            setHasFixedSize(true)
            val itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
            itemDecoration.setDrawable(
                resources.getDrawable(
                    R.drawable.decor_layout_extense,
                    null
                )
            )
            recommendation_rv.addItemDecoration(itemDecoration)

        }
        val rvAdapter = SellersAdapter(requireContext(), listSellers, this)

        val layoutManagerRv: RecyclerView.LayoutManager = GridLayoutManager(context, 1)

        recommendation_rv.layoutManager = layoutManagerRv

        recommendation_rv.adapter = rvAdapter
    }
}