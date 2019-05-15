package hr.ferit.brunozoric.taskie.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import hr.ferit.brunozoric.taskie.ui.fragments.AboutMeFragment
import hr.ferit.brunozoric.taskie.ui.fragments.AboutAppFragment


class TaskPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> AboutAppFragment.newInstance()
            1 -> AboutMeFragment.newInstance()
            else -> AboutAppFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "About application"
        } else if (position == 1) {
            title = "About author"
        }
        return title
    }

    override fun getCount() = 2
}