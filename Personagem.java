/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package JOGOJAVA;

/**
 *
 * @author LUCASMACHADOFLORAO
 */

public interface Personagem {
    void atacar(Personagem inimigo);
    void usarMagia(Personagem inimigo);
    void usarItem();
    void fugir();
    int getForca();
    int getVida();
    int getMana();
    void receberDano(int dano);
    void restaurarMana();
    void restaurarVida();
    String getNome();
}

