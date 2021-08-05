package br.com.app5m.appaps.ui.activity.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.app5m.appaps.R
import br.com.app5m.appaps.ThemeControl

class Intro_containerAct : ThemeControl() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_container)
    }
}