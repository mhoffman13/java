package main.java.card.entity;

import java.util.Date;

import main.java.enumeration.TapType;
import main.java.station.entity.Station;

/**
 * @author meredith hoffman
 *
 */
public class CardTap {
	/*
	 * breeze_card char(14),
	tap_time time,
	tap_type char(1),
	station int(6), #FK
    PRIMARY KEY (breeze_card, tap_time)
	 */
	
	private Card card;
	private Station station;
	private Date tapTime;
	private TapType type;
	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}
	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}
	/**
	 * @return the station
	 */
	public Station getStation() {
		return station;
	}
	/**
	 * @param station the station to set
	 */
	public void setStation(Station station) {
		this.station = station;
	}
	/**
	 * @return the tapTime
	 */
	public Date getTapTime() {
		return tapTime;
	}
	/**
	 * @param tapTime the tapTime to set
	 */
	public void setTapTime(Date tapTime) {
		this.tapTime = tapTime;
	}
	/**
	 * @return the type
	 */
	public TapType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(TapType type) {
		this.type = type;
	}
	
}
