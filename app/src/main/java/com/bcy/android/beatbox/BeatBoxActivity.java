package com.bcy.android.beatbox;

import androidx.fragment.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
