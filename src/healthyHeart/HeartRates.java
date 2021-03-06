package healthyHeart;

import java.util.Scanner;
import java.time.Year;

    // Atributos
public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    // Construtor
    public HeartRates() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        this.setNome(s.nextLine());
        System.out.print("Sobrenome: ");
        this.setSobrenome(s.nextLine());
        System.out.print("Dia do nascimento: ");
        this.setDiaNasc(s.nextInt());
        System.out.print("Mês do nascimento: ");
        this.setMesNasc(s.nextInt());
        System.out.print("Ano do nascimento: ");
        this.setAnoNasc(s.nextInt());
    }

    // Métodos
    public void exibeNomeCompleto() {
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
    }

    public void exibeDataNasc() {
        System.out.println("Data de nascimento: " + this.getDiaNasc() + "/" + this.getMesNasc() + "/" + this.getAnoNasc());
    }

    public int calcIdade() {
        int anoAtual = Year.now().getValue();
        return anoAtual - this.getAnoNasc();
    }

    public void exibeIdade() {
        System.out.println(calcIdade() + " anos de idade");
    }

    public int calcFreqMax() {
        return 220 - this.calcIdade();
    }

    public void exibeFreqMax() {
        System.out.println("Frequência cardíaca máxima: " + calcFreqMax() + " bpm");
    }

    public double calcFreqAlvoMin() { return calcFreqMax() * 0.5; }

    public double calcFreqAlvoMax() { return calcFreqMax() * 0.85; }

    public void exibeFreqAlvo() {
        System.out.println("Frequência cardíaca alvo: entre " + calcFreqAlvoMin() + " e " + calcFreqAlvoMax());
    }

    public boolean avaliacaoFisica() {
        System.out.println("** Resultado da avaliação **");
        if (this.calcFreqMax() <= 200) {
            System.out.println("Pode praticar exercícios de alta intensidade");
            return true;
        } else {
            System.out.println("Não aconselhamos a prática de exercícios de alta intensidade");
            return false;
        }
    }

    public String getNome() {return nome;}
    public String getSobrenome() {return sobrenome;}
    public int getDiaNasc() {return diaNasc;}
    public int getMesNasc() {return mesNasc;}
    public int getAnoNasc() {return anoNasc;}

    public void setNome(String nome) {this.nome = nome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
    public void setDiaNasc(int diaNasc) {this.diaNasc = diaNasc;}
    public void setMesNasc(int mesNasc) {this.mesNasc = mesNasc;}
    public void setAnoNasc(int anoNasc) {this.anoNasc = anoNasc;}
}
