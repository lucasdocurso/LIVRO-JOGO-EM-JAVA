/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JOGOJAVA;

/**
 *
 * @author LUCASMACHADOFLORAO
 */
public class PrincipeServo implements Personagem {
    private String nome;
    private int forca;
    private int vida;
    private int mana;

    public PrincipeServo(String nome) {
        this.nome = nome;
        this.forca = 10;  
        this.vida = 25;    
        this.mana = 10;   
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com sua espada!");
        int dano = new Dados().rolarDado(8) + forca;  
        inimigo.receberDano(dano);
    }

    @Override
    public void usarMagia(Personagem inimigo) {
        System.out.println(nome + " lança uma magia!");
        int dano = new Dados().rolarDado(6) + mana;
        inimigo.receberDano(dano);
        mana -= 1;
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usou uma pocao de elixir negro!.");
        this.vida += 5;  // curar 5 de vida
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
        vida += 5;
    }

    @Override
    public String getNome() {
        return nome;
    }
}


