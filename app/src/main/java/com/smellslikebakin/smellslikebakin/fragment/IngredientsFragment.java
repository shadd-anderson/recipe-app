package com.smellslikebakin.smellslikebakin.fragment;

import com.smellslikebakin.smellslikebakin.model.Recipes;

public class IngredientsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
