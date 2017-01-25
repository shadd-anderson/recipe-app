package com.smellslikebakin.smellslikebakin.adapter;

import com.smellslikebakin.smellslikebakin.R;
import com.smellslikebakin.smellslikebakin.fragment.GridFragment;

public class GridAdapter extends RecyclerAdapter {
    private final GridFragment.OnRecipeSelectedInterface listener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        this.listener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        listener.onGridRecipeSelected(index);
    }
}