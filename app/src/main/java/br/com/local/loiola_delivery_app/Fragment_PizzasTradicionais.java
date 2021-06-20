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


public class Fragment_PizzasTradicionais extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<PizzasTradicionais> listPizzasTradicionais;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__pizzas_tradicionais, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.pizzaTra_recyclerview);
        RecyclerPTAdapter recyclerPTAdapter = new RecyclerPTAdapter(getContext(),listPizzasTradicionais);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerPTAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listPizzasTradicionais = new ArrayList<>();
        listPizzasTradicionais.add(new PizzasTradicionais("Muçarela","molho de tomate, muçarela, orégano...","R$22,90",R.drawable.pizzademussarela));
        listPizzasTradicionais.add(new PizzasTradicionais("Marguerita","molho de tomate, muçarela, manjericão...","R$28,50",R.drawable.pizzademarguerita));
        listPizzasTradicionais.add(new PizzasTradicionais("4 Queijos","molho de tomate, catupiry, muçarela...","R$32,90",R.drawable.pizzaquatroqueijos));
        listPizzasTradicionais.add(new PizzasTradicionais("Bacon","molho de tomate, muçarela e bacon","R$27,00",R.drawable.pizzadebacon));
        listPizzasTradicionais.add(new PizzasTradicionais("Calabresa","molho de tomate, calabresa e cebola","R$28,50",R.drawable.pizzadecalabresa));
        listPizzasTradicionais.add(new PizzasTradicionais("Baiana","molho de tomate, calabresa moída, ovos...","R$24,90",R.drawable.pizzabaiana));
        listPizzasTradicionais.add(new PizzasTradicionais("Americana","molho de tomate, presunto moído, ovos...","R$26,00",R.drawable.pizzaamericana));
        listPizzasTradicionais.add(new PizzasTradicionais("Bauru","molho de tomate, presunto, muçarela e tomate","R$24,60",R.drawable.pizzabauru));
        listPizzasTradicionais.add(new PizzasTradicionais("Portuguesa","molho de tomate, presunto, ovos, milho...","R$25,50",R.drawable.pizzadeportuguesa));
        listPizzasTradicionais.add(new PizzasTradicionais("Peperone","molho de tomate, peperone e muçarela","R$26,80",R.drawable.pizzadepeperoni));
        listPizzasTradicionais.add(new PizzasTradicionais("Lombo","molho de tomate, lombo e muçarela","R$28,00",R.drawable.pizzalombo));
        listPizzasTradicionais.add(new PizzasTradicionais("Peru","molho de tomate, peito de peru e muçarela","R$26,80",R.drawable.pizzadeperu));
        listPizzasTradicionais.add(new PizzasTradicionais("Nordestina","molho de tomate, carne seca, cebola...","R$30,00",R.drawable.carneseca));
        listPizzasTradicionais.add(new PizzasTradicionais("Atum","molho de tomate, atum e muçarela","R$25,90",R.drawable.pizzadeatum));
        listPizzasTradicionais.add(new PizzasTradicionais("Camarão","molho de tomate, camarão, palmito e muçarela","R$30,60",R.drawable.pizzacamarao));
        listPizzasTradicionais.add(new PizzasTradicionais("Escarola","molho de tomate, escarola, cebola...","R$25,80",R.drawable.pizzaescarola));
        listPizzasTradicionais.add(new PizzasTradicionais("Brócolis","molho de tomate, brócolis, cebola...","R$23,50",R.drawable.pizzabrocolis));
        listPizzasTradicionais.add(new PizzasTradicionais("Palmito","molho de tomate, palmito e muçarela","R$29,90",R.drawable.pizzadepalmito));
        listPizzasTradicionais.add(new PizzasTradicionais("Frango com Catupiry","molho de tomate, frango e catupiry","R$24,50",R.drawable.pizzadefrangocatupiry));
        listPizzasTradicionais.add(new PizzasTradicionais("A Moda da Casa","molho de tomate, presunto, azeitonas...","R$26,80",R.drawable.pizzaamodadacasa));
    }
}