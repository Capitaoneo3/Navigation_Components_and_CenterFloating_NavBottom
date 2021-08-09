package br.com.app5m.appaps.ui.activity.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import br.com.app5m.appaps.R
import kotlinx.android.synthetic.main.fragment_intro.*

class IntroContainerFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_container, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configInitialViews()

    }
    private class SectionsPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> MultiIntroFrag()
                1 -> MultiIntroFrag()
                2 -> MultiIntroFrag()
                else -> MultiIntroFrag()
            }
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            return 4
        }
    }
    private fun configInitialViews(){
        val adapter = fragmentManager?.let { SectionsPagerAdapter(it) }

        pagerView.adapter = adapter

        introIndicator.setViewPager(pagerView)

        pagerView.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                if (position == 3) {
                    next_intro_bt.setOnClickListener {

                        startActivity(
                            Intent(this@IntroContainerAct,
                            AuthContainerAct::class.java).putExtra("key", intent.extras!!.getInt("key")))

                    }
                } else {
                    next_intro_bt.setOnClickListener {
                        pagerView.currentItem++
                    }
                }
            }

            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })

        loadClicks()

    }
    private fun loadClicks() {

        next_intro_bt.setOnClickListener {
            pagerView.currentItem++
        }

        skip_intro_bt.setOnClickListener {


            startActivity(Intent(this@IntroContainerAct,
                AuthContainerAct::class.java).putExtra("key", 0))

            finishAffinity()

        }

    }
}