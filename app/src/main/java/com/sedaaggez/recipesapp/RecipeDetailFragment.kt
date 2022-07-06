package com.sedaaggez.recipesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.sedaaggez.recipesapp.databinding.FragmentRecipeDetailBinding

class RecipeDetailFragment : Fragment(R.layout.fragment_recipe_detail) {
    private var fragmentBinding: FragmentRecipeDetailBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentRecipeDetailBinding.bind(view)
        fragmentBinding = binding
    }

    override fun onDestroy() {
        fragmentBinding = null
        super.onDestroy()
    }
}