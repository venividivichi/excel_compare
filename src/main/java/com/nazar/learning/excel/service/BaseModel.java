package com.nazar.learning.excel.service;

/**
 * Created by user on 24.05.2016.
 */
public abstract class BaseModel {

    Integer Comparesing;
    String dateReg;
    String operation;
    String markAndModel;
    String type;
    String capacity;
    String year;
    String owner;
    String typeOwner;


    @Override
    public String toString() {
        return "com.nazar.learning.excel.service.BaseModel{" +
                "Comparesing=" + Comparesing +
                ", dateReg='" + dateReg + '\'' +
                ", operation='" + operation + '\'' +
                ", markAndModel='" + markAndModel + '\'' +
                ", type='" + type + '\'' +
                ", capacity='" + capacity + '\'' +
                ", year='" + year + '\'' +
                ", owner='" + owner + '\'' +
                ", typeOwner='" + typeOwner + '\'' +
                ", ipn='" + ipn + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseModel)) return false;

        BaseModel baseModel = (BaseModel) o;

        if (getComparesing() != null ? !getComparesing().equals(baseModel.getComparesing()) : baseModel.getComparesing() != null)
            return false;
        if (getDateReg() != null ? !getDateReg().equals(baseModel.getDateReg()) : baseModel.getDateReg() != null)
            return false;
        if (getOperation() != null ? !getOperation().equals(baseModel.getOperation()) : baseModel.getOperation() != null)
            return false;
        if (getMarkAndModel() != null ? !getMarkAndModel().equals(baseModel.getMarkAndModel()) : baseModel.getMarkAndModel() != null)
            return false;
        if (getType() != null ? !getType().equals(baseModel.getType()) : baseModel.getType() != null) return false;
        if (getCapacity() != null ? !getCapacity().equals(baseModel.getCapacity()) : baseModel.getCapacity() != null)
            return false;
        if (getYear() != null ? !getYear().equals(baseModel.getYear()) : baseModel.getYear() != null) return false;
        if (getOwner() != null ? !getOwner().equals(baseModel.getOwner()) : baseModel.getOwner() != null) return false;
        if (getTypeOwner() != null ? !getTypeOwner().equals(baseModel.getTypeOwner()) : baseModel.getTypeOwner() != null)
            return false;
        if (getIpn() != null ? !getIpn().equals(baseModel.getIpn()) : baseModel.getIpn() != null) return false;
        if (getBirthDate() != null ? !getBirthDate().equals(baseModel.getBirthDate()) : baseModel.getBirthDate() != null)
            return false;
        if (getName() != null ? !getName().equals(baseModel.getName()) : baseModel.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(baseModel.getSurname()) : baseModel.getSurname() != null)
            return false;
        return getPhone() != null ? getPhone().equals(baseModel.getPhone()) : baseModel.getPhone() == null;

    }

    @Override
    public int hashCode() {
        int result = getComparesing() != null ? getComparesing().hashCode() : 0;
        result = 31 * result + (getDateReg() != null ? getDateReg().hashCode() : 0);
        result = 31 * result + (getOperation() != null ? getOperation().hashCode() : 0);
        result = 31 * result + (getMarkAndModel() != null ? getMarkAndModel().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getCapacity() != null ? getCapacity().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getTypeOwner() != null ? getTypeOwner().hashCode() : 0);
        result = 31 * result + (getIpn() != null ? getIpn().hashCode() : 0);
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }

    String ipn;
    String birthDate;

    String name;

    String surname;

    String phone;



    public Integer getComparesing() {
        return Comparesing;
    }

    public void setComparesing(Integer comparesing) {
        Comparesing = comparesing;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMarkAndModel() {
        return markAndModel;
    }

    public void setMarkAndModel(String markAndModel) {
        this.markAndModel = markAndModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTypeOwner() {
        return typeOwner;
    }

    public void setTypeOwner(String typeOwner) {
        this.typeOwner = typeOwner;
    }

    public String getIpn() {
        return ipn;
    }

    public void setIpn(String ipn) {
        this.ipn = ipn;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
