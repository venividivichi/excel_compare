package com.nazar.learning.excel.models;

/**
 * Created by Nazar on 22.05.2016.
 */
public class Model {

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

    public String getName_Owner() {
        return Name_Owner;
    }

    public void setName_Owner(String name_Owner) {
        Name_Owner = name_Owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        if (Vin != null ? !Vin.equals(model.Vin) : model.Vin != null) return false;
        if (Doc != null ? !Doc.equals(model.Doc) : model.Doc != null) return false;
        if (Face_Mod != null ? !Face_Mod.equals(model.Face_Mod) : model.Face_Mod != null) return false;
        if (Tin != null ? !Tin.equals(model.Tin) : model.Tin != null) return false;
        if (Tin_Out != null ? !Tin_Out.equals(model.Tin_Out) : model.Tin_Out != null) return false;
        if (Ser_Nom != null ? !Ser_Nom.equals(model.Ser_Nom) : model.Ser_Nom != null) return false;
        if (D_Rog != null ? !D_Rog.equals(model.D_Rog) : model.D_Rog != null) return false;
        if (Name_Owner != null ? !Name_Owner.equals(model.Name_Owner) : model.Name_Owner != null) return false;
        if (Region != null ? !Region.equals(model.Region) : model.Region != null) return false;
        if (C_Territ != null ? !C_Territ.equals(model.C_Territ) : model.C_Territ != null) return false;
        if (C_Street != null ? !C_Street.equals(model.C_Street) : model.C_Street != null) return false;
        if (Name_Street != null ? !Name_Street.equals(model.Name_Street) : model.Name_Street != null) return false;
        if (N_House != null ? !N_House.equals(model.N_House) : model.N_House != null) return false;
        if (House_Add != null ? !House_Add.equals(model.House_Add) : model.House_Add != null) return false;
        if (N_Corp != null ? !N_Corp.equals(model.N_Corp) : model.N_Corp != null) return false;
        if (Apartment != null ? !Apartment.equals(model.Apartment) : model.Apartment != null) return false;
        if (Nom_Znak != null ? !Nom_Znak.equals(model.Nom_Znak) : model.Nom_Znak != null) return false;
        if (Marka != null ? !Marka.equals(model.Marka) : model.Marka != null) return false;
        if (Data_Vyp != null ? !Data_Vyp.equals(model.Data_Vyp) : model.Data_Vyp != null) return false;
        if (Nom_Kuz != null ? !Nom_Kuz.equals(model.Nom_Kuz) : model.Nom_Kuz != null) return false;
        if (Nom_Shassi != null ? !Nom_Shassi.equals(model.Nom_Shassi) : model.Nom_Shassi != null) return false;
        if (Vol_Engine != null ? !Vol_Engine.equals(model.Vol_Engine) : model.Vol_Engine != null) return false;
        if (Typ_Tr_Zas != null ? !Typ_Tr_Zas.equals(model.Typ_Tr_Zas) : model.Typ_Tr_Zas != null) return false;
        if (Typ_Kuz != null ? !Typ_Kuz.equals(model.Typ_Kuz) : model.Typ_Kuz != null) return false;
        if (Typ_Dll != null ? !Typ_Dll.equals(model.Typ_Dll) : model.Typ_Dll != null) return false;
        if (Data_Dll != null ? !Data_Dll.equals(model.Data_Dll) : model.Data_Dll != null) return false;
        return Fuel_Name != null ? Fuel_Name.equals(model.Fuel_Name) : model.Fuel_Name == null;

    }

    @Override
    public int hashCode() {
        int result = Vin != null ? Vin.hashCode() : 0;
        result = 31 * result + (Doc != null ? Doc.hashCode() : 0);
        result = 31 * result + (Face_Mod != null ? Face_Mod.hashCode() : 0);
        result = 31 * result + (Tin != null ? Tin.hashCode() : 0);
        result = 31 * result + (Tin_Out != null ? Tin_Out.hashCode() : 0);
        result = 31 * result + (Ser_Nom != null ? Ser_Nom.hashCode() : 0);
        result = 31 * result + (D_Rog != null ? D_Rog.hashCode() : 0);
        result = 31 * result + (Name_Owner != null ? Name_Owner.hashCode() : 0);
        result = 31 * result + (Region != null ? Region.hashCode() : 0);
        result = 31 * result + (C_Territ != null ? C_Territ.hashCode() : 0);
        result = 31 * result + (C_Street != null ? C_Street.hashCode() : 0);
        result = 31 * result + (Name_Street != null ? Name_Street.hashCode() : 0);
        result = 31 * result + (N_House != null ? N_House.hashCode() : 0);
        result = 31 * result + (House_Add != null ? House_Add.hashCode() : 0);
        result = 31 * result + (N_Corp != null ? N_Corp.hashCode() : 0);
        result = 31 * result + (Apartment != null ? Apartment.hashCode() : 0);
        result = 31 * result + (Nom_Znak != null ? Nom_Znak.hashCode() : 0);
        result = 31 * result + (Marka != null ? Marka.hashCode() : 0);
        result = 31 * result + (Data_Vyp != null ? Data_Vyp.hashCode() : 0);
        result = 31 * result + (Nom_Kuz != null ? Nom_Kuz.hashCode() : 0);
        result = 31 * result + (Nom_Shassi != null ? Nom_Shassi.hashCode() : 0);
        result = 31 * result + (Vol_Engine != null ? Vol_Engine.hashCode() : 0);
        result = 31 * result + (Typ_Tr_Zas != null ? Typ_Tr_Zas.hashCode() : 0);
        result = 31 * result + (Typ_Kuz != null ? Typ_Kuz.hashCode() : 0);
        result = 31 * result + (Typ_Dll != null ? Typ_Dll.hashCode() : 0);
        result = 31 * result + (Data_Dll != null ? Data_Dll.hashCode() : 0);
        result = 31 * result + (Fuel_Name != null ? Fuel_Name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Model{");
        sb.append("Vin='").append(Vin).append('\'');
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
        sb.append('}');
        return sb.toString();
    }


}
