package com.example.ejerciciopokemon.model;

import android.util.Log;

public class Squirtle extends Pokemon implements IAgua{
    @Override
    public void atacarPlacaje() {
        Log.e("Squirtle","Soy Squirtle y estoy atacando placaje");

    }

    @Override
    public void atacarAraniaso() {
        Log.e("Squirtle","soy Squirtle y esto atacando arañaso");


    }

    @Override
    public void atacarMordsico() {
        Log.e("Squirtle","soy Squirtle y estoy atacando mordisco ");

    }

    @Override
    public void atacarHidrobomba() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Hidrobomba");

    }

    @Override
    public void atacarPistolaAgua() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque PistolaAgua");

    }

    @Override
    public void atacarBurbuja() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Burbuja");

    }

    @Override
    public void atacarHidropulso() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Hidropulso");

    }
}
