/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaLista.controller;

import ClinicaLista.dao.ClinicDAO;
import ClinicaLista.model.Clinic;

public class ClinicController {
    private final ClinicDAO clinicDAO;
    

    public ClinicController(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    public String insertClinic(String doctor, String query, String date) {
        try {
            Clinic clinic = new Clinic(doctor, query, date);
            clinicDAO.insertClinic(clinic);
            return "Dados inseridos com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}

    /*public static String insertClinic(String doctor, String query, String date) {
        try{
            Clinic clinic = new Clinic(doctor,query,date);
            ClinicDAO clinicDAO = new ClinicDAO();
            clinicDAO.insertClinic(clinic);
        }
        catch(NumberFormatException e) {
            return "Erro" + e.getMessage();
        }
        return null;*/
    
