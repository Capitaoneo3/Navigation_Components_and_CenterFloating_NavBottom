package br.com.app5m.appaps.ui.fragment


import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.app5m.appaps.R
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        login_bt.setOnClickListener {
            Navigation?.findNavController(view).navigate(R.id.action_loginFrag_to_navBarFrag)

        }
        recoverPass_tv.setOnClickListener {
            Navigation?.findNavController(view).navigate(R.id.action_loginFrag_to_recoverPassFrag)


        }
    }






}