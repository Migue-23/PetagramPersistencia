package com.example.petagrampersistencia.activities;

import com.example.petagrampersistencia.adapter.MascotasFavoritasAdaptador;
import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public interface IActivity5MascotasFavoritasView {

    public void generarLinerLayoutVertical();
    public MascotasFavoritasAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotasFavoritasAdaptador adaptador);

}
