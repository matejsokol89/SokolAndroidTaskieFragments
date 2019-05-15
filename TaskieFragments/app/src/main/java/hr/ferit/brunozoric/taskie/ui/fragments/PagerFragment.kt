package hr.ferit.brunozoric.taskie.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.adapters.TaskPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class PagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result = inflater.inflate(R.layout.view_pager, container, false)
        val pager = result.findViewById(R.id.viewPager) as ViewPager
        val tabLayout = result.findViewById(R.id.tabLayout)as TabLayout


        pager.adapter = buildAdapter()

        tabLayout.setupWithViewPager(pager)


        return result
    }

    private fun buildAdapter(): PagerAdapter {
        return TaskPagerAdapter(childFragmentManager)
    }
}