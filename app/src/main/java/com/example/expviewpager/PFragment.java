package com.example.expviewpager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PFragment extends Fragment {
TextView txt1, txt2;
ImageView img;
Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View V = inflater.inflate(R.layout.fragment_p, container, false);
    txt1=(TextView) V.findViewById(R.id.txtNom);
    txt2=(TextView) V.findViewById(R.id.txtPrix);
        img=(ImageView) V.findViewById(R.id.img);
        btn=(Button) V.findViewById(R.id.btnDetail);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itt=new Intent(getActivity(),DetailActivity.class);
            itt.putExtra("nomPro",getArguments().getString("Nom"));
            startActivity(itt);
            }
        });
txt1.setText(getArguments().getString("Nom"));
        txt2.setText(String.valueOf(getArguments().getFloat("Prix")));
img.setImageResource(getArguments().getInt("Image"));

        return  V;
    }
}