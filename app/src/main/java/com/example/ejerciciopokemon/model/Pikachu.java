package com.example.ejerciciopokemon.model;

import android.util.Log;

public class Pikachu extends Pokemon implements IElectrico{
    @Override
    public void atacarImpacTrueno() {
        Log.e("Pikachu","Soy pikachu y este es mi ataque trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        Log.e("Pikachu", "Soy pikachu y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        Log.e("Pikachu","Soy pikachu y este es mi ataque rayo");

    }

    @Override
    public void atacarRayoCarga() {
        Log.e("Pikachu","Soy pikachu y este es mi ataque rayo trueno");

    }

    @Override
    public void atacarPlacaje() {
        Log.e("Pikachu","Soy pikachu y estoy atacando placaje");
    }

    @Override
    public void atacarAraniaso() {
        Log.e("Pikachu","soy pikachu y esto atacando arañaso");
    }

    @Override
    public void atacarMordsico() {
        Log.e("Pikachu","soy pikachu y estoy atacando mordisco ");
    }
}
