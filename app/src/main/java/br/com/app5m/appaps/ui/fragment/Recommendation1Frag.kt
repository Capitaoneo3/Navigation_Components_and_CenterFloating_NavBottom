package br.com.app5m.appaps.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.app5m.appaps.R
import kotlinx.android.synthetic.main.fragment_recommendation1.*


class Recommendation1Frag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recommendation1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var navigation= Navigation.findNavController(view)

        yes_bt_reco1.setOnClickListener {
            navigation?.navigate(R.id.action_recommendation1Frag_to_recommendation2Frag)

        }
        no_bt_reco1.setOnClickListener {
            navigation?.navigate(R.id.action_recommendation1Frag_to_phoneValidation1Frag)

        }
    }


}