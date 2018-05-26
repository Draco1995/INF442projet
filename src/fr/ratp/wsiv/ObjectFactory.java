
package fr.ratp.wsiv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import fr.ratp.wsiv.xsd.Direction;
import fr.ratp.wsiv.xsd.GeoPoint;
import fr.ratp.wsiv.xsd.Line;
import fr.ratp.wsiv.xsd.Mission;
import fr.ratp.wsiv.xsd.Perturbation;
import fr.ratp.wsiv.xsd.Station;
import fr.ratp.wsiv.xsd.WrDirections;
import fr.ratp.wsiv.xsd.WrMission;
import fr.ratp.wsiv.xsd.WrMissions;
import fr.ratp.wsiv.xsd.WrPerturbations;
import fr.ratp.wsiv.xsd.WrStations;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.ratp.wsiv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDirectionsLine_QNAME = new QName("http://wsiv.ratp.fr", "line");
    private final static QName _GetMissionsFirstLastResponseReturn_QNAME = new QName("http://wsiv.ratp.fr", "return");
    private final static QName _GetMissionsNextDateStart_QNAME = new QName("http://wsiv.ratp.fr", "dateStart");
    private final static QName _GetMissionsNextStation_QNAME = new QName("http://wsiv.ratp.fr", "station");
    private final static QName _GetMissionsNextDirection_QNAME = new QName("http://wsiv.ratp.fr", "direction");
    private final static QName _GetMissionsFirstLastDate_QNAME = new QName("http://wsiv.ratp.fr", "date");
    private final static QName _GetMissionMission_QNAME = new QName("http://wsiv.ratp.fr", "mission");
    private final static QName _GetStationsGp_QNAME = new QName("http://wsiv.ratp.fr", "gp");
    private final static QName _GetPerturbationsPerturbation_QNAME = new QName("http://wsiv.ratp.fr", "perturbation");
    private final static QName _GetMissionsFrequencyStationEndLine_QNAME = new QName("http://wsiv.ratp.fr", "stationEndLine");
    private final static QName _GetMissionsFrequencyStationEnd_QNAME = new QName("http://wsiv.ratp.fr", "stationEnd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.ratp.wsiv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerturbations }
     * 
     */
    public GetPerturbations createGetPerturbations() {
        return new GetPerturbations();
    }

    /**
     * Create an instance of {@link GetPerturbationsResponse }
     * 
     */
    public GetPerturbationsResponse createGetPerturbationsResponse() {
        return new GetPerturbationsResponse();
    }

    /**
     * Create an instance of {@link GetDirectionsResponse }
     * 
     */
    public GetDirectionsResponse createGetDirectionsResponse() {
        return new GetDirectionsResponse();
    }

    /**
     * Create an instance of {@link GetMissionsFrequencyResponse }
     * 
     */
    public GetMissionsFrequencyResponse createGetMissionsFrequencyResponse() {
        return new GetMissionsFrequencyResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link GetMissionsFirstLastResponse }
     * 
     */
    public GetMissionsFirstLastResponse createGetMissionsFirstLastResponse() {
        return new GetMissionsFirstLastResponse();
    }

    /**
     * Create an instance of {@link GetLinesResponse }
     * 
     */
    public GetLinesResponse createGetLinesResponse() {
        return new GetLinesResponse();
    }

    /**
     * Create an instance of {@link GetMissionsFirstLast }
     * 
     */
    public GetMissionsFirstLast createGetMissionsFirstLast() {
        return new GetMissionsFirstLast();
    }

    /**
     * Create an instance of {@link GetMissionsFrequency }
     * 
     */
    public GetMissionsFrequency createGetMissionsFrequency() {
        return new GetMissionsFrequency();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link GetMissionsNext }
     * 
     */
    public GetMissionsNext createGetMissionsNext() {
        return new GetMissionsNext();
    }

    /**
     * Create an instance of {@link GetMission }
     * 
     */
    public GetMission createGetMission() {
        return new GetMission();
    }

    /**
     * Create an instance of {@link GetGeoPoints }
     * 
     */
    public GetGeoPoints createGetGeoPoints() {
        return new GetGeoPoints();
    }

    /**
     * Create an instance of {@link GetMissionsNextResponse }
     * 
     */
    public GetMissionsNextResponse createGetMissionsNextResponse() {
        return new GetMissionsNextResponse();
    }

    /**
     * Create an instance of {@link GetLines }
     * 
     */
    public GetLines createGetLines() {
        return new GetLines();
    }

    /**
     * Create an instance of {@link GetDirections }
     * 
     */
    public GetDirections createGetDirections() {
        return new GetDirections();
    }

    /**
     * Create an instance of {@link GetGeoPointsResponse }
     * 
     */
    public GetGeoPointsResponse createGetGeoPointsResponse() {
        return new GetGeoPointsResponse();
    }

    /**
     * Create an instance of {@link GetMissionResponse }
     * 
     */
    public GetMissionResponse createGetMissionResponse() {
        return new GetMissionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "line", scope = GetDirections.class)
    public JAXBElement<Line> createGetDirectionsLine(Line value) {
        return new JAXBElement<Line>(_GetDirectionsLine_QNAME, Line.class, GetDirections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrMissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetMissionsFirstLastResponse.class)
    public JAXBElement<WrMissions> createGetMissionsFirstLastResponseReturn(WrMissions value) {
        return new JAXBElement<WrMissions>(_GetMissionsFirstLastResponseReturn_QNAME, WrMissions.class, GetMissionsFirstLastResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrStations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetStationsResponse.class)
    public JAXBElement<WrStations> createGetStationsResponseReturn(WrStations value) {
        return new JAXBElement<WrStations>(_GetMissionsFirstLastResponseReturn_QNAME, WrStations.class, GetStationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetVersionResponse.class)
    public JAXBElement<String> createGetVersionResponseReturn(String value) {
        return new JAXBElement<String>(_GetMissionsFirstLastResponseReturn_QNAME, String.class, GetVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrDirections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetDirectionsResponse.class)
    public JAXBElement<WrDirections> createGetDirectionsResponseReturn(WrDirections value) {
        return new JAXBElement<WrDirections>(_GetMissionsFirstLastResponseReturn_QNAME, WrDirections.class, GetDirectionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "dateStart", scope = GetMissionsNext.class)
    public JAXBElement<String> createGetMissionsNextDateStart(String value) {
        return new JAXBElement<String>(_GetMissionsNextDateStart_QNAME, String.class, GetMissionsNext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "station", scope = GetMissionsNext.class)
    public JAXBElement<Station> createGetMissionsNextStation(Station value) {
        return new JAXBElement<Station>(_GetMissionsNextStation_QNAME, Station.class, GetMissionsNext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "direction", scope = GetMissionsNext.class)
    public JAXBElement<Direction> createGetMissionsNextDirection(Direction value) {
        return new JAXBElement<Direction>(_GetMissionsNextDirection_QNAME, Direction.class, GetMissionsNext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "date", scope = GetMissionsFirstLast.class)
    public JAXBElement<String> createGetMissionsFirstLastDate(String value) {
        return new JAXBElement<String>(_GetMissionsFirstLastDate_QNAME, String.class, GetMissionsFirstLast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "station", scope = GetMissionsFirstLast.class)
    public JAXBElement<Station> createGetMissionsFirstLastStation(Station value) {
        return new JAXBElement<Station>(_GetMissionsNextStation_QNAME, Station.class, GetMissionsFirstLast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "direction", scope = GetMissionsFirstLast.class)
    public JAXBElement<Direction> createGetMissionsFirstLastDirection(Direction value) {
        return new JAXBElement<Direction>(_GetMissionsNextDirection_QNAME, Direction.class, GetMissionsFirstLast.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrMission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetMissionResponse.class)
    public JAXBElement<WrMission> createGetMissionResponseReturn(WrMission value) {
        return new JAXBElement<WrMission>(_GetMissionsFirstLastResponseReturn_QNAME, WrMission.class, GetMissionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrPerturbations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetPerturbationsResponse.class)
    public JAXBElement<WrPerturbations> createGetPerturbationsResponseReturn(WrPerturbations value) {
        return new JAXBElement<WrPerturbations>(_GetMissionsFirstLastResponseReturn_QNAME, WrPerturbations.class, GetPerturbationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "date", scope = GetMission.class)
    public JAXBElement<String> createGetMissionDate(String value) {
        return new JAXBElement<String>(_GetMissionsFirstLastDate_QNAME, String.class, GetMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "mission", scope = GetMission.class)
    public JAXBElement<Mission> createGetMissionMission(Mission value) {
        return new JAXBElement<Mission>(_GetMissionMission_QNAME, Mission.class, GetMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrMissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetMissionsFrequencyResponse.class)
    public JAXBElement<WrMissions> createGetMissionsFrequencyResponseReturn(WrMissions value) {
        return new JAXBElement<WrMissions>(_GetMissionsFirstLastResponseReturn_QNAME, WrMissions.class, GetMissionsFrequencyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrMissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "return", scope = GetMissionsNextResponse.class)
    public JAXBElement<WrMissions> createGetMissionsNextResponseReturn(WrMissions value) {
        return new JAXBElement<WrMissions>(_GetMissionsFirstLastResponseReturn_QNAME, WrMissions.class, GetMissionsNextResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "gp", scope = GetStations.class)
    public JAXBElement<GeoPoint> createGetStationsGp(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_GetStationsGp_QNAME, GeoPoint.class, GetStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "station", scope = GetStations.class)
    public JAXBElement<Station> createGetStationsStation(Station value) {
        return new JAXBElement<Station>(_GetMissionsNextStation_QNAME, Station.class, GetStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "gp", scope = GetGeoPoints.class)
    public JAXBElement<GeoPoint> createGetGeoPointsGp(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_GetStationsGp_QNAME, GeoPoint.class, GetGeoPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Perturbation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "perturbation", scope = GetPerturbations.class)
    public JAXBElement<Perturbation> createGetPerturbationsPerturbation(Perturbation value) {
        return new JAXBElement<Perturbation>(_GetPerturbationsPerturbation_QNAME, Perturbation.class, GetPerturbations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "stationEndLine", scope = GetMissionsFrequency.class)
    public JAXBElement<Station> createGetMissionsFrequencyStationEndLine(Station value) {
        return new JAXBElement<Station>(_GetMissionsFrequencyStationEndLine_QNAME, Station.class, GetMissionsFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "station", scope = GetMissionsFrequency.class)
    public JAXBElement<Station> createGetMissionsFrequencyStation(Station value) {
        return new JAXBElement<Station>(_GetMissionsNextStation_QNAME, Station.class, GetMissionsFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "direction", scope = GetMissionsFrequency.class)
    public JAXBElement<Direction> createGetMissionsFrequencyDirection(Direction value) {
        return new JAXBElement<Direction>(_GetMissionsNextDirection_QNAME, Direction.class, GetMissionsFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "stationEnd", scope = GetMissionsFrequency.class)
    public JAXBElement<Station> createGetMissionsFrequencyStationEnd(Station value) {
        return new JAXBElement<Station>(_GetMissionsFrequencyStationEnd_QNAME, Station.class, GetMissionsFrequency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr", name = "line", scope = GetLines.class)
    public JAXBElement<Line> createGetLinesLine(Line value) {
        return new JAXBElement<Line>(_GetDirectionsLine_QNAME, Line.class, GetLines.class, value);
    }

}
