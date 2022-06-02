
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lucas
 */
public class Orçamento {
    private String nomeserv;
    private double valorserv;
    private Date dataEmitida;
    private String observação;
    private int ano;
    private String numero;
    private String quantidade[];

    public Orçamento(String nomeserv, double valorserv, Date dataEmitida, String observação, int ano, String numero) {
        this.nomeserv = nomeserv;
        this.valorserv = valorserv;
        this.dataEmitida = dataEmitida;
        this.observação = observação;
        this.ano = ano;
        this.numero = numero;
        this.quantidade = new String[10];
    }
    
    //As primeiras inicializações
    public Orçamento(String nomeserv, double valorserv, String observação) {
        this.nomeserv = nomeserv;
        this.valorserv = valorserv;
        this.observação = observação;
        this.quantidade = new String[10];
        valueorcament();
    }
    private void valueorcament(){
        Calendar today = Calendar.getInstance();
        this.dataEmitida = today.getTime();
        this.ano = today.get(Calendar.YEAR);
        
        Random generate = new Random();
        this.numero = "" + (System.currentTimeMillis()/10) + "" + generate.nextInt(40000)+200000;
    }
    public void setNomeserv(String nomeserv) {
        this.nomeserv = nomeserv;
    }

    public void setValorserv(double valorserv) {
        this.valorserv = valorserv;
    }
    
    public String getNomeserv() {
        return nomeserv;
    }

    public double getValorserv() {
        return valorserv;
    }
}
