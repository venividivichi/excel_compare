package com.nazar.learning.excel.models;

/**
 * Created by Nazar on 23.05.2016.
 */
public class Model2 {


    String BrandAndModel;
    String Engine;
    String TypeFuel;
    String Year;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model2 model2 = (Model2) o;

        if (BrandAndModel != null ? !BrandAndModel.equals(model2.BrandAndModel) : model2.BrandAndModel != null)
            return false;
        if (Engine != null ? !Engine.equals(model2.Engine) : model2.Engine != null) return false;
        if (TypeFuel != null ? !TypeFuel.equals(model2.TypeFuel) : model2.TypeFuel != null) return false;
        return Year != null ? Year.equals(model2.Year) : model2.Year == null;

    }



    @Override
    public String toString() {
        return "com.nazar.learning.excel.models.Model2{" +
                "BrandAndModel='" + BrandAndModel + '\'' +
                ", Engine='" + Engine + '\'' +
                ", TypeFuel='" + TypeFuel + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        int result = BrandAndModel.hashCode();
        result = 31 * result + Engine.hashCode();
        result = 31 * result + TypeFuel.hashCode();
        result = 31 * result + Year.hashCode();
        return result;
    }

    public String getBrandAndModel() {
        return BrandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        BrandAndModel = brandAndModel;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getTypeFuel() {
        return TypeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        TypeFuel = typeFuel;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
