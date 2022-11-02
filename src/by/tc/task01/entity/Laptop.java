package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private double batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private int displayInchs;

	public Laptop() {
		super("Laptop");
	}

	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
		super("Laptop");
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, cpu, displayInchs, memoryRom, os, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Objects.equals(batteryCapacity, other.batteryCapacity) && Objects.equals(cpu, other.cpu)
				&& Objects.equals(displayInchs, other.displayInchs) && Objects.equals(memoryRom, other.memoryRom)
				&& Objects.equals(os, other.os) && Objects.equals(systemMemory, other.systemMemory);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}

}