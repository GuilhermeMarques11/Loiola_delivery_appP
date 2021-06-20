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

public class Fragment_Sucos extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Sucos> listSucos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment__sucos, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.suco_recyclerview);
        RecyclerSucoAdapter recyclerSucoAdapter = new RecyclerSucoAdapter(getContext(),listSucos);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerSucoAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listSucos = new ArrayList<>();
        listSucos.add(new Sucos("Abacaxi", "300ml", "R$3,00", R.drawable.sucodeabacaxi));
        listSucos.add(new Sucos("Acerola", "300ml", "R$2,50", R.drawable.sucodeacerola));
        listSucos.add(new Sucos("Goiaba", "300ml", "R$3,00", R.drawable.sucodegoiaba));
        listSucos.add(new Sucos("Laranja", "300ml", "R$3,00", R.drawable.sucodelaranja));
        listSucos.add(new Sucos("Limão", "300ml", "R$3,00", R.drawable.sucodelimao));
        listSucos.add(new Sucos("Manga", "300ml", "R$2,50", R.drawable.sucodemanga));
        listSucos.add(new Sucos("Maracujá", "300ml", "R$3,00", R.drawable.sucomaracujaa));
    }
}