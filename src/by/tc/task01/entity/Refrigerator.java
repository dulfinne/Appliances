package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int overalCapacity;
	private int height;
	private int width;

	public Refrigerator() {
		super("Refrigerator");
	}

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, int overalCapacity, int height,
			int width) {
		super("Refrigerator");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overalCapacity = overalCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOveralCapacity() {
		return overalCapacity;
	}

	public void setOveralCapacity(int overalCapacity) {
		this.overalCapacity = overalCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(freezerCapacity, height, overalCapacity, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return Objects.equals(freezerCapacity, other.freezerCapacity) && Objects.equals(height, other.height)
				&& Objects.equals(overalCapacity, other.overalCapacity)
				&& Objects.equals(powerConsumption, other.powerConsumption) && Objects.equals(weight, other.weight)
				&& Objects.equals(width, other.width);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [powerConsumption=" + powerConsumption + ", weight=" + weight
				+ ", freezerCapacity=" + freezerCapacity + ", overalCapacity=" + overalCapacity + ", height=" + height
				+ ", width=" + width + "]";
	}

}