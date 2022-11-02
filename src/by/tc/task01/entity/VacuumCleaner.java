package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;

	public VacuumCleaner() {
		super("VacuumCleaner");
	}

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		super("VacuumCleaner");
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(bagType, cleaningWidth, filterType, motorSpeedRegulation, powerConsumption, wandType);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType) && Objects.equals(cleaningWidth, other.cleaningWidth)
				&& Objects.equals(filterType, other.filterType)
				&& Objects.equals(motorSpeedRegulation, other.motorSpeedRegulation)
				&& Objects.equals(powerConsumption, other.powerConsumption) && Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [powerConsumption=" + powerConsumption + ", filterType=" + filterType
				+ ", bagType=" + bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
}
