/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esa.latihan.latihanmvcjdbc.event;

import edu.esa.latihan.latihanmvcjdbc.entity.Pelanggan;
import edu.esa.latihan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Esa
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
