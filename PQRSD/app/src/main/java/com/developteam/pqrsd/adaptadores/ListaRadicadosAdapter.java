package com.developteam.pqrsd.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developteam.pqrsd.R;
import com.developteam.pqrsd.entidades.Radicados;

import java.util.ArrayList;

public class ListaRadicadosAdapter extends RecyclerView.Adapter<ListaRadicadosAdapter.RadicadoViewHolder> {

    ArrayList<Radicados> listaRadicados;

    public ListaRadicadosAdapter(ArrayList<Radicados> listaRadicados){
        this.listaRadicados = listaRadicados;
    }

    @NonNull
    @Override
    public RadicadoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_caso, null, false);
        return new RadicadoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RadicadoViewHolder holder, int position) {
        holder.viewNombre.setText(listaRadicados.get(position).getNombre());
        holder.viewCedula.setText(listaRadicados.get(position).getCedula());
        holder.viewTelefono.setText(listaRadicados.get(position).getTelefono());
        holder.viewE_mail.setText(listaRadicados.get(position).getE_mail());
        holder.viewTipo.setText(listaRadicados.get(position).getTipo());
        holder.viewAsunto.setText(listaRadicados.get(position).getAsunto());
        holder.viewDescripcion.setText(listaRadicados.get(position).getDescripcion());
        holder.viewRespuesta.setText(listaRadicados.get(position).getRespuesta());

    }

    @Override
    public int getItemCount() {
        return listaRadicados.size();
    }

    public class RadicadoViewHolder extends RecyclerView.ViewHolder {

        TextView viewNombre, viewCedula, viewTelefono, viewE_mail, viewTipo, viewAsunto, viewDescripcion, viewRespuesta;

        public RadicadoViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre = itemView.findViewById(R.id.viewNombre);
            viewCedula = itemView.findViewById(R.id.viewCedula);
            viewTelefono = itemView.findViewById(R.id.viewTelefono);
            viewE_mail = itemView.findViewById(R.id.viewE_mail);
            viewTipo = itemView.findViewById(R.id.viewTipo);
            viewAsunto = itemView.findViewById(R.id.viewAsunto);
            viewDescripcion = itemView.findViewById(R.id.viewDescripcion);
            viewRespuesta = itemView.findViewById(R.id.viewRespuesta);
        }
    }
}
