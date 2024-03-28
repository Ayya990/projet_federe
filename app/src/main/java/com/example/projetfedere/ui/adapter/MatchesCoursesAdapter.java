
package com.example.projetfedere.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appsnipp.education.ui.listeners.MatchCourseClickListener;
import com.appsnipp.education.ui.model.MatchCourse;
import com.bumptech.glide.Glide;
import com.exemple.projetfedere.databinding.ItemShopCardBinding;

import java.util.List;

public class MatchesCoursesAdapter extends RecyclerView.Adapter<MatchesCoursesAdapter.ViewHolder> {

    private final List<MatchCourse> mData;
    private final MatchCourseClickListener matchCourseClickListener;

    public MatchesCoursesAdapter(List<MatchCourse> mData, MatchCourseClickListener listener) {
        this.mData = mData;
        this.matchCourseClickListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Créer une nouvelle vue pour chaque élément de la liste
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemShopCardBinding itemCardBinding = ItemShopCardBinding.inflate(inflater, parent, false);
        return new ViewHolder(itemCardBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Remplacer le contenu de la vue (éléments de données) à une position donnée
        holder.setBind(mData.get(position));
        // Définir un écouteur de clic pour l'élément de vue actuel
        holder.itemView.setOnClickListener(v -> {
            int adapterPosition = holder.getAdapterPosition();
            if (adapterPosition != RecyclerView.NO_POSITION) {
                MatchCourse course = mData.get(adapterPosition);
                matchCourseClickListener.onScrollPagerItemClick(course, holder.itemCardBinding.image);
            }
        });
    }

    @Override
    public int getItemCount() {
        // Retourne la taille de la liste des données
        return mData.size();
    }

    // ViewHolder pour maintenir une référence aux vues des éléments de données
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemShopCardBinding itemCardBinding;

        public ViewHolder(@NonNull ItemShopCardBinding cardBinding) {
            super(cardBinding.getRoot());
            this.itemCardBinding = cardBinding;
        }

        // Méthode pour lier les données aux vues de l'élément de la liste
        void setBind(MatchCourse matchCourse) {
            itemCardBinding.tvTitulo.setText(matchCourse.getName());
            itemCardBinding.tvCantidadCursos.setText(matchCourse.getNumberOfCourses());
            Glide.with(itemView.getContext()).load(matchCourse.getImageResource()).into(itemCardBinding.image);
        }
    }
}
