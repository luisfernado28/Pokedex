package bo.upb.programacion3.codelabpokedex.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import bo.upb.programacion3.codelabpokedex.R;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textViewName;
    public TextView textViewType;

    public PokemonViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageViewPokemon);
        this.textViewName = itemView.findViewById(R.id.textViewName);
        this.textViewType = itemView.findViewById(R.id.textViewType);
    }
}