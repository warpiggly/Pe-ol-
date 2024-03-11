package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.HotelesAmpliados;
import com.example.sanrafa.R;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    public ArrayList<Hotel> ListaHoteles;

    //constructor vacio
    public HotelAdaptador() {
    }

    //constructor lleno
    public HotelAdaptador(ArrayList<Hotel> listaHoteles) {
        this.ListaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
         return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.pintarMolde(ListaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotomoldehotel;
        TextView nombrehotelmolde;
        TextView preciohotelmolde;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldehotel=itemView.findViewById(R.id.fotomoldehotel);
            nombrehotelmolde=itemView.findViewById(R.id.nombrehotelmolde);
            preciohotelmolde=itemView.findViewById(R.id.preciohotelmolde);
        }

        public void pintarMolde(Hotel hotel) {
            fotomoldehotel.setImageResource(hotel.getFotoGrafia());
            nombrehotelmolde.setText(hotel.getNombre());
            preciohotelmolde.setText(hotel.getPrecio());

            //Quiero escuchar click en cada uno de los elementos de la lista

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HotelesAmpliados.class);
                    intent.putExtra("datoshotel",hotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
