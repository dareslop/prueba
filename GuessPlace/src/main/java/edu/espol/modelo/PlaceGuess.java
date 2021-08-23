/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.espol.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author angie
 */
public class PlaceGuess {
    public static ArrayList<PlaceGuess> guesses = new ArrayList<>();
    private String respuesta;
    private List<String> opciones;
    private String imagen;

    public PlaceGuess(String respuesta, List<String> opciones, String imagen) {
        this.respuesta = respuesta;
        this.opciones = opciones;
        this.imagen = imagen;
    }
    
    public static void llenarGuesses(){
        String[] lugares1={"Vienna","Budapest","Praga"};
        guesses.add(new PlaceGuess("Budapest",Arrays.asList(lugares1),"https://javitour.com/wp-content/uploads/2017/11/Parlamento-de-Budapest-1_opt-1200x900.jpg"));
        
        String[] lugares2={"Kuala Lumpur","Singapur","New Delhi","Langkawi"};
        guesses.add(new PlaceGuess("Kuala Lumpur",Arrays.asList(lugares2),"https://capturetheatlas.com/wp-content/uploads/2020/09/Batu-Caves-things-to-do-in-Kuala-Lumpur.jpg"));
        
        String img="https://www.ngenespanol.com/wp-content/uploads/2018/08/Los-%C3%A1rboles-futuristas-de-Singapur-1280x720.jpg";
        String[] lugares3={"Tokio","Singapur"};
        guesses.add(new PlaceGuess("Singapur",Arrays.asList(lugares3), img));
        
        String img2="https://portal.andina.pe/EDPfotografia3/Thumbnail/2020/01/15/000645488W.jpg";
        String[] lugares4={"Bangkok","Phuket","Wuhan"};
        guesses.add(new PlaceGuess("Bangkok",Arrays.asList(lugares4), img2));
        
        String img3="https://i.pinimg.com/originals/cf/65/77/cf657726e9c10fda7cec7db0c5c780ff.jpg";
        String[] lugares5={"Sevilla","Cuenca","Cali","Lima"};
        guesses.add(new PlaceGuess("Cuenca",Arrays.asList(lugares5), img3));
    }
    
    public static PlaceGuess getRandom(){
        Random r = new Random();
        return guesses.get(r.nextInt(guesses.size()));
    }

    public static ArrayList<PlaceGuess> getGuesses() {
        return guesses;
    }

    public static void setGuesses(ArrayList<PlaceGuess> guesses) {
        PlaceGuess.guesses = guesses;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
