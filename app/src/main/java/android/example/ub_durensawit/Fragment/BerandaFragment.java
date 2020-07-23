package android.example.ub_durensawit.Fragment;

import android.content.Context;
import android.content.Intent;
import android.example.ub_durensawit.AllitemActivity;
import android.example.ub_durensawit.CartActivity;
import android.example.ub_durensawit.R;
import android.example.ub_durensawit.RecyclerViewAdapterHome;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BerandaFragment extends Fragment {

    private ImageView cartList;
    private Button toAllitem;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beranda, container,false);

        cartList = view.findViewById(R.id.toCart);
        toAllitem = view.findViewById(R.id.toAllitem);

        toAllitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AllitemActivity.class));
            }
        });
        cartList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CartActivity.class));
            }
        });



        return view;
    }
}
