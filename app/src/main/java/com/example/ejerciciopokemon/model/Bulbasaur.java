package com.example.ejerciciopokemon.model;

import android.util.Log;

public class Bulbasaur extends Pokemon implements IPlanta {
    @Override
    public void atacarPlacaje() {
        Log.e("Bulbasaur","Soy Bulbasaur y estoy atacando placaje");

    }

    @Override
    public void atacarAraniaso() {
        Log.e("Bulbasaur","soy Bulbasaur y esto atacando arañaso");

    }

    @Override
    public void atacarMordsico() {
        Log.e("Bulbasaur","soy Bulbasaur y estoy atacando mordisco ");

    }

    @Override
    public void atacarParalizar() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Paralizador");

    }

    @Override
    public void atacarDrenaje() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Drenaje");

    }

    @Override
    public void atacarHojaAfilada() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque afilada");

    }

    @Override
    public void atacarLatigoCepa() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque latigoCepa");

    }
}
