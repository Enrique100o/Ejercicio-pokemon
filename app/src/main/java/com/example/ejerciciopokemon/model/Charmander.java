package com.example.ejerciciopokemon.model;

import android.util.Log;

public class Charmander extends Pokemon implements IFuego {
    @Override
    public void atacarPlacaje() {
        Log.e("Charmander","Soy Charmander y estoy atacando placaje");
    }



    @Override
    public void atacarAraniaso() {
        Log.e("Charmander","soy Charmander y esto atacando arañaso");


    }

    @Override
    public void atacarMordsico() {
        Log.e("Charmander","soy Charmander y estoy atacando mordisco ");


    }

    @Override
    public void atacarPunioFuego() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque puño trueno");

    }

    @Override
    public void atacarAscuas() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque puño trueno");

    }

    @Override
    public void atacarLanzallamas() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque puño trueno");

    }
}
