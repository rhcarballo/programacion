package ies.puerto;

public class Rectangulo {
    private int largo;
    private int ancho;

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(){
    }

    public Rectangulo (int largo){
        this.largo=largo;
    }

    public Rectangulo (int largo, int ancho){
        this.largo=largo;
        this.ancho=ancho;
    }

    public int areaRectangulo (int largo, int ancho){
        int area = 0;

        area = largo*ancho;
        return area;
    }

    public int perimetroRectangulo (int largo, int ancho){
        int perimetro = 0;

        perimetro = (2*largo)*(2*ancho);
        return perimetro;
    }

    Rectangulo rectangulo1 = new Rectangulo(20, 10);
    Rectangulo rectangulo2 = new Rectangulo(70, 35);
}
