package br.com.app5m.appaps

import android.os.Bundle
import br.com.app5m.appaps.R
import br.com.app5m.appaps.helper.ThemeControl

class MainActivity : ThemeControl() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}