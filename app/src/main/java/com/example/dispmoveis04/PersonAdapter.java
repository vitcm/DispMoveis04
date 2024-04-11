package com.example.dispmoveis04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> personList;
    private Context context;

    public PersonAdapter(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.textViewNome.setText("Nome: " + person.getNome());
        holder.textViewCPF.setText("CPF: " + person.getCPF());
        holder.textViewDataNascimento.setText("Data de Nascimento: " + person.getDataNascimento());
        holder.textViewTelefone.setText("Telefone: " + person.getTelefone());
        holder.textViewCelular.setText("Celular: " + person.getCelular());
        holder.textViewEmail.setText("Email: " + person.getEmail());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNome, textViewCPF, textViewDataNascimento, textViewTelefone, textViewCelular, textViewEmail;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewCPF = itemView.findViewById(R.id.textViewCPF);
            textViewDataNascimento = itemView.findViewById(R.id.textViewDataNascimento);
            textViewTelefone = itemView.findViewById(R.id.textViewTelefone);
            textViewCelular = itemView.findViewById(R.id.textViewCelular);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
        }
    }
}