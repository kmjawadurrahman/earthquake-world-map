# Earthquake World Map

This project is part of an online course offered through Coursera [[1]](#references). All parsing codes had been provided by the instructors. XML data of earthquake feed are first parsed. The data is then used to create two types of graphical markers on the map. The type of the marker depends on whether the earthquake occurred on land (circle) or in the ocean (square). The size of the markers depends on the magnitudes of the earthquakes. Different colors are used for different ranges of earthquake depth. Additionally, a set of markers are also used to denote the major cities of the world. The city data was parsed from a JSON data source.

The map is interactive. Placing the mouse cursor over the city or earthquake markers show details like city name, earthquake title, magnitude, etc. Moreover, if you click on a particular earthquake marker, then only the city markers within the threat radius of this earthquake will be shown on the map (all other markers will be hidden). Similarly, clicking on a city marker shows only those earthquakes that pose a threat to the particular city. A rough calculation of the threat radius uses the magnitude of the earthquake. Finally, hovering mouse over an earthquake will show its threat radius.

Object-oriented design and class hierarchies had been used to code up the solution. Skeleton codes had been provided by the course instructors. In this project, I worked with a map library (Unfolding Maps), a graphics library (Processing) and wrote the programs using Java.

---

![Image 1](/images/img1.png)

The end product. The key is given at the top-left corner of the java applet. Real-time data feed is parsed and the information about the earthquakes are represented graphically on the map.

---

![Image 2](/images/img2.png)

Interactive features of the map are shown here. Hovering the mouse over a particular earthquake gives the user information about the earthquake. A visual threat radius of the earthquake also appears on the map.

---

![Image 3](/images/img3.png)

When a mouse-click event occurs, only the city markers within the calculated threat radius of the earthquake remain on the map.

---

## References
[1] Object Oriented Programming in Java by University of California, San Diego on Coursera.
