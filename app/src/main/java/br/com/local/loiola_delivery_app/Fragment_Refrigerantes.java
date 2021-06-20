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


public class Fragment_Refrigerantes extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Refrigerantes> listRefrigerantes;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment__refrigerantes, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.refri_recyclerview);
        RecyclerRefriAdapter refriAdapter = new RecyclerRefriAdapter(getContext(), listRefrigerantes);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(refriAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listRefrigerantes = new ArrayList<>();
        listRefrigerantes.add(new Refrigerantes("Coca-Cola", "2 Litros", "R$7,00", R.drawable.cocacola));
        listRefrigerantes.add(new Refrigerantes("Coca-Zero", "2 Litros", "R$7,50", R.drawable.cocacolazero));
        listRefrigerantes.add(new Refrigerantes("Dolly", "2 Litros", "R$5,00", R.drawable.dolly));
        listRefrigerantes.add(new Refrigerantes("Dolly-Cola", "2 Litros", "R$5,00", R.drawable.dollycola));
        listRefrigerantes.add(new Refrigerantes("Guaraná Antártica", "2 Litros", "R$6,00", R.drawable.guaranaantarctica));
        listRefrigerantes.add(new Refrigerantes("Guaraná Kuat", "2 Litros", "R$4,00", R.drawable.kuatguarana));
        listRefrigerantes.add(new Refrigerantes("Fanta Uva", "2 Litros", "R$6,50", R.drawable.fantauva));
        listRefrigerantes.add(new Refrigerantes("Fanta Laranja", "2 Litros", "R$6,50", R.drawable.fantalaranja));
        listRefrigerantes.add(new Refrigerantes("Pepsi", "2 Litros", "R$4,00", R.drawable.pepsi));
        listRefrigerantes.add(new Refrigerantes("Schweppes", "2 Litros", "R$4,00", R.drawable.schweppes));
    }
}