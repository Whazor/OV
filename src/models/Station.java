package models;

public class Station {
	//station of train changes
	private int trainChanges;
	// station short name
	private String shortName;
	// time specified in minutes usually necessary to change trains at this station
	private int transitionTime;
	// this column is obsolete. Default value is 0
	//private int maxTransitionTime;
	private Country country;
	
	//time-zone number
	private int timeZone;
	
	private int coordinateX;
	private int coordinateY;
	
	private String name;

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName.trim();
	}

	/**
	 * @return the transitionTime
	 */
	public int getTransitionTime() {
		return transitionTime;
	}

	/**
	 * @param transitionTime the transitionTime to set
	 */
	public void setTransitionTime(int transitionTime) {
		this.transitionTime = transitionTime;
	}

	/**
	 * @return the timeZone
	 */
	public int getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the coordinateX
	 */
	public int getCoordinateX() {
		return coordinateX;
	}

	/**
	 * @param coordinateX the coordinateX to set
	 */
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	/**
	 * @return the coordinateY
	 */
	public int getCoordinateY() {
		return coordinateY;
	}

	/**
	 * @param coordinateY the coordinateY to set
	 */
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name.trim();
	}

	/**
	 * @return the trainChanges
	 */
	public int getTrainChanges() {
		return trainChanges;
	}

	/**
	 * @param trainChanges the trainChanges to set
	 */
	public void setTrainChanges(int trainChanges) {
		this.trainChanges = trainChanges;
	}
}
