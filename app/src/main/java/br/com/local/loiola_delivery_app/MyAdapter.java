package br.com.local.loiola_delivery_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1 [], data2 [], data3[];
    int images[];
    Context context;


    public MyAdapter(Context ct, String s1[], String s2[], String s3[], int images[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = images;
    }
    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.modelo_pizza, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

        holder.pizzaTitulo.setText(data1[position]);
        holder.pizzaDescriacao.setText(data2[position]);
        holder.pizzaValor.setText(data3[position]);
        holder.pizzaImg.setImageResource(images[position]);



    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView pizzaTitulo, pizzaDescriacao,pizzaValor;
        ImageView pizzaImg;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            pizzaTitulo = itemView.findViewById(R.id.pizzaTitulo);
            pizzaDescriacao = itemView.findViewById(R.id.pizzaDescricao);
            pizzaValor = itemView.findViewById(R.id.pizzaValor);
            pizzaImg = itemView.findViewById(R.id.pizzaImg);


        }
    }
}
