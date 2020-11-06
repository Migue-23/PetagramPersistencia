package com.example.petagrampersistencia.presenter;

import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public interface IActivity5MascotasFavoritasPresenter {
    public ArrayList<Mascota> obtenerMascotas();
    public void mostrarMascotasRecyclerView();
}
