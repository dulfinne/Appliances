package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {

	private static final long serialVersionUID = 1L;

	private String group;

	public Appliance() {
	}

	public Appliance(String groupName) {
		this.group = groupName;
	}

	public String getGroupName() {
		return group;
	}

	public void setGroupName(String groupName) {
		this.group = groupName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(group);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(group, other.group);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [groupName=" + group + "]";
	}

}
