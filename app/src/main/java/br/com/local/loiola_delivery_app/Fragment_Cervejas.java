package br.com.local.loiola_delivery_app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Cervejas extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Cerveja> listCerveja;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__cervejas, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.cerveja_recyclerview);
        RecyclerCervejaAdapter recyclerCervejaAdapter = new RecyclerCervejaAdapter(getContext(),listCerveja);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerCervejaAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listCerveja = new ArrayList<>();
        listCerveja.add(new Cerveja("Heineken", "330ml", "R$4,00", R.drawable.heineken));
        listCerveja.add(new Cerveja("Amstel", "269ml", "R$2,00", R.drawable.amstel));
        listCerveja.add(new Cerveja("Antartica", "350ml", "R$2,60", R.drawable.antarctica));
        listCerveja.add(new Cerveja("Bavaria", "350ml", "R$1,99", R.drawable.bavaria));
        listCerveja.add(new Cerveja("Budweiser", "269ml", "R$2,80", R.drawable.budweiser));
        listCerveja.add(new Cerveja("Itaipava", "269ml", "R$1,99", R.drawable.itaipava));
        listCerveja.add(new Cerveja("Original", "269ml", "R$2,39", R.drawable.original));
        listCerveja.add(new Cerveja("Skol", "269ml", "R$1,99", R.drawable.skol));
        listCerveja.add(new Cerveja("Becks", "300ml", "R$4,99", R.drawable.becks));
        listCerveja.add(new Cerveja("Stella", "269ml", "R$2,99", R.drawable.stella));
    }
}