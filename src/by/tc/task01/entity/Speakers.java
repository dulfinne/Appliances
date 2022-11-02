package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public Speakers() {
		super("Speakers");
	}

	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
		super("Speakers");
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
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
		Speakers other = (Speakers) obj;
		return Objects.equals(cordLength, other.cordLength) && Objects.equals(frequencyRange, other.frequencyRange)
				&& Objects.equals(numberOfSpeakers, other.numberOfSpeakers)
				&& Objects.equals(powerConsumption, other.powerConsumption);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [powerConsumption=" + powerConsumption + ", numberOfSpeakers="
				+ numberOfSpeakers + ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
}
