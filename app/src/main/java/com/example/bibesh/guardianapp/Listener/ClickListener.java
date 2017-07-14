package com.example.bibesh.guardianapp.Listener;

import com.example.bibesh.guardianapp.Model.Headline;

/**
 * Created by Bibesh on 7/14/17.
 */

public interface ClickListener {
    void onCardViewClick(int position, Headline.ResponseBean.ResultsBean result);
}
