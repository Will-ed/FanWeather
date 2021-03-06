package com.ed.will.fanweather.view.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by Win10 on 2016/3/2.
 */
public abstract class BaseFragment extends Fragment {
    protected Activity activity;
    protected View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (null == rootView) {
            return onViewInit(inflater, container, savedInstanceState);
        } else {
            return rootView;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (null != rootView) {
            ViewGroup viewGroup = (ViewGroup) rootView.getParent();
            if (null != viewGroup) {
                viewGroup.removeView(rootView);
            }
        }
    }

    public abstract View onViewInit(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    /**
     * 渐变动画
     *
     * @param contentView
     * @link http://hukai.me/android-training-course-in-chinese/animations/crossfade.html
     */
    protected void fadeInAnim(View contentView) {
        contentView.setAlpha(0f);
        contentView.setVisibility(View.VISIBLE);
        contentView.animate()
                .alpha(1f)
                .setDuration(getResources()
                        .getInteger(android.R.integer.config_mediumAnimTime));
    }


}
