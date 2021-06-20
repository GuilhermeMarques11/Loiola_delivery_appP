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


public class Fragment_Brotinhos extends Fragment {

   View v;
   private RecyclerView myrecyclerview;
   private List<PizzasBrotinhos> listPizzasBrotinhos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__brotinhos, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.pizzaBro_recyclerview);
        RecyclerPBAdapter recyclerPBAdapter = new RecyclerPBAdapter(getContext(),listPizzasBrotinhos);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerPBAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listPizzasBrotinhos = new ArrayList<>();
        listPizzasBrotinhos.add(new PizzasBrotinhos("Muçarela","molho de tomate, muçarela, orégano...","R$15,90", R.drawable.pizzademussarela));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Peperone","molho de tomate, peperone e muçarela","R$18,00", R.drawable.pizzadepeperoni));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Marguerita","molho de tomate, muçarela, manjericão...","R$15,90", R.drawable.pizzademarguerita));
        listPizzasBrotinhos.add(new PizzasBrotinhos("4 Queijos","molho de tomate, catupiry, muçarela...","R$25,00", R.drawable.pizzaquatroqueijos));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Bacon","molho de tomate, muçarela e bacon","R$19,80", R.drawable.pizzadebacon));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Calabresa","molho de tomate, calabresa e cebola","R$16,80", R.drawable.pizzadecalabresa));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Bauru","molho de tomate, presunto, muçarela e tomate","R$15,90", R.drawable.pizzabauru));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Portuguesa","molho de tomate, presunto, ovos, milho...","R$25,00", R.drawable.pizzadeportuguesa));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Atum","molho de tomate, atum e muçarela","R$17,50", R.drawable.pizzadeatum));
        listPizzasBrotinhos.add(new PizzasBrotinhos("Frango com Catupiry","molho de tomate, frango e catupiry","R$25,00", R.drawable.pizzadefrangocatupiry));

    }

    }
