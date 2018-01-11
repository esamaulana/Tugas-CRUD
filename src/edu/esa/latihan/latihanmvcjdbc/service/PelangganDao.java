/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esa.latihan.latihanmvcjdbc.service;

import edu.esa.latihan.latihanmvcjdbc.entity.Pelanggan;
import edu.esa.latihan.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Esa
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> SelectAllPelanggan() throws PelangganException;
}
