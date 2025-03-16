package com.example.ejerciciopokemon;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ejerciciopokemon.model.Bulbasaur;
import com.example.ejerciciopokemon.model.Charmander;
import com.example.ejerciciopokemon.model.Pikachu;
import com.example.ejerciciopokemon.model.Squirtle;
public class PokemonActivity extends AppCompatActivity {
    Pikachu pikachuObjeto;
    Charmander charmanderObjeto;
    Squirtle squirtleObjeto;
    Bulbasaur bulbasaurObjeto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pokemon);
        pikachuObjeto = new Pikachu();
        pikachuObjeto.numPokedex = 25;
        pikachuObjeto.nombre = "Pikachu Autonomo";
        pikachuObjeto.peso = 2.5;
        pikachuObjeto.sexo = "Macho";
        pikachuObjeto.temporada = "Primera";
        pikachuObjeto.tipo = "Electrico";
        pikachuObjeto.atacarImpacTrueno();
        pikachuObjeto.atacarRayo();
        pikachuObjeto.atacarPunioTrueno();
        pikachuObjeto.atacarRayoCarga();
        charmanderObjeto=new Charmander();
        charmanderObjeto.numPokedex=4;
        charmanderObjeto.nombre="charmander";
        charmanderObjeto.peso=8.6;
        charmanderObjeto.sexo="macho";
        charmanderObjeto.temporada="primera";
        charmanderObjeto.tipo="Fuego";
        charmanderObjeto.atacarLanzallamas();
        charmanderObjeto.atacarAscuas();
        charmanderObjeto.atacarPunioFuego();
        squirtleObjeto = new  Squirtle();
        squirtleObjeto.numPokedex=4;
        squirtleObjeto.nombre="Squirtle";
        squirtleObjeto.peso=8.6;
        squirtleObjeto.sexo="macho";
        squirtleObjeto.temporada="primera";
        squirtleObjeto.tipo="agua";
        squirtleObjeto.atacarHidrobomba();
        squirtleObjeto.atacarPistolaAgua();
        squirtleObjeto.atacarBurbuja();
        squirtleObjeto.atacarHidropulso();
        bulbasaurObjeto=new Bulbasaur();
        bulbasaurObjeto.numPokedex=43;
        bulbasaurObjeto.nombre="Bulbarsaur";
        bulbasaurObjeto.peso=10;
        bulbasaurObjeto.sexo="hembra";
        bulbasaurObjeto.temporada="primera";
        bulbasaurObjeto.tipo="Planta";
        bulbasaurObjeto.atacarParalizar();
        bulbasaurObjeto.atacarDrenaje();
        bulbasaurObjeto.atacarHojaAfilada();
        bulbasaurObjeto.atacarLatigoCepa();
    }
}