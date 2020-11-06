package com.example.petagrampersistencia.presenter;

import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentPresenter {
    public ArrayList<Mascota> obtenerMascotas();
    public void mostrarMascotasRecyclerView();
}
