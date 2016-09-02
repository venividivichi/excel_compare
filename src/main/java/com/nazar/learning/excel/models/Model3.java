package com.nazar.learning.excel.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.05.2016.
 */
public class Model3 {

    private Integer Comparesing;

    String Vin;
    String Doc;
    String Face_Mod;
    String Tin;
    String Tin_Out;
    String Ser_Nom;
    String D_Rog;
    String Name_Owner;
    String Region;
    String C_Territ;
    String C_Street;
    String Name_Street;
    String N_House;
    String House_Add;
    String N_Corp;
    String Apartment;
    String Nom_Znak;
    String Marka;
    String Data_Vyp;
    String Nom_Kuz;
    String Nom_Shassi;
    String Vol_Engine;
    String Typ_Tr_Zas;
    String Typ_Kuz;
    String Typ_Dll;
    String Data_Dll;
    String Fuel_Name;

    String BrandAndModel;
    String Engine;
    String TypeFuel;
    String Year;

    private Integer idfromDB;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Model3{");
        sb.append("Comparesing=").append(Comparesing);
        sb.append(", Vin='").append(Vin).append('\'');
        sb.append(", Doc='").append(Doc).append('\'');
        sb.append(", Face_Mod='").append(Face_Mod).append('\'');
        sb.append(", Tin='").append(Tin).append('\'');
        sb.append(", Tin_Out='").append(Tin_Out).append('\'');
        sb.append(", Ser_Nom='").append(Ser_Nom).append('\'');
        sb.append(", D_Rog='").append(D_Rog).append('\'');
        sb.append(", Name_Owner='").append(Name_Owner).append('\'');
        sb.append(", Region='").append(Region).append('\'');
        sb.append(", C_Territ='").append(C_Territ).append('\'');
        sb.append(", C_Street='").append(C_Street).append('\'');
        sb.append(", Name_Street='").append(Name_Street).append('\'');
        sb.append(", N_House='").append(N_House).append('\'');
        sb.append(", House_Add='").append(House_Add).append('\'');
        sb.append(", N_Corp='").append(N_Corp).append('\'');
        sb.append(", Apartment='").append(Apartment).append('\'');
        sb.append(", Nom_Znak='").append(Nom_Znak).append('\'');
        sb.append(", Marka='").append(Marka).append('\'');
        sb.append(", Data_Vyp='").append(Data_Vyp).append('\'');
        sb.append(", Nom_Kuz='").append(Nom_Kuz).append('\'');
        sb.append(", Nom_Shassi='").append(Nom_Shassi).append('\'');
        sb.append(", Vol_Engine='").append(Vol_Engine).append('\'');
        sb.append(", Typ_Tr_Zas='").append(Typ_Tr_Zas).append('\'');
        sb.append(", Typ_Kuz='").append(Typ_Kuz).append('\'');
        sb.append(", Typ_Dll='").append(Typ_Dll).append('\'');
        sb.append(", Data_Dll='").append(Data_Dll).append('\'');
        sb.append(", Fuel_Name='").append(Fuel_Name).append('\'');
        sb.append(", idfromDB=").append(idfromDB);
        sb.append('}');
        return sb.toString();
    }

    public Integer getIdfromDB() {
        return idfromDB;
    }

    public void setIdfromDB(Integer idfromDB) {
        this.idfromDB = idfromDB;
    }

    public Model3(Model model) {
        this.Vin = model.Vin;
        this.Doc = model.Doc;
        this.Face_Mod = model.Face_Mod;
        this.Tin = model.Tin;
        this.Tin_Out = model.Tin_Out;
        this.Ser_Nom = model.Ser_Nom;
        this.D_Rog = model.D_Rog;
        this.Name_Owner = model.Name_Owner;
        this.Region = model.Region;
        this.C_Territ = model.C_Territ;
        this.C_Street = model.C_Street;
        this.Name_Street = model.Name_Street;
        this.N_House = model.N_House;
        this.House_Add = model.House_Add;
        this.N_Corp = model.N_Corp;
        this.Apartment = model.Apartment;
        this.Nom_Znak = model.Nom_Znak;
        this.Marka = model.Marka;
        this.Data_Vyp = model.Data_Vyp;
        this.Nom_Kuz = model.Nom_Kuz;
        this.Nom_Shassi = model.Nom_Shassi;
        this.Vol_Engine = model.Vol_Engine;
        this.Typ_Tr_Zas = model.Typ_Tr_Zas;
        this.Typ_Kuz = model.Typ_Kuz;
        this.Typ_Dll = model.Typ_Dll;
        this.Data_Dll = model.Data_Dll;
        this.Fuel_Name = model.Fuel_Name;
    }

