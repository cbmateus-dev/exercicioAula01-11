public class CarroClass {
    String marca;
    String modelo;
    int velocidade;

    CarroClass(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidade = 0;
    }

    void printStatus() {
        System.out.println(
                "Carro [marca=" + this.marca + ", modelo=" + this.modelo + ", velocidade=" + this.velocidade + "]");
    }

    void acelerar(int adicionaVel) {
        int accel = this.velocidade + adicionaVel;
        if (accel >= 200) {
            accel = 200;
        }
        System.out.println(this.velocidade + " + " + adicionaVel + " > " + accel);
        this.velocidade = accel;
    }

    void frear(int reduzVel) {
        int frear = this.velocidade - reduzVel;
        if (frear <= 0) {
            frear = 0;
        }
        System.out.println(this.velocidade + " - " + reduzVel + " > " + frear);
        this.velocidade = frear;
    }
}
