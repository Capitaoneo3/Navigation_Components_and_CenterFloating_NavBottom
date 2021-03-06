package br.com.app5m.appaps.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import br.com.app5m.appaps.R
import kotlinx.android.synthetic.main.fragment_sigin_in.*


class SiginInFrag : Fragment() {
    var navigation = view?.let { Navigation.findNavController(it) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sigin_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigation = Navigation.findNavController(view)

        siginUp_email_bt.setOnClickListener {
            navigation?.navigate(R.id.action_siginInFrag_to_signUpFrag)
        }
        login_signin_tv.setOnClickListener {
                navigation?.navigate(R.id.action_siginInFrag_to_loginFrag)
            }

    }

}