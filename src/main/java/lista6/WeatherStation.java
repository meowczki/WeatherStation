package lista6;
public class WeatherStation {
  private Coord coord;
  private Weather[] weather;
  private String base;
  private Main main;
  private String visibility;
  private Wind wind;
  private Clouds clouds;
  private String dt;
  private Sys sys;
  private String id;
  private String name;
  private String cod;

  @Override
  public String toString() {
    return main.toString();
  }

  public Coord getCoord() {
    return coord;
  }

  public void setCoord(Coord coord) {
    this.coord = coord;
  }

  public Weather[] getWeather() {
    return weather;
  }

  public void setWeather(Weather[] weather) {
    this.weather = weather;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public Main getMain() {
    return main;
  }

  public void setMain(Main main) {
    this.main = main;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public Wind getWind() {
    return wind;
  }

  public void setWind(Wind wind) {
    this.wind = wind;
  }

  public Clouds getClouds() {
    return clouds;
  }

  public void setClouds(Clouds clouds) {
    this.clouds = clouds;
  }

  public String getDt() {
    return dt;
  }

  public void setDt(String dt) {
    this.dt = dt;
  }

  public Sys getSys() {
    return sys;
  }

  public void setSys(Sys sys) {
    this.sys = sys;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public WeatherStation(Coord coord, Weather[] weather, String base, Main main, String visibility, Wind wind, Clouds clouds, String dt, Sys sys, String id, String name, String cod) {
    this.coord = coord;
    this.weather = weather;
    this.base = base;
    this.main = main;
    this.visibility = visibility;
    this.wind = wind;
    this.clouds = clouds;
    this.dt = dt;
    this.sys = sys;
    this.id = id;
    this.name = name;
    this.cod = cod;
  }
}
