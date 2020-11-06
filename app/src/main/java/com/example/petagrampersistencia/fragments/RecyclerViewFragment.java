package com.example.petagrampersistencia.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petagrampersistencia.R;
import com.example.petagrampersistencia.activities.Activity5MascotasFavoritas;
import com.example.petagrampersistencia.adapter.MascotaAdaptador;
import com.example.petagrampersistencia.pojo.Mascota;
import com.example.petagrampersistencia.presenter.IRecyclerViewFragmentPresenter;
import com.example.petagrampersistencia.presenter.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView {
    private RecyclerView listaMascotas;
    static ArrayList<Mascota> mascotas;
    private IRecyclerViewFragmentPresenter presenter;
    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_recycler_view, container, false);
        listaMascotas=(RecyclerView)v.findViewById(R.id.rvMascotas);
        presenter=new RecyclerViewFragmentPresenter(this,getContext());



        return v;
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public void launchFavoritos(MenuItem item) {
        Intent intent =new Intent(getContext(), Activity5MascotasFavoritas.class);

        startActivity(intent);
    }


    @Override
    public void generarLinerLayoutVertical() {
        LinearLayoutManager mllm=new LinearLayoutManager(getContext());
        mllm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(mllm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas,getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}