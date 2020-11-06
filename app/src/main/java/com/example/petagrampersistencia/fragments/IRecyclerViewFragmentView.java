package com.example.petagrampersistencia.fragments;

import com.example.petagrampersistencia.adapter.MascotaAdaptador;
import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView  {
    public void generarLinerLayoutVertical();
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
