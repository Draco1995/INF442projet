
package fr.ratp.wsiv;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsivPortType", targetNamespace = "http://wsiv.ratp.fr")
@XmlSeeAlso({
    fr.ratp.wsiv.ObjectFactory.class,
    fr.ratp.wsiv.xsd.ObjectFactory.class
})
public interface WsivPortType {


    /**
     * 
     * @param stationEnd
     * @param station
     * @param direction
     * @param datesEnd
     * @param datesStart
     * @param stationEndLine
     * @return
     *     returns fr.ratp.wsiv.xsd.WrMissions
     */
    @WebMethod(action = "urn:getMissionsFrequency")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getMissionsFrequency", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsFrequency")
    @ResponseWrapper(localName = "getMissionsFrequencyResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsFrequencyResponse")
    public WrMissions getMissionsFrequency(
        @WebParam(name = "station", targetNamespace = "http://wsiv.ratp.fr")
        Station station,
        @WebParam(name = "direction", targetNamespace = "http://wsiv.ratp.fr")
        Direction direction,
        @WebParam(name = "stationEndLine", targetNamespace = "http://wsiv.ratp.fr")
        Station stationEndLine,
        @WebParam(name = "stationEnd", targetNamespace = "http://wsiv.ratp.fr")
        Station stationEnd,
        @WebParam(name = "datesStart", targetNamespace = "http://wsiv.ratp.fr")
        List<String> datesStart,
        @WebParam(name = "datesEnd", targetNamespace = "http://wsiv.ratp.fr")
        List<String> datesEnd);

    /**
     * 
     * @param station
     * @param direction
     * @param date
     * @return
     *     returns fr.ratp.wsiv.xsd.WrMissions
     */
    @WebMethod(action = "urn:getMissionsFirstLast")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getMissionsFirstLast", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsFirstLast")
    @ResponseWrapper(localName = "getMissionsFirstLastResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsFirstLastResponse")
    public WrMissions getMissionsFirstLast(
        @WebParam(name = "station", targetNamespace = "http://wsiv.ratp.fr")
        Station station,
        @WebParam(name = "direction", targetNamespace = "http://wsiv.ratp.fr")
        Direction direction,
        @WebParam(name = "date", targetNamespace = "http://wsiv.ratp.fr")
        String date);

    /**
     * 
     * @return
     *     returns fr.ratp.wsiv.GetVersionResponse
     */
    @WebMethod(action = "urn:getVersion")
    @WebResult(name = "getVersionResponse", targetNamespace = "http://wsiv.ratp.fr", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public GetVersionResponse getVersion();

    /**
     * 
     * @param line
     * @return
     *     returns java.util.List<fr.ratp.wsiv.xsd.Line>
     */
    @WebMethod(action = "urn:getLines")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getLines", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetLines")
    @ResponseWrapper(localName = "getLinesResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetLinesResponse")
    public List<Line> getLines(
        @WebParam(name = "line", targetNamespace = "http://wsiv.ratp.fr")
        Line line);

    /**
     * 
     * @param limit
     * @param sortAlpha
     * @param station
     * @param gp
     * @param distances
     * @return
     *     returns fr.ratp.wsiv.xsd.WrStations
     */
    @WebMethod(action = "urn:getStations")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getStations", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetStations")
    @ResponseWrapper(localName = "getStationsResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetStationsResponse")
    public WrStations getStations(
        @WebParam(name = "station", targetNamespace = "http://wsiv.ratp.fr")
        Station station,
        @WebParam(name = "gp", targetNamespace = "http://wsiv.ratp.fr")
        GeoPoint gp,
        @WebParam(name = "distances", targetNamespace = "http://wsiv.ratp.fr")
        List<Integer> distances,
        @WebParam(name = "limit", targetNamespace = "http://wsiv.ratp.fr")
        Integer limit,
        @WebParam(name = "sortAlpha", targetNamespace = "http://wsiv.ratp.fr")
        Boolean sortAlpha);

    /**
     * 
     * @param limit
     * @param station
     * @param direction
     * @param dateStart
     * @return
     *     returns fr.ratp.wsiv.xsd.WrMissions
     */
    @WebMethod(action = "urn:getMissionsNext")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getMissionsNext", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsNext")
    @ResponseWrapper(localName = "getMissionsNextResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionsNextResponse")
    public WrMissions getMissionsNext(
        @WebParam(name = "station", targetNamespace = "http://wsiv.ratp.fr")
        Station station,
        @WebParam(name = "direction", targetNamespace = "http://wsiv.ratp.fr")
        Direction direction,
        @WebParam(name = "dateStart", targetNamespace = "http://wsiv.ratp.fr")
        String dateStart,
        @WebParam(name = "limit", targetNamespace = "http://wsiv.ratp.fr")
        Integer limit);

    /**
     * 
     * @param line
     * @return
     *     returns fr.ratp.wsiv.xsd.WrDirections
     */
    @WebMethod(action = "urn:getDirections")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getDirections", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetDirections")
    @ResponseWrapper(localName = "getDirectionsResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetDirectionsResponse")
    public WrDirections getDirections(
        @WebParam(name = "line", targetNamespace = "http://wsiv.ratp.fr")
        Line line);

    /**
     * 
     * @param stationSortAlpha
     * @param stationAll
     * @param mission
     * @param date
     * @return
     *     returns fr.ratp.wsiv.xsd.WrMission
     */
    @WebMethod(action = "urn:getMission")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getMission", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMission")
    @ResponseWrapper(localName = "getMissionResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetMissionResponse")
    public WrMission getMission(
        @WebParam(name = "mission", targetNamespace = "http://wsiv.ratp.fr")
        Mission mission,
        @WebParam(name = "date", targetNamespace = "http://wsiv.ratp.fr")
        String date,
        @WebParam(name = "stationAll", targetNamespace = "http://wsiv.ratp.fr")
        Boolean stationAll,
        @WebParam(name = "stationSortAlpha", targetNamespace = "http://wsiv.ratp.fr")
        Boolean stationSortAlpha);

    /**
     * 
     * @param isXmlText
     * @param perturbation
     * @return
     *     returns fr.ratp.wsiv.xsd.WrPerturbations
     */
    @WebMethod(action = "urn:getPerturbations")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getPerturbations", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetPerturbations")
    @ResponseWrapper(localName = "getPerturbationsResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetPerturbationsResponse")
    public WrPerturbations getPerturbations(
        @WebParam(name = "perturbation", targetNamespace = "http://wsiv.ratp.fr")
        Perturbation perturbation,
        @WebParam(name = "isXmlText", targetNamespace = "http://wsiv.ratp.fr")
        Boolean isXmlText);

    /**
     * 
     * @param limit
     * @param gp
     * @return
     *     returns java.util.List<fr.ratp.wsiv.xsd.GeoPoint>
     */
    @WebMethod(action = "urn:getGeoPoints")
    @WebResult(targetNamespace = "http://wsiv.ratp.fr")
    @RequestWrapper(localName = "getGeoPoints", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetGeoPoints")
    @ResponseWrapper(localName = "getGeoPointsResponse", targetNamespace = "http://wsiv.ratp.fr", className = "fr.ratp.wsiv.GetGeoPointsResponse")
    public List<GeoPoint> getGeoPoints(
        @WebParam(name = "gp", targetNamespace = "http://wsiv.ratp.fr")
        GeoPoint gp,
        @WebParam(name = "limit", targetNamespace = "http://wsiv.ratp.fr")
        Integer limit);

}