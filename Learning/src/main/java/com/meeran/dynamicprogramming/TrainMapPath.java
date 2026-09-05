package com.meeran.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TrainMapPath {

	/**
	 * class Station
	 * <p>
	 * Respresents Station in the rail network. Each station is identified by unique
	 * name. Station is connected with other stations - this information is stored
	 * in the 'neighbours' field. Two station objects with the same name are equal
	 * therefore they are considered to be same station.
	 */
	public static class Station {
		private String name;
		private List<Station> neighbours;

		public Station(String name) {
			this.name = name;
			this.neighbours = new ArrayList<>(3);
		}

		public String getName() {
			return name;
		}

		public void addNeighbour(Station v) {
			this.neighbours.add(v);
		}

		public List<Station> getNeighbours() {
			return this.neighbours;
		}

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Station && this.name.equals(((Station) obj).getName());
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.name);
		}
	}

	/**
	 * class TrainMap
	 * <p>
	 * Respresents whole rail network - consists of number of the Station objects.
	 * Stations in the map are bi-directionally connected. Distance between any 2
	 * stations is of same constant distance unit. This implies that shortest
	 * distance between any 2 stations depends only on number of stations in between
	 */
	public static class TrainMap {

		private HashMap<String, Station> stations;

		public TrainMap() {
			this.stations = new HashMap<>();
		}

		public TrainMap addStation(String name) {
			Station s = new Station(name);
			this.stations.putIfAbsent(name, s);
			return this;
		}

		public Station getStation(String name) {
			return this.stations.get(name);
		}

		public TrainMap connectStations(Station fromStation, Station toStation) {
			if (fromStation == null) {
				throw new IllegalArgumentException("From station is null");
			}
			if (toStation == null) {
				throw new IllegalArgumentException("To station is null");
			}
			fromStation.addNeighbour(toStation);
			toStation.addNeighbour(fromStation);
			return this;
		}

		public List<Station> shortestPath(String from, String to) {
			Deque<Station> deque = new LinkedList<Station>();
			Map<Station, Station> map = new HashMap<Station, Station>();
			Station fromStation = stations.get(from);
			deque.add(fromStation);
			map.put(fromStation, null);

			while (!deque.isEmpty()) {
				Station current = deque.remove();

				if (current.getName().equals(to))
					break;

				for (Station neighbour : current.getNeighbours()) {
					if (!map.containsKey(neighbour)) {
						map.put(neighbour, current);
						deque.offer(neighbour);
					}
				}
			}

			Station destination = stations.get(to);
			List<Station> path = new ArrayList<Station>();
			// D->C->B->A
			while (destination != null) {
				path.add(destination);
				destination = map.get(destination);
			}
			Collections.reverse(path);
			return path;
		}

		public static String convertPathToStringRepresentation(List<Station> path) {
			if (path.isEmpty()) {
				return "";
			}
			return path.stream().map(Station::getName).reduce((s1, s2) -> s1 + "->" + s2).get();
		}
	}
}
