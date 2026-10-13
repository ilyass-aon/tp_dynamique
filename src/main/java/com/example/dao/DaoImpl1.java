package com.example.dao;

public class DaoImpl1 implements IDao {
    @Override
    public double getValue() {

        System.out.println("[DAO] Récupération de la valeur depuis le capteur ...");
        return 500.0;
    }
}
