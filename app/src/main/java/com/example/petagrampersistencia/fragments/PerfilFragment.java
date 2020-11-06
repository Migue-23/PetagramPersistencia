package com.example.petagrampersistencia.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagrampersistencia.R;
import com.example.petagrampersistencia.adapter.PerfilAdaptador;
import com.example.petagrampersistencia.pojo.Mascota;
import com.example.petagrampersistencia.presenter.IPerfilFragmentPresenter;
import com.example.petagrampersistencia.presenter.PerfilFragmentPresenter;

import java.util.ArrayList;

public class PerfilFragment extends Fragment implements IPerfilFragmentView {
    private RecyclerView recyclerView;
    private ArrayList<Mascota> perfilMascota;
    private TextView textView;
    private IPerfilFragmentPresenter presenter;
    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_perfil, container, false);
        recyclerView=v.findViewById(R.id.rvPerfil);
        textView=v.findViewById(R.id.nombrePerfil);
        presenter=new PerfilFragmentPresenter(this,getContext());



        return v;
    }


    @Override
    public void generarGridLayout() {
        GridLayoutManager mglm=new GridLayoutManager(getContext(),3);
        //mglm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mglm);

    }

    @Override
    public PerfilAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        PerfilAdaptador adaptador=new PerfilAdaptador(mascotas,getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(PerfilAdaptador adaptador) {
        recyclerView.setAdapter(adaptador);
    }
}