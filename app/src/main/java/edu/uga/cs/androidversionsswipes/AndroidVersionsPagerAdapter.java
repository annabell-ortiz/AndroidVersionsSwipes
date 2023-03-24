package edu.uga.cs.androidversionsswipes;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AndroidVersionsPagerAdapter extends FragmentStateAdapter {

    public AndroidVersionsPagerAdapter(FragmentManager fragmentManager, Lifecycle lifecycle ) {
        super(fragmentManager, lifecycle);
    } //constructor

    @Override
    /*
     * method will be called everytime user swipes left or right
     */
    public Fragment createFragment(int position){
        return AndroidVersionFragment.newInstance( position );
    }

    @Override
    /*
     * Android calls this method to know how many pages will be available while swiping
     */
    public int getItemCount() {
        return AndroidVersionFragment
                .getNumberOfVersions();
    }

}
