/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOGOJAVA;

/**
 *
 * @author LUCASMACHADOFLORAO
 */
import java.util.Random;

public class Dados {
    private Random random = new Random();

    public int rolarDado(int faces) {
        return random.nextInt(faces) + 1;
    }
}
