package com.example.expviewpager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter
extends FragmentStateAdapter
{
    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        PFragment F = new PFragment();
        Bundle B = new Bundle();
        B.putString("Nom",Produit.lstPro().get(position).getNom());
        B.putFloat("Prix",Produit.lstPro().get(position).getPrix());
        B.putInt("Image",Produit.lstPro().get(position).getPhoto());
        F.setArguments(B);
        return F;

    }


    @Override
    public int getItemCount() {
        return Produit.lstPro().size();
    }
}