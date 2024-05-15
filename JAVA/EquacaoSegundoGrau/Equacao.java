package EquacaoSegundoGrau;

/* Crie uma classe chamada Equação do segundo grau, métodos construtores, getters, setters e um método para resolver a equação do segundo grau. Crie 3 objetos e teste os métodos.
 */

class Equacao {
    public float a;
    public float b;
    public float c;
    private float delta;

    public Equacao(float a,float b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = 0;

    }

    public Equacao(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.delta = 0;

    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
    
    public float getC() {
        return c;
    }

    public float getDelta() {
        return delta;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    public String resolver(){
        String result = "";
    float delta = (b * b) - 4 * a * c;

    if (a == 0) {
        result = "Essa não é uma equação do segundo grau.";
    } else if (delta < 0) {
        result = "A equação não possui raízes reais.";
    } else if (delta > 0) {
        float raizDeDelta = (float) Math.sqrt(delta);
        float x1 = (-b + raizDeDelta) / (2 * a);
        float x2 = (-b - raizDeDelta) / (2 * a);
        result = "Possui 2 raízes reais: raiz1 = " + x1 + ", raiz2 = " + x2;
    } else { // delta == 0
        float x = -b / (2 * a);
        result = "Possui uma raiz real: x = " + x;
    }
    return result;
    }

}