    public String getData_Dll() {
        return Data_Dll;
    }

    public void setData_Dll(String data_Dll) {
        Data_Dll = data_Dll;
    }

    public String getVin() {
        return Vin;
    }

    public void setVin(String vin) {
        Vin = vin;
    }

    public String getDoc() {
        return Doc;
    }

    public void setDoc(String doc) {
        Doc = doc;
    }

    public String getFace_Mod() {
        return Face_Mod;
    }

    public void setFace_Mod(String face_Mod) {
        Face_Mod = face_Mod;
    }

    public String getTin() {
        return Tin;
    }

    public void setTin(String tin) {
        Tin = tin;
    }

    public String getTin_Out() {
        return Tin_Out;
    }

    public void setTin_Out(String tin_Out) {
        Tin_Out = tin_Out;
    }

    public String getSer_Nom() {
        return Ser_Nom;
    }

    public void setSer_Nom(String ser_Nom) {
        Ser_Nom = ser_Nom;
    }

    public String getD_Rog() {
        return D_Rog;
    }

    public void setD_Rog(String d_Rog) {
        D_Rog = d_Rog;
    }

    public String getName_Owner() {
        return Name_Owner;
    }

    public void setName_Owner(String name_Owner) {
        Name_Owner = name_Owner;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getC_Territ() {
        return C_Territ;
    }

    public void setC_Territ(String c_Territ) {
        C_Territ = c_Territ;
    }

    public String getC_Street() {
        return C_Street;
    }

    public void setC_Street(String c_Street) {
        C_Street = c_Street;
    }

    public String getName_Street() {
        return Name_Street;
    }

    public void setName_Street(String name_Street) {
        Name_Street = name_Street;
    }

    public String getN_House() {
        return N_House;
    }

    public void setN_House(String n_House) {
        N_House = n_House;
    }

    public String getHouse_Add() {
        return House_Add;
    }

    public void setHouse_Add(String house_Add) {
        House_Add = house_Add;
    }

    public String getN_Corp() {
        return N_Corp;
    }

    public void setN_Corp(String n_Corp) {
        N_Corp = n_Corp;
    }

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }

    public String getNom_Znak() {
        return Nom_Znak;
    }

    public void setNom_Znak(String nom_Znak) {
        Nom_Znak = nom_Znak;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getData_Vyp() {
        return Data_Vyp;
    }

    public void setData_Vyp(String data_Vyp) {
        Data_Vyp = data_Vyp;
    }

    public String getNom_Kuz() {
        return Nom_Kuz;
    }

    public void setNom_Kuz(String nom_Kuz) {
        Nom_Kuz = nom_Kuz;
    }

    public String getNom_Shassi() {
        return Nom_Shassi;
    }

    public void setNom_Shassi(String nom_Shassi) {
        Nom_Shassi = nom_Shassi;
    }

    public String getVol_Engine() {
        return Vol_Engine;
    }

    public void setVol_Engine(String vol_Engine) {
        Vol_Engine = vol_Engine;
    }

    public String getTyp_Tr_Zas() {
        return Typ_Tr_Zas;
    }

    public void setTyp_Tr_Zas(String typ_Tr_Zas) {
        Typ_Tr_Zas = typ_Tr_Zas;
    }

    public String getTyp_Kuz() {
        return Typ_Kuz;
    }

    public void setTyp_Kuz(String typ_Kuz) {
        Typ_Kuz = typ_Kuz;
    }

    public String getTyp_Dll() {
        return Typ_Dll;
    }

    public void setTyp_Dll(String typ_Dll) {
        Typ_Dll = typ_Dll;
    }

    public String getFuel_Name() {
        return Fuel_Name;
    }

    public void setFuel_Name(String fuel_Name) {
        Fuel_Name = fuel_Name;
    }

    public Integer getComparesing() {
        return Comparesing;
    }

    public void setComparesing(Integer comparesing) {
        Comparesing = comparesing;
    }
}
