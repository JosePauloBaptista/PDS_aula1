package Modelo;

public class Calcular {

	public float calcPerimetro(float base, float altura) {
		float perimetro = 2 * (base * altura);
		return perimetro;
	}
	public float calcArea(float base, float altura) {
		float area = base * altura;
		return area;
	}
}