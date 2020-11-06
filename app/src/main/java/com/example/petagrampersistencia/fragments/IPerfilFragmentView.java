package com.example.petagrampersistencia.fragments;

import com.example.petagrampersistencia.adapter.PerfilAdaptador;
import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public interface IPerfilFragmentView {

    public  void generarGridLayout();
    public PerfilAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public  void inicializarAdaptadorRV(PerfilAdaptador adaptador);
}
