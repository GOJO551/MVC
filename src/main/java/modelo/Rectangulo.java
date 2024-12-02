package modelo;

public class Rectangulo {
    //declaramos los atrivutos en la clase rectangulo
    //en este caso nececito solo la vase y la altura
    private int base;
    private int altura;
    //Implementamos un costructor vacio
    public Rectangulo() {

    }
    //constructor que inicialice todas las variables
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //implementamos los metodos get y seder

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    //crear un metodo que calcule el area de un rectangulo
    public int getArea() {
        return this.base * this.altura;
    }


}
