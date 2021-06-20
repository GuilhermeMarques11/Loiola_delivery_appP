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

import java.util.List;

public class RecyclerSucoAdapter extends RecyclerView.Adapter<RecyclerSucoAdapter.MyViewHolder> {

    Context mContext;
    List<Sucos> mData;

    public RecyclerSucoAdapter(Context mContext, List<Sucos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.modelo_bebidas,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

        holder.tv_nome.setText(mData.get(position).getNome());
        holder.tv_descricao.setText(mData.get(position).getDescricao());
        holder.tv_valor.setText(mData.get(position).getValor());
        holder.img.setImageResource(mData.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_nome;
        private TextView tv_descricao;
        private TextView tv_valor;
        private ImageView img;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            tv_nome = (TextView) itemView.findViewById(R.id.bebidaTitulo);
            tv_descricao = (TextView) itemView.findViewById(R.id.bebidaDescricao);
            tv_valor = (TextView) itemView.findViewById(R.id.bebidaValor);
            img = (ImageView) itemView.findViewById(R.id.bebidaImg);
        }
    }
}
