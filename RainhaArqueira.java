/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOGOJAVA;

/**
 *
 * @author LUCASMACHADOFLORAO
 */    
public class RainhaArqueira implements Personagem {
    private String nome;
    private int forca;
    private int vida;
    private int mana;

    public RainhaArqueira(String nome) {
        this.nome = nome;
        this.forca = 8;   
        this.vida = 20;   
        this.mana = 15;   
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com seu arco!");
        int dano = new Dados().rolarDado(6) + forca;  
        inimigo.receberDano(dano);
    }

    @Override
    public void usarMagia(Personagem inimigo) {
        System.out.println(nome + " lança uma flecha mágica!");
        int dano = new Dados().rolarDado(8) + mana;
        inimigo.receberDano(dano);
        mana -= 2;
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usou uma pocao de cura.");
        this.vida += 7;  // aqui ira curar 7 vida
    }

    @Override
    public void fugir() {
        System.out.println(nome + " fugiu do combate!");
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
    }

    @Override
    public void restaurarMana() {
        mana += 3;
    }

    @Override
    public void restaurarVida() {
        vida += 8;
    }

    @Override
    public String getNome() {
        return nome;
    }
}


