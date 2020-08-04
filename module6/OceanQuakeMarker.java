package module6;


import de.fhpotsdam.unfolding.data.PointFeature;
//import de.fhpotsdam.unfolding.events.ZoomMapEvent;
import processing.core.PGraphics;
//import de.fhpotsdam.unfolding.UnfoldingMap;


/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		//IMPLEMENT: drawing centered square for Ocean earthquakes
		// DO NOT set the fill color.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered square.
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		if (this.isSelected()) {
			if (this.getMagnitude() > 6) {
				pg.fill(255, 0, 0, 50);
				pg.strokeWeight(2);
				pg.ellipse(x, y, (float) this.threatCircle()/25, (float) this.threatCircle()/25);
			}
			else if (this.getMagnitude() < 4) {
				pg.fill(0, 255, 0, 50);
				pg.strokeWeight(2);
				pg.ellipse(x, y, (float) this.threatCircle()/25, (float) this.threatCircle()/25);
			}
			else {
				pg.fill(255, 255, 0, 50);
				pg.strokeWeight(2);
				pg.ellipse(x, y, (float) this.threatCircle()/25, (float) this.threatCircle()/25);
			}
		}
	}
}
