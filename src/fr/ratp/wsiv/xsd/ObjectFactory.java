
package fr.ratp.wsiv.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.ratp.wsiv.xsd package. 
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

    private final static QName _GeoPointId_QNAME = new QName("http://wsiv.ratp.fr/xsd", "id");
    private final static QName _GeoPointNameSuffix_QNAME = new QName("http://wsiv.ratp.fr/xsd", "nameSuffix");
    private final static QName _GeoPointName_QNAME = new QName("http://wsiv.ratp.fr/xsd", "name");
    private final static QName _GeoPointType_QNAME = new QName("http://wsiv.ratp.fr/xsd", "type");
    private final static QName _WrMissionsArgumentStation_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentStation");
    private final static QName _WrMissionsArgumentDirection_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentDirection");
    private final static QName _WrMissionsAmbiguityMessage_QNAME = new QName("http://wsiv.ratp.fr/xsd", "ambiguityMessage");
    private final static QName _WrMissionsArgumentLine_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentLine");
    private final static QName _WrMissionsArgumentDate_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentDate");
    private final static QName _StationDirection_QNAME = new QName("http://wsiv.ratp.fr/xsd", "direction");
    private final static QName _StationLine_QNAME = new QName("http://wsiv.ratp.fr/xsd", "line");
    private final static QName _StationStationArea_QNAME = new QName("http://wsiv.ratp.fr/xsd", "stationArea");
    private final static QName _StationGeoPointR_QNAME = new QName("http://wsiv.ratp.fr/xsd", "geoPointR");
    private final static QName _StationGeoPointA_QNAME = new QName("http://wsiv.ratp.fr/xsd", "geoPointA");
    private final static QName _PerturbationCause_QNAME = new QName("http://wsiv.ratp.fr/xsd", "cause");
    private final static QName _PerturbationStation_QNAME = new QName("http://wsiv.ratp.fr/xsd", "station");
    private final static QName _PerturbationStatus_QNAME = new QName("http://wsiv.ratp.fr/xsd", "status");
    private final static QName _PerturbationDateEnd_QNAME = new QName("http://wsiv.ratp.fr/xsd", "dateEnd");
    private final static QName _PerturbationDateStart_QNAME = new QName("http://wsiv.ratp.fr/xsd", "dateStart");
    private final static QName _PerturbationTitle_QNAME = new QName("http://wsiv.ratp.fr/xsd", "title");
    private final static QName _PerturbationTimeStart_QNAME = new QName("http://wsiv.ratp.fr/xsd", "timeStart");
    private final static QName _PerturbationTimeEnd_QNAME = new QName("http://wsiv.ratp.fr/xsd", "timeEnd");
    private final static QName _PerturbationLevel_QNAME = new QName("http://wsiv.ratp.fr/xsd", "level");
    private final static QName _PerturbationMessage_QNAME = new QName("http://wsiv.ratp.fr/xsd", "message");
    private final static QName _PerturbationSource_QNAME = new QName("http://wsiv.ratp.fr/xsd", "source");
    private final static QName _PerturbationConsequence_QNAME = new QName("http://wsiv.ratp.fr/xsd", "consequence");
    private final static QName _PerturbationMedia_QNAME = new QName("http://wsiv.ratp.fr/xsd", "media");
    private final static QName _StationAccesIndex_QNAME = new QName("http://wsiv.ratp.fr/xsd", "index");
    private final static QName _StationAccesTimeDaysLabel_QNAME = new QName("http://wsiv.ratp.fr/xsd", "timeDaysLabel");
    private final static QName _StationAccesTimeDaysStatus_QNAME = new QName("http://wsiv.ratp.fr/xsd", "timeDaysStatus");
    private final static QName _StationAccesAddress_QNAME = new QName("http://wsiv.ratp.fr/xsd", "address");
    private final static QName _MissionCode_QNAME = new QName("http://wsiv.ratp.fr/xsd", "code");
    private final static QName _MissionStationEndLine_QNAME = new QName("http://wsiv.ratp.fr/xsd", "stationEndLine");
    private final static QName _ItineraryGeoPointEnd_QNAME = new QName("http://wsiv.ratp.fr/xsd", "geoPointEnd");
    private final static QName _ItineraryGeoPointStart_QNAME = new QName("http://wsiv.ratp.fr/xsd", "geoPointStart");
    private final static QName _ItineraryTarif_QNAME = new QName("http://wsiv.ratp.fr/xsd", "tarif");
    private final static QName _WrStationsArgumentGeoPoint_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentGeoPoint");
    private final static QName _PerturbationIncidentLineMessageShort_QNAME = new QName("http://wsiv.ratp.fr/xsd", "messageShort");
    private final static QName _PerturbationIncidentLineMessageMedium_QNAME = new QName("http://wsiv.ratp.fr/xsd", "messageMedium");
    private final static QName _PerturbationIncidentLineMessageLarge_QNAME = new QName("http://wsiv.ratp.fr/xsd", "messageLarge");
    private final static QName _PerturbationIncidentMessageGlobal_QNAME = new QName("http://wsiv.ratp.fr/xsd", "messageGlobal");
    private final static QName _PerturbationIncidentDate_QNAME = new QName("http://wsiv.ratp.fr/xsd", "date");
    private final static QName _StationAreaZoneCarteOrange_QNAME = new QName("http://wsiv.ratp.fr/xsd", "zoneCarteOrange");
    private final static QName _LineRealm_QNAME = new QName("http://wsiv.ratp.fr/xsd", "realm");
    private final static QName _LineImage_QNAME = new QName("http://wsiv.ratp.fr/xsd", "image");
    private final static QName _LineReseau_QNAME = new QName("http://wsiv.ratp.fr/xsd", "reseau");
    private final static QName _LineCodeStif_QNAME = new QName("http://wsiv.ratp.fr/xsd", "codeStif");
    private final static QName _TarifViaReseau_QNAME = new QName("http://wsiv.ratp.fr/xsd", "viaReseau");
    private final static QName _TarifViaLine_QNAME = new QName("http://wsiv.ratp.fr/xsd", "viaLine");
    private final static QName _PerturbationCauseParentId_QNAME = new QName("http://wsiv.ratp.fr/xsd", "parentId");
    private final static QName _PerturbationCauseParentName_QNAME = new QName("http://wsiv.ratp.fr/xsd", "parentName");
    private final static QName _DirectionSens_QNAME = new QName("http://wsiv.ratp.fr/xsd", "sens");
    private final static QName _WrPerturbationsArgumentSource_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentSource");
    private final static QName _WrPerturbationsArgumentMedia_QNAME = new QName("http://wsiv.ratp.fr/xsd", "argumentMedia");
    private final static QName _WrMissionMission_QNAME = new QName("http://wsiv.ratp.fr/xsd", "mission");
    private final static QName _PerturbationMessageText_QNAME = new QName("http://wsiv.ratp.fr/xsd", "text");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.ratp.wsiv.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerturbationConsequence }
     * 
     */
    public PerturbationConsequence createPerturbationConsequence() {
        return new PerturbationConsequence();
    }

    /**
     * Create an instance of {@link WrDirections }
     * 
     */
    public WrDirections createWrDirections() {
        return new WrDirections();
    }

    /**
     * Create an instance of {@link PerturbationIncidentLine }
     * 
     */
    public PerturbationIncidentLine createPerturbationIncidentLine() {
        return new PerturbationIncidentLine();
    }

    /**
     * Create an instance of {@link Reseau }
     * 
     */
    public Reseau createReseau() {
        return new Reseau();
    }

    /**
     * Create an instance of {@link StationArea }
     * 
     */
    public StationArea createStationArea() {
        return new StationArea();
    }

    /**
     * Create an instance of {@link GeoPoint }
     * 
     */
    public GeoPoint createGeoPoint() {
        return new GeoPoint();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link Perturbation }
     * 
     */
    public Perturbation createPerturbation() {
        return new Perturbation();
    }

    /**
     * Create an instance of {@link Mission }
     * 
     */
    public Mission createMission() {
        return new Mission();
    }

    /**
     * Create an instance of {@link WrItineraries }
     * 
     */
    public WrItineraries createWrItineraries() {
        return new WrItineraries();
    }

    /**
     * Create an instance of {@link Direction }
     * 
     */
    public Direction createDirection() {
        return new Direction();
    }

    /**
     * Create an instance of {@link WrStations }
     * 
     */
    public WrStations createWrStations() {
        return new WrStations();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link WrPerturbations }
     * 
     */
    public WrPerturbations createWrPerturbations() {
        return new WrPerturbations();
    }

    /**
     * Create an instance of {@link PerturbationIncident }
     * 
     */
    public PerturbationIncident createPerturbationIncident() {
        return new PerturbationIncident();
    }

    /**
     * Create an instance of {@link WrMissions }
     * 
     */
    public WrMissions createWrMissions() {
        return new WrMissions();
    }

    /**
     * Create an instance of {@link WrMission }
     * 
     */
    public WrMission createWrMission() {
        return new WrMission();
    }

    /**
     * Create an instance of {@link PerturbationMessage }
     * 
     */
    public PerturbationMessage createPerturbationMessage() {
        return new PerturbationMessage();
    }

    /**
     * Create an instance of {@link PerturbationCause }
     * 
     */
    public PerturbationCause createPerturbationCause() {
        return new PerturbationCause();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link StationAcces }
     * 
     */
    public StationAcces createStationAcces() {
        return new StationAcces();
    }

    /**
     * Create an instance of {@link Tarif }
     * 
     */
    public Tarif createTarif() {
        return new Tarif();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = GeoPoint.class)
    public JAXBElement<String> createGeoPointId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, GeoPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "nameSuffix", scope = GeoPoint.class)
    public JAXBElement<String> createGeoPointNameSuffix(String value) {
        return new JAXBElement<String>(_GeoPointNameSuffix_QNAME, String.class, GeoPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = GeoPoint.class)
    public JAXBElement<String> createGeoPointName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, GeoPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "type", scope = GeoPoint.class)
    public JAXBElement<String> createGeoPointType(String value) {
        return new JAXBElement<String>(_GeoPointType_QNAME, String.class, GeoPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentStation", scope = WrMissions.class)
    public JAXBElement<Station> createWrMissionsArgumentStation(Station value) {
        return new JAXBElement<Station>(_WrMissionsArgumentStation_QNAME, Station.class, WrMissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentDirection", scope = WrMissions.class)
    public JAXBElement<Direction> createWrMissionsArgumentDirection(Direction value) {
        return new JAXBElement<Direction>(_WrMissionsArgumentDirection_QNAME, Direction.class, WrMissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "ambiguityMessage", scope = WrMissions.class)
    public JAXBElement<String> createWrMissionsAmbiguityMessage(String value) {
        return new JAXBElement<String>(_WrMissionsAmbiguityMessage_QNAME, String.class, WrMissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentLine", scope = WrMissions.class)
    public JAXBElement<Line> createWrMissionsArgumentLine(Line value) {
        return new JAXBElement<Line>(_WrMissionsArgumentLine_QNAME, Line.class, WrMissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentDate", scope = WrMissions.class)
    public JAXBElement<String> createWrMissionsArgumentDate(String value) {
        return new JAXBElement<String>(_WrMissionsArgumentDate_QNAME, String.class, WrMissions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = Station.class)
    public JAXBElement<String> createStationId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "direction", scope = Station.class)
    public JAXBElement<Direction> createStationDirection(Direction value) {
        return new JAXBElement<Direction>(_StationDirection_QNAME, Direction.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = Station.class)
    public JAXBElement<String> createStationName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "line", scope = Station.class)
    public JAXBElement<Line> createStationLine(Line value) {
        return new JAXBElement<Line>(_StationLine_QNAME, Line.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "stationArea", scope = Station.class)
    public JAXBElement<StationArea> createStationStationArea(StationArea value) {
        return new JAXBElement<StationArea>(_StationStationArea_QNAME, StationArea.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "geoPointR", scope = Station.class)
    public JAXBElement<GeoPoint> createStationGeoPointR(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_StationGeoPointR_QNAME, GeoPoint.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "geoPointA", scope = Station.class)
    public JAXBElement<GeoPoint> createStationGeoPointA(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_StationGeoPointA_QNAME, GeoPoint.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationCause }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "cause", scope = Perturbation.class)
    public JAXBElement<PerturbationCause> createPerturbationCause(PerturbationCause value) {
        return new JAXBElement<PerturbationCause>(_PerturbationCause_QNAME, PerturbationCause.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "station", scope = Perturbation.class)
    public JAXBElement<Station> createPerturbationStation(Station value) {
        return new JAXBElement<Station>(_PerturbationStation_QNAME, Station.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "status", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationStatus(String value) {
        return new JAXBElement<String>(_PerturbationStatus_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "dateEnd", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationDateEnd(String value) {
        return new JAXBElement<String>(_PerturbationDateEnd_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "line", scope = Perturbation.class)
    public JAXBElement<Line> createPerturbationLine(Line value) {
        return new JAXBElement<Line>(_StationLine_QNAME, Line.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "dateStart", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationDateStart(String value) {
        return new JAXBElement<String>(_PerturbationDateStart_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "title", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationTitle(String value) {
        return new JAXBElement<String>(_PerturbationTitle_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeStart", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationTimeStart(String value) {
        return new JAXBElement<String>(_PerturbationTimeStart_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeEnd", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationTimeEnd(String value) {
        return new JAXBElement<String>(_PerturbationTimeEnd_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "level", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationLevel(String value) {
        return new JAXBElement<String>(_PerturbationLevel_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "message", scope = Perturbation.class)
    public JAXBElement<PerturbationMessage> createPerturbationMessage(PerturbationMessage value) {
        return new JAXBElement<PerturbationMessage>(_PerturbationMessage_QNAME, PerturbationMessage.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "source", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationSource(String value) {
        return new JAXBElement<String>(_PerturbationSource_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationConsequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "consequence", scope = Perturbation.class)
    public JAXBElement<PerturbationConsequence> createPerturbationConsequence(PerturbationConsequence value) {
        return new JAXBElement<PerturbationConsequence>(_PerturbationConsequence_QNAME, PerturbationConsequence.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "media", scope = Perturbation.class)
    public JAXBElement<String> createPerturbationMedia(String value) {
        return new JAXBElement<String>(_PerturbationMedia_QNAME, String.class, Perturbation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "index", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesIndex(String value) {
        return new JAXBElement<String>(_StationAccesIndex_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeStart", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesTimeStart(String value) {
        return new JAXBElement<String>(_PerturbationTimeStart_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeEnd", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesTimeEnd(String value) {
        return new JAXBElement<String>(_PerturbationTimeEnd_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeDaysLabel", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesTimeDaysLabel(String value) {
        return new JAXBElement<String>(_StationAccesTimeDaysLabel_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "timeDaysStatus", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesTimeDaysStatus(String value) {
        return new JAXBElement<String>(_StationAccesTimeDaysStatus_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "address", scope = StationAcces.class)
    public JAXBElement<String> createStationAccesAddress(String value) {
        return new JAXBElement<String>(_StationAccesAddress_QNAME, String.class, StationAcces.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = Mission.class)
    public JAXBElement<String> createMissionId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, Mission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "direction", scope = Mission.class)
    public JAXBElement<Direction> createMissionDirection(Direction value) {
        return new JAXBElement<Direction>(_StationDirection_QNAME, Direction.class, Mission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "code", scope = Mission.class)
    public JAXBElement<String> createMissionCode(String value) {
        return new JAXBElement<String>(_MissionCode_QNAME, String.class, Mission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "stationEndLine", scope = Mission.class)
    public JAXBElement<Station> createMissionStationEndLine(Station value) {
        return new JAXBElement<Station>(_MissionStationEndLine_QNAME, Station.class, Mission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "line", scope = Mission.class)
    public JAXBElement<Line> createMissionLine(Line value) {
        return new JAXBElement<Line>(_StationLine_QNAME, Line.class, Mission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "geoPointEnd", scope = Itinerary.class)
    public JAXBElement<GeoPoint> createItineraryGeoPointEnd(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_ItineraryGeoPointEnd_QNAME, GeoPoint.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "geoPointStart", scope = Itinerary.class)
    public JAXBElement<GeoPoint> createItineraryGeoPointStart(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_ItineraryGeoPointStart_QNAME, GeoPoint.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "dateEnd", scope = Itinerary.class)
    public JAXBElement<String> createItineraryDateEnd(String value) {
        return new JAXBElement<String>(_PerturbationDateEnd_QNAME, String.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tarif }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "tarif", scope = Itinerary.class)
    public JAXBElement<Tarif> createItineraryTarif(Tarif value) {
        return new JAXBElement<Tarif>(_ItineraryTarif_QNAME, Tarif.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "dateStart", scope = Itinerary.class)
    public JAXBElement<String> createItineraryDateStart(String value) {
        return new JAXBElement<String>(_PerturbationDateStart_QNAME, String.class, Itinerary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentGeoPoint", scope = WrStations.class)
    public JAXBElement<GeoPoint> createWrStationsArgumentGeoPoint(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_WrStationsArgumentGeoPoint_QNAME, GeoPoint.class, WrStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentDirection", scope = WrStations.class)
    public JAXBElement<Direction> createWrStationsArgumentDirection(Direction value) {
        return new JAXBElement<Direction>(_WrMissionsArgumentDirection_QNAME, Direction.class, WrStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "ambiguityMessage", scope = WrStations.class)
    public JAXBElement<String> createWrStationsAmbiguityMessage(String value) {
        return new JAXBElement<String>(_WrMissionsAmbiguityMessage_QNAME, String.class, WrStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentLine", scope = WrStations.class)
    public JAXBElement<Line> createWrStationsArgumentLine(Line value) {
        return new JAXBElement<Line>(_WrMissionsArgumentLine_QNAME, Line.class, WrStations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "messageShort", scope = PerturbationIncidentLine.class)
    public JAXBElement<PerturbationMessage> createPerturbationIncidentLineMessageShort(PerturbationMessage value) {
        return new JAXBElement<PerturbationMessage>(_PerturbationIncidentLineMessageShort_QNAME, PerturbationMessage.class, PerturbationIncidentLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "line", scope = PerturbationIncidentLine.class)
    public JAXBElement<Line> createPerturbationIncidentLineLine(Line value) {
        return new JAXBElement<Line>(_StationLine_QNAME, Line.class, PerturbationIncidentLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "messageMedium", scope = PerturbationIncidentLine.class)
    public JAXBElement<PerturbationMessage> createPerturbationIncidentLineMessageMedium(PerturbationMessage value) {
        return new JAXBElement<PerturbationMessage>(_PerturbationIncidentLineMessageMedium_QNAME, PerturbationMessage.class, PerturbationIncidentLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "messageLarge", scope = PerturbationIncidentLine.class)
    public JAXBElement<PerturbationMessage> createPerturbationIncidentLineMessageLarge(PerturbationMessage value) {
        return new JAXBElement<PerturbationMessage>(_PerturbationIncidentLineMessageLarge_QNAME, PerturbationMessage.class, PerturbationIncidentLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationConsequence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "consequence", scope = PerturbationIncidentLine.class)
    public JAXBElement<PerturbationConsequence> createPerturbationIncidentLineConsequence(PerturbationConsequence value) {
        return new JAXBElement<PerturbationConsequence>(_PerturbationConsequence_QNAME, PerturbationConsequence.class, PerturbationIncidentLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "ambiguityMessage", scope = WrItineraries.class)
    public JAXBElement<String> createWrItinerariesAmbiguityMessage(String value) {
        return new JAXBElement<String>(_WrMissionsAmbiguityMessage_QNAME, String.class, WrItineraries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentDate", scope = WrItineraries.class)
    public JAXBElement<String> createWrItinerariesArgumentDate(String value) {
        return new JAXBElement<String>(_WrMissionsArgumentDate_QNAME, String.class, WrItineraries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerturbationMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "messageGlobal", scope = PerturbationIncident.class)
    public JAXBElement<PerturbationMessage> createPerturbationIncidentMessageGlobal(PerturbationMessage value) {
        return new JAXBElement<PerturbationMessage>(_PerturbationIncidentMessageGlobal_QNAME, PerturbationMessage.class, PerturbationIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = PerturbationIncident.class)
    public JAXBElement<String> createPerturbationIncidentId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, PerturbationIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "status", scope = PerturbationIncident.class)
    public JAXBElement<String> createPerturbationIncidentStatus(String value) {
        return new JAXBElement<String>(_PerturbationStatus_QNAME, String.class, PerturbationIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "date", scope = PerturbationIncident.class)
    public JAXBElement<String> createPerturbationIncidentDate(String value) {
        return new JAXBElement<String>(_PerturbationIncidentDate_QNAME, String.class, PerturbationIncident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = StationArea.class)
    public JAXBElement<String> createStationAreaId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, StationArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = StationArea.class)
    public JAXBElement<String> createStationAreaName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, StationArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "zoneCarteOrange", scope = StationArea.class)
    public JAXBElement<String> createStationAreaZoneCarteOrange(String value) {
        return new JAXBElement<String>(_StationAreaZoneCarteOrange_QNAME, String.class, StationArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = Line.class)
    public JAXBElement<String> createLineId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = Line.class)
    public JAXBElement<String> createLineName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "realm", scope = Line.class)
    public JAXBElement<String> createLineRealm(String value) {
        return new JAXBElement<String>(_LineRealm_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "code", scope = Line.class)
    public JAXBElement<String> createLineCode(String value) {
        return new JAXBElement<String>(_MissionCode_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "image", scope = Line.class)
    public JAXBElement<String> createLineImage(String value) {
        return new JAXBElement<String>(_LineImage_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reseau }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "reseau", scope = Line.class)
    public JAXBElement<Reseau> createLineReseau(Reseau value) {
        return new JAXBElement<Reseau>(_LineReseau_QNAME, Reseau.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "codeStif", scope = Line.class)
    public JAXBElement<String> createLineCodeStif(String value) {
        return new JAXBElement<String>(_LineCodeStif_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = Reseau.class)
    public JAXBElement<String> createReseauId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, Reseau.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = Reseau.class)
    public JAXBElement<String> createReseauName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, Reseau.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "code", scope = Reseau.class)
    public JAXBElement<String> createReseauCode(String value) {
        return new JAXBElement<String>(_MissionCode_QNAME, String.class, Reseau.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "image", scope = Reseau.class)
    public JAXBElement<String> createReseauImage(String value) {
        return new JAXBElement<String>(_LineImage_QNAME, String.class, Reseau.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reseau }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "viaReseau", scope = Tarif.class)
    public JAXBElement<Reseau> createTarifViaReseau(Reseau value) {
        return new JAXBElement<Reseau>(_TarifViaReseau_QNAME, Reseau.class, Tarif.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "viaLine", scope = Tarif.class)
    public JAXBElement<Line> createTarifViaLine(Line value) {
        return new JAXBElement<Line>(_TarifViaLine_QNAME, Line.class, Tarif.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = PerturbationCause.class)
    public JAXBElement<String> createPerturbationCauseId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, PerturbationCause.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "parentId", scope = PerturbationCause.class)
    public JAXBElement<String> createPerturbationCauseParentId(String value) {
        return new JAXBElement<String>(_PerturbationCauseParentId_QNAME, String.class, PerturbationCause.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = PerturbationCause.class)
    public JAXBElement<String> createPerturbationCauseName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, PerturbationCause.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "parentName", scope = PerturbationCause.class)
    public JAXBElement<String> createPerturbationCauseParentName(String value) {
        return new JAXBElement<String>(_PerturbationCauseParentName_QNAME, String.class, PerturbationCause.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "level", scope = PerturbationConsequence.class)
    public JAXBElement<String> createPerturbationConsequenceLevel(String value) {
        return new JAXBElement<String>(_PerturbationLevel_QNAME, String.class, PerturbationConsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "id", scope = PerturbationConsequence.class)
    public JAXBElement<String> createPerturbationConsequenceId(String value) {
        return new JAXBElement<String>(_GeoPointId_QNAME, String.class, PerturbationConsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = PerturbationConsequence.class)
    public JAXBElement<String> createPerturbationConsequenceName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, PerturbationConsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "code", scope = PerturbationConsequence.class)
    public JAXBElement<String> createPerturbationConsequenceCode(String value) {
        return new JAXBElement<String>(_MissionCode_QNAME, String.class, PerturbationConsequence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "name", scope = Direction.class)
    public JAXBElement<String> createDirectionName(String value) {
        return new JAXBElement<String>(_GeoPointName_QNAME, String.class, Direction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "line", scope = Direction.class)
    public JAXBElement<Line> createDirectionLine(Line value) {
        return new JAXBElement<Line>(_StationLine_QNAME, Line.class, Direction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "sens", scope = Direction.class)
    public JAXBElement<String> createDirectionSens(String value) {
        return new JAXBElement<String>(_DirectionSens_QNAME, String.class, Direction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentSource", scope = WrPerturbations.class)
    public JAXBElement<String> createWrPerturbationsArgumentSource(String value) {
        return new JAXBElement<String>(_WrPerturbationsArgumentSource_QNAME, String.class, WrPerturbations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentMedia", scope = WrPerturbations.class)
    public JAXBElement<String> createWrPerturbationsArgumentMedia(String value) {
        return new JAXBElement<String>(_WrPerturbationsArgumentMedia_QNAME, String.class, WrPerturbations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "mission", scope = WrMission.class)
    public JAXBElement<Mission> createWrMissionMission(Mission value) {
        return new JAXBElement<Mission>(_WrMissionMission_QNAME, Mission.class, WrMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "ambiguityMessage", scope = WrMission.class)
    public JAXBElement<String> createWrMissionAmbiguityMessage(String value) {
        return new JAXBElement<String>(_WrMissionsAmbiguityMessage_QNAME, String.class, WrMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentLine", scope = WrMission.class)
    public JAXBElement<Line> createWrMissionArgumentLine(Line value) {
        return new JAXBElement<Line>(_WrMissionsArgumentLine_QNAME, Line.class, WrMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentDate", scope = WrMission.class)
    public JAXBElement<String> createWrMissionArgumentDate(String value) {
        return new JAXBElement<String>(_WrMissionsArgumentDate_QNAME, String.class, WrMission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "text", scope = PerturbationMessage.class)
    public JAXBElement<String> createPerturbationMessageText(String value) {
        return new JAXBElement<String>(_PerturbationMessageText_QNAME, String.class, PerturbationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "type", scope = PerturbationMessage.class)
    public JAXBElement<String> createPerturbationMessageType(String value) {
        return new JAXBElement<String>(_GeoPointType_QNAME, String.class, PerturbationMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "ambiguityMessage", scope = WrDirections.class)
    public JAXBElement<String> createWrDirectionsAmbiguityMessage(String value) {
        return new JAXBElement<String>(_WrMissionsAmbiguityMessage_QNAME, String.class, WrDirections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsiv.ratp.fr/xsd", name = "argumentLine", scope = WrDirections.class)
    public JAXBElement<Line> createWrDirectionsArgumentLine(Line value) {
        return new JAXBElement<Line>(_WrMissionsArgumentLine_QNAME, Line.class, WrDirections.class, value);
    }

}
