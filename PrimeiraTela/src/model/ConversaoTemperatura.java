package model;

public class ConversaoTemperatura {
	
	public float convFtoC(float tempF) {
		float tempConvertida = (tempF - 32f) * 5f / 9f;
		return tempConvertida;
	}
	
}
