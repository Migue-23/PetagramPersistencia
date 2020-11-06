package com.example.petagrampersistencia.presenter;

import android.content.Context;

import com.example.petagrampersistencia.db.ConstructorMascotas;
import com.example.petagrampersistencia.fragments.IPerfilFragmentView;
import com.example.petagrampersistencia.pojo.Mascota;

import java.util.ArrayList;

public class PerfilFragmentPresenter implements IPerfilFragmentPresenter {
    private IPerfilFragmentView iPerfilFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    public PerfilFragmentPresenter(IPerfilFragmentView iPerfilFragmentView, Context context){
        this.iPerfilFragmentView=iPerfilFragmentView;
        this.context=context;
        mostrarMascotasRecyclerView();

    }

    @Override
    public ArrayList<Mascota> obtenerMascotas() {
        constructorMascotas=new ConstructorMascotas(context);
        return constructorMascotas.obtenerDatos();
    }

    @Override
    public void mostrarMascotasRecyclerView() {
        ArrayList<Mascota> arregloPerfil=new ArrayList<>();
        Mascota perfil=obtenerMascotas().get(0);
        for (int i=0;i<6;i++){
            arregloPerfil.add(perfil);
        }

        iPerfilFragmentView.inicializarAdaptadorRV(iPerfilFragmentView.crearAdaptador(arregloPerfil));
        iPerfilFragmentView.generarGridLayout();

    }
}
