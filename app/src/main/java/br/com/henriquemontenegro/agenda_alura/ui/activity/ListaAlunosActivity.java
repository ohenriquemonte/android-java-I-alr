package br.com.henriquemontenegro.agenda_alura.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.henriquemontenegro.agenda_alura.R;

public class ListaAlunosActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_alunos);
		setTitle("Lista de Alunos");
		
		List<String> alunos = new ArrayList<>(Arrays.asList("Henrique", "Bueno", "Montenegro"));
		ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
		listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));
	}
}