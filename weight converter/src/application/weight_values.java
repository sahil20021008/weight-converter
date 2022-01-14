package application;

import java.util.HashMap;

public class weight_values {
	
	private HashMap<String, Double>weights;
	
	public HashMap<String, Double> getWeights() {
		return weights;
	}

	public void setWeights(HashMap<String, Double> weights) {
		this.weights = weights;
	}
	public weight_values() {
		weights=new HashMap<>();
		weights.put("Kilogram", 1.0);
		weights.put("Tonne", 0.001);
		weights.put("Gram", 1000.0);
		weights.put("Milligram", 1000000.0);
		weights.put("Microgram", 1000000000.0);
		weights.put("Imperial ton", 0.000984207);
		weights.put("US ton", 0.00110231);
		weights.put("Stone", 0.157473);
		weights.put("Pound", 2.20462);
		weights.put("Ounce", 35.274);
	}
}
