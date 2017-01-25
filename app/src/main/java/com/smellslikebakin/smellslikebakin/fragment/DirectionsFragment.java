package com.smellslikebakin.smellslikebakin.fragment;

import com.smellslikebakin.smellslikebakin.model.Recipes;

public class DirectionsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
