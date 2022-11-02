package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;

	public Oven() {
		super("Oven");
	}

	public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
		super("Oven");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, depth, height, powerConsumption, weight, width);
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
		Oven other = (Oven) obj;
		return Objects.equals(capacity, other.capacity) && Objects.equals(depth, other.depth)
				&& Objects.equals(height, other.height) && Objects.equals(powerConsumption, other.powerConsumption)
				&& Objects.equals(weight, other.weight) && Objects.equals(width, other.width);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity="
				+ capacity + ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

}