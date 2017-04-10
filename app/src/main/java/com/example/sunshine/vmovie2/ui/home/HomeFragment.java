package com.example.sunshine.vmovie2.ui.home;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.example.mvplibrary.base.BaseFragment;
import com.example.sunshine.vmovie2.MainActivity;
import com.example.sunshine.vmovie2.R;
import com.example.sunshine.vmovie2.R2;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements MainActivity.OnTitleClickListener {
//    @BindView(R2.id.)
    private MainActivity mMainActivity;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            mMainActivity = (MainActivity) context;
            //接口回调最后一步
            mMainActivity.setOnTitleClickListener(this);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void onMovieTitleClick() {

    }

    @Override
    public void onChannelTitleClick() {

    }
}
